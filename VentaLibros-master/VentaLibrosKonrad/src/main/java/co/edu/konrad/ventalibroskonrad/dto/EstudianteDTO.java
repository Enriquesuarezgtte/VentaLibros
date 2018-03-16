/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.ventalibroskonrad.dto;

import co.edu.konrad.ventalibroskonrad.entities.EstudianteEntity;
import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.List;

/**
 *DTO para el mapeo objeto relacional de la Entidad Estudiante
 * @author Enrique Suarez
 */
public class EstudianteDTO {
    /*
    Id del Estudiante
    */
    private Long id;
    /*
    Nombre del Estudiante
    */
    private String nombreEstudiante;
    
    /*
    Apellido del Estudiante
    */
    private String apellidoEstudiante;
    
    /*
    Codigo del Estudiante
    */
    private int codigoEstudiante;
    
    /*
    Correo del Estudiante
    */
    private String  correoEstudiante;
    
    /**
     * Constructor por defecto
    */
    public EstudianteDTO(){        
    }
    
    /**
     * Constructor recibiendo como parametro la entidad
     * @param estudianteEntity 
     */
    public EstudianteDTO(EstudianteEntity estudianteEntity){
        this.id = estudianteEntity.getIdEstudiante();
        this.nombreEstudiante= estudianteEntity.getNombreEstudiante();
        this.apellidoEstudiante=estudianteEntity.getApellidoEstudiante();
        this.codigoEstudiante= estudianteEntity.getCodigoEstudiante();
        this.correoEstudiante = estudianteEntity.getCorreoElectronico();
        
    }
    
    /**
     * 
     *Método para mapear a la entidad los datos capturados en la vista
     * @return  objeto de tipo EstudianteEntity
     */
    public EstudianteEntity toEntity(){
        EstudianteEntity estudiante = new EstudianteEntity();
        
        estudiante.setIdEstudiante(this.id);
        estudiante.setNombreEstudiante(this.nombreEstudiante);
        estudiante.setApellidoEstudiante(this.apellidoEstudiante);
        estudiante.setCorreoElectronico(this.correoEstudiante);
        estudiante.setCodigoEstudiante(this.codigoEstudiante);
        return estudiante;
    }
    
    
    /**
     * Conversión masiva de EstudianteEntity a EstudianteDTO 
     * @param estudianteList
     * @return Lista Estudiante DTO
     */
    public List<EstudianteDTO> toEstudianteList(List<EstudianteEntity> estudianteList){
        List<EstudianteDTO> listaEstudianteDTO = new VirtualFlow.ArrayLinkedList<>();
        for (int i = 0; i < estudianteList.size(); i++) {            
            listaEstudianteDTO.add(new EstudianteDTO(estudianteList.get(i)));
        }
        return listaEstudianteDTO;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public String getApellidoEstudiante() {
        return apellidoEstudiante;
    }

    public void setApellidoEstudiante(String apellidoEstudiante) {
        this.apellidoEstudiante = apellidoEstudiante;
    }

    public int getCodigoEstudiante() {
        return codigoEstudiante;
    }

    public void setCodigoEstudiante(int codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }

    public String getCorreoEstudiante() {
        return correoEstudiante;
    }

    public void setCorreoEstudiante(String correoEstudiante) {
        this.correoEstudiante = correoEstudiante;
    }
    
}
