/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.ventalibroskonrad.persistence;

import co.edu.konrad.ventalibroskonrad.entities.LibroEntity;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 * Manejador de la entidad Libro
 * @author Cindy H.
 */
@Stateless
public class LibroPersistence {
    
    @PersistenceContext(unitName = "ventasPU")
    protected EntityManager em;
    
    /**
     * Obtener la lista con los datos de la tabla Libro
     * @return Lista de datos de la tabla Libro
     */
    public List<LibroEntity> findAll(){
        Query todos = em.createQuery("select e from LibroEntity e");
        return todos.getResultList();
    }
    
    /**
     * Encontrar una tupla especifica de la tabla Libro
     * @param id que se desea buscar
     * @return libroEntity
     */
    public LibroEntity find(Long id){
        LibroEntity libro = em.find(LibroEntity.class, id);
        return libro;
    }
    
    /**
     * Creacion de un nuevo libro
     * @param libro
     * @return nuevo libro creado
     */
    public LibroEntity create(LibroEntity libro){
        em.persist(libro);
        return libro;
    }
    
    /**
     * Actualizacion de una tupla de la tabla Libro
     * @param libroActualizar
     * @return libro actualizado
     */
    public LibroEntity update (LibroEntity libroActualizar){
        return em.merge(libroActualizar);
    }
    
    /**
     * Elimina una tupla libro de la tabla
     * @param id 
     */
    public void delete (Long id){
        LibroEntity libroDelete = em.find(LibroEntity.class, id);
        em.remove(libroDelete);
    }
}
