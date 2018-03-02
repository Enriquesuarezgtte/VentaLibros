/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.ventalibroskonrad.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Clase para modelar la Entidad Estudiante
 * @author Cindy H.
 */
@Entity (name = "Estudiante")
public class EstudianteEntity implements Serializable {
    
    /**
     * Atributo estático para el manejo de versiones de la entidad
     */
    private static final long serialVersionUID= 1L;

    /**
     * Llave primaria de la Entidad Estudiante
     */
    @Id
    @Column (name = "id_estudiante", unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEstudiante;
    
    /**
     * Variable que almacena el nombre del estudiante
     */
    @Column (name = "nombre_estudiante", nullable = false)
    private String nombreEstudiante;
    
    /**
     * Variable que almacena el apellido del estudiante
     */
    @Column (name = "apellido_estudiante")
    private String apellidoEstudiante;
    
    /**
     * Variable que almacena el correo de contacto del estudiante
     */
    @Column (name = "email")
    private String correoElectronico;
    
    /**
     * Variable que almacena el codigo del estudiante
     * que lo identifica como estudiante de la konrad
     */
    @Column (name = "codigo_estudiante")
    private int codigoEstudiante;
    
    /**
     * Metodos GET Y SET
     */
    
    public Long getIdEstudiante(){
        return idEstudiante;
    }
    
    public void setIdEstudiante(Long idEstudiante){
        this.idEstudiante = idEstudiante;
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

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public int getCodigoEstudiante() {
        return codigoEstudiante;
    }

    public void setCodigoEstudiante(int codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }
    
}
