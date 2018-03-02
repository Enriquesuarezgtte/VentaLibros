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
 * Clase para modelar la Entidad Libro
 * @author Cindy H.
 */
@Entity 
public class LibroEntity implements Serializable {
    
    /**
     * Atributo estático para el manejo de versiones de la entidad
     */
    private static final long serialVersionUID= 1L;

    /**
     * Llave primaria de la Entidad Libro
     */
    @Id
    @Column (name = "id_libro", unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idLibro;
    
    /**
     * Variable que almacena el nombre del libro
     */
    @Column (name = "nombre_libro", nullable = false)
    private String nombreLibro;
    
    /**
     * Variable que almacena el apellido del libro
     */
    @Column (name = "autor_libro")
    private String autorLibro;
    
    /**
     * Variable que almacena el correo de contacto del libro
     */
    @Column 
    private int precio;

    /**
     * Metodos GET Y SET
     */
    
    public Long getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(Long idLibro) {
        this.idLibro = idLibro;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public String getAutorLibro() {
        return autorLibro;
    }

    public void setAutorLibro(String autorLibro) {
        this.autorLibro = autorLibro;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

}
