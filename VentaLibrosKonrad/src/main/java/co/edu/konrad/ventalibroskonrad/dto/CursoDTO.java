/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.ventalibroskonrad.dto;

import co.edu.konrad.ventalibroskonrad.entities.CursoEntity;

/**
 *
 * @author CISCO
 */
public class CursoDTO {
    
    /*
    Id del Curso
    */
    private Long id;
    /**
     * Nombre del Curso
     */
    private String nombreCurso;
    
    /**
     * Numero de Seccion del Curso
     */
    private int numeroSeccion;
    
    /**
     * Número de Semestre del Curso
     */
    private int semestre;
    
    
    private CursoDTO(){
        
    }
    
    /**
     * Constructor manejando como parametro la entidad para realizar la conversion
     * @param curso -entidad
     */
    
    public CursoDTO(CursoEntity curso){
        this.id = curso.getIdCurso();
        this.nombreCurso = curso.getNombreCurso();
        this.numeroSeccion = curso.getNumeroSeccion();
        this.semestre = curso.getSemestre();
        
    }
    
    
    
    public CursoEntity toEntity(){
        
        CursoEntity curso = new CursoEntity();
        curso.setIdCurso(this.id);
        curso.setNombreCurso(this.nombreCurso);
        curso.setNumeroSeccion(this.numeroSeccion);
        curso.setSemestre(this.semestre);
        
        return curso;
    }
}
