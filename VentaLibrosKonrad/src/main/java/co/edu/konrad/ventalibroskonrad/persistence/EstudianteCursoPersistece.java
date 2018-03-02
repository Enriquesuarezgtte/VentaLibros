/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.ventalibroskonrad.persistence;

import co.edu.konrad.ventalibroskonrad.entities.EstudianteCursoEntity;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *Manejador de la Entidad EstudianteCurso
 * @author Enrique Suarez Guette
 */

@Stateless
public class EstudianteCursoPersistece {
    
    @PersistenceContext(unitName = "ventasPU")
    protected EntityManager em;
    /**
     * Método para obtener toda la informacion de la tabla EstudianteCurso
     * @return lista de datos
     */
    private List<EstudianteCursoEntity> findAll(){
        Query todos = em.createQuery("Select ec from EstudianteCursoEntity ec");
        return todos.getResultList();
    }
    /**
     * Metodo para obtener una tupla de EstudianteCurso a partir del id
     * @param id
     * @return  objeto EstudianteCurso encontrado
     */
    private EstudianteCursoEntity find(Long id){
        EstudianteCursoEntity estudianteCurso = em.find(EstudianteCursoEntity.class, id);
        return estudianteCurso;        
    }
    /**
     * Método para crear un nuevo objeto de la tabla EstudianteCurso
     * @param estudianteCursoAgregar
     * @return objeto a agregar
     */
    
    private EstudianteCursoEntity create( EstudianteCursoEntity estudianteCursoAgregar){
        em.persist(estudianteCursoAgregar);
        return estudianteCursoAgregar;
    }
    /**
     * Actualizar informacion de un estudiante
     * @param estudianteCursoUpdate
     * @return estudiante actualizado
     */
    public EstudianteCursoEntity update (EstudianteCursoEntity estudianteCursoUpdate){
            em.merge(estudianteCursoUpdate);
            return estudianteCursoUpdate;
    }
    /**
     * Borrar objeto de un EstudianteCurso buscado por id
     * @param id 
     */
    
    public void delete (Long id){
        EstudianteCursoEntity ecdelete = em.find(EstudianteCursoEntity.class, id);
        em.remove(id);
    }
}
