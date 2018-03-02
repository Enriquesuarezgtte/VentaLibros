/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.ventalibroskonrad.entities;

/**
 *Clase para modelar la Entidad Curso
 * @author EnriqueS
 */
@Entity (name="Curso")
public class CursoEntity implements Serializable{
     /*
    Atributo estático para el manejo de versiones de la entidad
    */
    private static final long serialVersionUIC=1L;
    
    
    /**
    *Llave primaria de la Entidad Curso 
    **/
    @Id
    @Column(name="id_curso", unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idcurso;
    
    
    
    /**
     * Variable que almacena el nombre del curso
     */    
    @Column(name="nombre_curso")
    private String nombreCurso;
    
     /*
    Variable que almacena el numero de la seccion
    */
    @Column (name="numero_seccion")
    private int numeroSeccion;
    
     /*
    Variable que almacena el numero del semestre 
    */
    @Column (name="semestre")
    private int semestre;

         
    /**
     * Metodos GET Y SET
     */
    
    public Long getIdcurso() {
        return idcurso;
    }

    public void setIdcurso(Long idcurso) {
        this.idcurso = idcurso;
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
