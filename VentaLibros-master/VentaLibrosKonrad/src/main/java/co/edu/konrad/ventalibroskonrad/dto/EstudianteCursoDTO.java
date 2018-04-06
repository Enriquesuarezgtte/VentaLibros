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
 * @author Enrique Suarez
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
        this.id=ec.getIdEstudianteCurso();
        if(ec.getEstudianteEntity()!=null){
            EstudianteEntity es = new EstudianteEntity();
            es.setIdEstudiante(ec.getEstudianteEntity().getIdEstudiante());
            es.setApellidoEstudiante(ec.getEstudianteEntity().getApellidoEstudiante());
            es.setCodigoEstudiante(ec.getEstudianteEntity().getCodigoEstudiante());
            es.setNombreEstudiante(ec.getEstudianteEntity().getNombreEstudiante());
            es.setCorreoElectronico(ec.getEstudianteEntity().getCorreoElectronico());
            this.estudiante=new EstudianteDTO(es);                        
        }
        if(ec.getCurso() !=null){
            CursoEntity curso = new CursoEntity();
            curso.setIdCurso(ec.getCurso().getIdCurso());
            curso.setNombreCurso(ec.getCurso().getNombreCurso());
            curso.setNumeroSeccion(ec.getCurso().getNumeroSeccion());
            curso.setSemestre(ec.getCurso().getSemestre());
            this.curso= new CursoDTO(curso);
        }
    }
    
    /**
     * Metodo que realiza el mapeo objeto relacional
     * @return entidad EstudianteCurso
     */
    public EstudianteCursoEntity toEntity(){
       EstudianteCursoEntity ece = new EstudianteCursoEntity();
       ece.setIdEstudianteCurso(this.id);
       if(this.estudiante !=null){
           EstudianteEntity estudiante = new EstudianteEntity();
           estudiante.setIdEstudiante(this.estudiante.getId());
           estudiante.setNombreEstudiante(this.estudiante.getNombreEstudiante());
           estudiante.setApellidoEstudiante(this.estudiante.getApellidoEstudiante());
           estudiante.setCodigoEstudiante(this.estudiante.getCodigoEstudiante());
           estudiante.setCorreoElectronico(this.estudiante.getCorreoEstudiante());           
       ece.setEstudianteEntity(estudiante);
       }
       if(this.curso!=null){
           CursoEntity curs = new CursoEntity();
           curs.setIdCurso(this.curso.getId());
           curs.setNombreCurso(this.curso.getNombreCurso());
           curs.setNumeroSeccion(this.curso.getNumeroSeccion());
           curs.setSemestre(this.curso.getSemestre());
           ece.setCurso(curs);
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
    
    
    
}
