/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.ventalibroskonrad.dto;

import co.edu.konrad.ventalibroskonrad.entities.CursoEntity;

/**
 * DTO para el mapeo objeto relacional de la Entidad Curso
 * @author Cindy H.
 */
public class CursoDTO {
    
    private Long id;
    
    private String nombreCurso;
    
    private int numeroSeccion;
    
    private int semestre;

    /**
     * Constructor por defecto
     */
    public CursoDTO() {
    }
    
    /**
     * Constructor manejando como parametro la entidad para realizar la conversión
     * @param curso - entidad
     */
    public CursoDTO(CursoEntity curso){
        this.id = curso.getIdCurso();
        this.nombreCurso = curso.getNombreCurso();
        this.numeroSeccion = curso.getNumeroSeccion();
        this.semestre = curso.getSemestre();
    }
    
    /**
     * Metodo que realiza la conversión de objeto a entidad
     * @return entidad
     */
    public CursoEntity toEntity(){
        CursoEntity curso = new CursoEntity();
        curso.setIdCurso(this.id);
        curso.setNombreCurso(this.nombreCurso);
        curso.setNumeroSeccion(this.numeroSeccion);
        curso.setSemestre(this.semestre);
        return curso;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getNumeroSeccion() {
        return numeroSeccion;
    }

    public void setNumeroSeccion(int numeroSeccion) {
        this.numeroSeccion = numeroSeccion;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    
    
}
