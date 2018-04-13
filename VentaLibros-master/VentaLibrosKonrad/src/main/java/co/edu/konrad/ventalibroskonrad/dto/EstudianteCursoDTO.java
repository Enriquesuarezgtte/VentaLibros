/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.ventalibroskonrad.dto;

import co.edu.konrad.ventalibroskonrad.entities.CursoEntity;
import co.edu.konrad.ventalibroskonrad.entities.EstudianteCursoEntity;
import co.edu.konrad.ventalibroskonrad.entities.EstudianteEntity;

/**
 * DTO para el mapeo objeto relacional de la Entidad EstudianteCurso
 * @author Cindy H.
 */
public class EstudianteCursoDTO {
    
    private Long id;
    
    private EstudianteDTO estudiante;
    
    private CursoDTO curso;
    
    private int periodo;

    /**
     * Constructor por defecto
     */
    public EstudianteCursoDTO() {
    }
    
    /**
     * Constructor que permite realizar el mapeo entidad a objeto
     * @param ec 
     */
    public EstudianteCursoDTO(EstudianteCursoEntity ec) {
        this.id = ec.getIdEstudianteCurso();
        if(ec.getEstudianteEntity() != null){
            EstudianteEntity estudiante = new EstudianteEntity();
            estudiante.setIdEstudiante(ec.getEstudianteEntity().getIdEstudiante());
            estudiante.setNombreEstudiante(ec.getEstudianteEntity().getNombreEstudiante());
            estudiante.setApellidoEstudiante(ec.getEstudianteEntity().getApellidoEstudiante());
            estudiante.setCodigoEstudiante(ec.getEstudianteEntity().getCodigoEstudiante());
            estudiante.setCorreoElectronico(ec.getEstudianteEntity().getCorreoElectronico());
            this.estudiante = new EstudianteDTO(estudiante);
        }
        if(ec.getCurso() != null){
            CursoEntity curso = new CursoEntity();
            curso.setIdCurso(ec.getCurso().getIdCurso());
            curso.setNombreCurso(ec.getCurso().getNombreCurso());
            curso.setNumeroSeccion(ec.getCurso().getNumeroSeccion());
            curso.setSemestre(ec.getCurso().getSemestre());
            this.curso = new CursoDTO(curso);
        }
    }
    
    /**
     * Metodo que realiza el mapeo objeto relacional
     * @return entidad EstudianteCurso
     */
    public EstudianteCursoEntity toEntity(){
       EstudianteCursoEntity ece = new EstudianteCursoEntity();
       ece.setIdEstudianteCurso(this.id);
       if(this.estudiante != null){
           EstudianteEntity estudiante = new EstudianteEntity();
           estudiante.setIdEstudiante(this.estudiante.getId());
           estudiante.setNombreEstudiante(this.estudiante.getNombreEstudiante());
           estudiante.setApellidoEstudiante(this.estudiante.getApellidoEstudiante());
           estudiante.setCodigoEstudiante(this.estudiante.getCodigoEstudiante());
           estudiante.setCorreoElectronico(this.estudiante.getCorreoEstudiante());
           ece.setEstudianteEntity(estudiante);
       }
       if(this.curso != null){
           CursoEntity curso = new CursoEntity();
           curso.setIdCurso(this.curso.getId());
           curso.setNombreCurso(this.curso.getNombreCurso());
           curso.setNumeroSeccion(this.curso.getNumeroSeccion());
           curso.setSemestre(this.curso.getSemestre());
           ece.setCurso(curso);
       }
       return ece;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public EstudianteDTO getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(EstudianteDTO estudiante) {
        this.estudiante = estudiante;
    }

    public CursoDTO getCurso() {
        return curso;
    }

    public void setCurso(CursoDTO curso) {
        this.curso = curso;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }
    
    
    
    
    
}
