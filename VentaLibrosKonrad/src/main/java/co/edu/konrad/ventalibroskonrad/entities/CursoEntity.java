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
 * Clase para modelar la Entidad Curso
 * @author Cindy H.
 */
@Entity 
public class CursoEntity implements Serializable {
    
    /**
     * Atributo estático para el manejo de versiones de la entidad
     */
    private static final long serialVersionUID= 1L;

    /**
     * Llave primaria de la Entidad Curso
     */
    @Id
    @Column (name = "id_curso", unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCurso;
    
    /**
     * Variable que almacena el nombre del curso
     */
    @Column (name = "nombre_curso", nullable = false)
    private String nombreCurso;
    
    /**
     * Variable que almacena el apellido del curso
     */
    @Column (name = "numero_seccion")
    private int numeroSeccion;
    
    /**
     * Variable que almacena el correo de contacto del curso
     */
    @Column 
    private int semestre;

    /**
     * Metodos GET Y SET
     */
    
    public Long getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(Long idCurso) {
        this.idCurso = idCurso;
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
