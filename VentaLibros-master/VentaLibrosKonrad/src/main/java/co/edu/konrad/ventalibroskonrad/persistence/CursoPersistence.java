/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.ventalibroskonrad.persistence;

import co.edu.konrad.ventalibroskonrad.entities.CursoEntity;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 * Manejador de la entidad Curso
 * @author Cindy H.
 */
@Stateless
public class CursoPersistence {
    
    @PersistenceContext(unitName = "ventasPU")
    protected EntityManager em;
    
    /**
     * Obtener la lista con los datos de la tabla Curso
     * @return Lista de datos de la tabla Curso
     */
    public List<CursoEntity> findAll(){
        Query todos = em.createQuery("select e from CursoEntity e");
        return todos.getResultList();
    }
    
    /**
     * Encontrar una tupla especifica de la tabla Curso
     * @param id que se desea buscar
     * @return cursoEntity
     */
    public CursoEntity find(Long id){
        CursoEntity curso = em.find(CursoEntity.class, id);
        return curso;
    }
    
    /**
     * Creacion de un nuevo curso
     * @param curso
     * @return nuevo curso creado
     */
    public CursoEntity create(CursoEntity curso){
        em.persist(curso);
        return curso;
    }
    
    /**
     * Actualizacion de una tupla de la tabla Curso
     * @param cursoActualizar
     * @return curso actualizado
     */
    public CursoEntity update (CursoEntity cursoActualizar){
        return em.merge(cursoActualizar);
    }
    
    /**
     * Elimina una tupla curso de la tabla
     * @param id 
     */
    public void delete (Long id){
        CursoEntity cursoDelete = em.find(CursoEntity.class, id);
        em.remove(cursoDelete);
    }
}
