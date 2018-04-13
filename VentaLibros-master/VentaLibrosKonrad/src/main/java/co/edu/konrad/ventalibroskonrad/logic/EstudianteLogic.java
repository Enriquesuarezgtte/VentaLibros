/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.ventalibroskonrad.logic;

import co.edu.konrad.ventalibroskonrad.entities.EstudianteEntity;
import co.edu.konrad.ventalibroskonrad.persistence.EstudiantePersistence;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 * Clase que contiene la logica del Estudiante
 * @author Cindy H.
 */
@Stateless
public class EstudianteLogic {
    
    /**
     * Inyección del persistence de estudiante
     */
    @Inject 
    private EstudiantePersistence estudiantePersistence;
    
    /**
     * Obtener todos los estudiantes
     * @return Lista Estudiante
     */
    public List<EstudianteEntity> obtenerEstudiantes(){
        List<EstudianteEntity> estudiantes = estudiantePersistence.findAll();
        return estudiantes;
    }
    
    /**
     * Obtener un estudiante a partir del id
     * @param id
     * @return estudiante encontrado
     */
    public EstudianteEntity obtenerEstudiante(Long id){
        EstudianteEntity estudiante = estudiantePersistence.find(id);
        if(estudiante == null){
            throw new IllegalArgumentException("Estudiante solicitado no existe.");
        }
        return estudiante;
    }
    
    /**
     * Crear un nuevo estudiante
     * @param estEntity
     * @return estEntity
     */
    public EstudianteEntity crearEstudiante(EstudianteEntity estEntity){
        estudiantePersistence.create(estEntity);
        return estEntity;
    }
    
    /**
     * Actualiza un estudiante - Pilas cn el parametro id O-O
     * @param estEntity
     * @param id
     * @return estudiante actualizado
     */
    public EstudianteEntity actualizarEstudiante(EstudianteEntity estEntity, Long id){
        EstudianteEntity estudiante = estudiantePersistence.update(estEntity);
        return estudiante;
    }
    
    /**
     * Elimina un estudiante
     * @param id 
     */
    public void eliminarEstudiante(Long id){
        estudiantePersistence.delete(id);
    }
}
