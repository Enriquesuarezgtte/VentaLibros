/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.ventalibroskonrad.persistence;

import co.edu.konrad.ventalibroskonrad.entities.EstudianteEntity;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *Manejador de la entidad Estudiante
 * @author Enrique Suarez Guette
 */

@Stateless 
public class EstudiantePersistence {
   /**
    * Designamos el entity manager y el archivo de su conexion con la bd
    */
    
    @PersistenceContext(unitName = "ventasPU")
    protected EntityManager em;
   /**
    * Obtener la lista con los datos de la tabla Estudiante    
    * @return Lista de datos de la tabla Estudiante
    */
    public List<EstudianteEntity> findAll(){
      Query todos = em.createQuery("select e from EstudianteEntity e");
     return todos.getResultList();
        
    }
    
    /**
     * Buscar una tupla especifica de la tabla Estudiante
     * @param id del estudiante que queremos buscar
     * @return estudiante 
     */
    public EstudianteEntity find(Long id){
        EstudianteEntity estudiante = em.find(EstudianteEntity.class, id);
        
        return estudiante;
    }
    
    /**
     * Creacion de un nuevo estudiante
     * @param estudiante
     * @return nuevo estudiante
     */    
    public EstudianteEntity create(EstudianteEntity estudiante){
        em.persist(estudiante);
        return estudiante;
    }
    
    /**
     * Actualizacion de datos de estudiante
     * @param estudianteUpdate
     * @return estudiante actualizado
     */
    public EstudianteEntity update (EstudianteEntity estudianteUpdate){
        return em.merge(estudianteUpdate);
        
    }
    /**
     * Elimina una tupla de la tabla Estudiante
     * @param id 
     */
    public void delete(Long id){
        EstudianteEntity estudianteEntity = em.find(EstudianteEntity.class, id);
        em.remove(estudianteEntity);
    }
    
    
    
}
