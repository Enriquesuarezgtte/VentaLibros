/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.ventalibroskonrad.resources;

import co.edu.konrad.ventalibroskonrad.dto.EstudianteDTO;
import co.edu.konrad.ventalibroskonrad.entities.EstudianteEntity;
import co.edu.konrad.ventalibroskonrad.logic.EstudianteLogic;
import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *Recurso/Servicio REST para manejo de Estudiantes
 * @author Enrique Suarez
 */
@Path("/estudiantes")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class EstudianteResource {
    
    @Inject
   private EstudianteLogic estudianteLogic;
    
    /**
     * Metodo HTTP-GET para obtener la lista de todos los estudiantes
     * @return 
     */
    @GET
    public List<EstudianteDTO> getEstudianteList(){
        List<EstudianteEntity> estudiantes = estudianteLogic.obtenerEstudiantes();
        EstudianteDTO estudianteDTO = new EstudianteDTO();
        return estudianteDTO.toEstudianteList(estudiantes);              
    }
    
    /**
     * Metodo HTTP-GET para obtener un estudiante a través de id
     * Hace uso de parametro, se usan las anotaciones @Path para personalizar
     * la ruta de acceso, y @PathParam para inidicar cual es el parametro.
     * En el @Path es necesario determinar una expresion reguklar que defina el tipo 
     * de caracteres que pueden ingresar en la URI par al parametro configurado. 
     * @param id
     * @return 
     */
    @GET
    @Path("{id: \\d+}")
    public EstudianteDTO getEstudiante(@PathParam("id") Long id){
        EstudianteEntity estudianteEntity = estudianteLogic.obtenerEstudiante(id);
        if(estudianteEntity ==null){
            throw new RuntimeException("El estudiante solicitado no existe.");
        }
        
        return new EstudianteDTO(estudianteEntity);
    }
    
    
    /**
     * Metodo HTTP -POST para crear un nuevo Estudiante
     * @param estudianteDTO
     * @return estudianteDTO
     */
    @POST    
    public EstudianteDTO createEstudianteDTO(EstudianteDTO estudianteDTO){
        return new EstudianteDTO(estudianteLogic.crearEstudiante(estudianteDTO.toEntity()));
    }
    
    /**
     * Metodo HTTP -PUT que permite actualizar un objeto estudiante.
     * OJO: El nombre del parámetro personalizado en el @Path y el @PathParam deben ser 
     * IGUALES.
     * @param id
     * @param estudianteDTO
     * @return 
     */
    @PUT
    @Path("{id: \\d+}")
    public EstudianteDTO updateEstudianteDTO(@PathParam("id") Long id, EstudianteDTO estudianteDTO){
        EstudianteEntity estudianteEntity = estudianteLogic.obtenerEstudiante(id);
        if(estudianteEntity==null){
            throw new RuntimeException("El estudiante solicitado no existe.");
        }
        return new EstudianteDTO(estudianteLogic.actualizarEstudiante(estudianteDTO.toEntity(), id));
               
    }
    
    /**
     * Metodo HTTP-DELETE usado para eliminar un objeto de tipo Estudiante
     * @param id 
     */
    @DELETE
    @Path("{estudianteId: \\d+")
    public void deleteEstudiante(@PathParam("estudianteId") Long id){
        EstudianteEntity estudianteEntity = estudianteLogic.obtenerEstudiante(id);
        if(estudianteEntity==null){
            throw  new RuntimeException("El estudiante solicitado no existe.");            
        }
        estudianteLogic.eliminarEstudiante(id);
    }
}
