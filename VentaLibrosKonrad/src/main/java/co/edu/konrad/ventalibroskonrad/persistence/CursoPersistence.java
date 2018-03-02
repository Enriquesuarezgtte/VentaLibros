/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.ventalibroskonrad.persistence;

import java.util.List;

/**
 *Manejador de la entidad curso
 * 
 * @author EnriqueS
 */


@Stateless 
public class CursoPersistence {
    
    
    /**
    * Designamos el entity manager y el archivo de su conexion con la bd
    */
    
    @PersistenceContext(unitName = "ventasPU")
    protected EntityManager em;
    
    /**
    * Obtener la lista con los datos de la tabla Curso    
    * @return Lista de datos de la tabla Curso
    */    
      public List<CursoEntity> findAll(){
      Query todos = em.createQuery("select c from CursoEntity c");
     return todos.getResultList();        
    }
      
      /**
     * Buscar una tupla especifica de la tabla Curso
     * @param id del curso que queremos buscar
     * @return curso 
     */
     public CursoEntity find(Long id){
        CursoEntity curso = em.find(CursoEntity.class, id);        
        return curso;
    }
     
     /**
     * Creacion de un nuevo curso
     * @param curso
     * @return nuevo curso
     */    
    public CursoEntity create(CursoEntity curso){
        em.persist(curso);
        return curso;
    }
    
    /**
     * Actualizacion de datos de un curso
     * @param cursoUpdate
     * @return curso actualizado
     */
    public CursoEntity update (CursoEntity cursoUpdate){
        return em.merge(cursoUpdate);        
   }
    
    /**
     * Elimina una tupla de la tabla Curso
     * @param id 
     */
    public void delete(Long id){
        CursoEntity cursoEntity = em.find(CursoEntity.class, id);
        em.remove(cursoEntity);
    }
    
    
}
