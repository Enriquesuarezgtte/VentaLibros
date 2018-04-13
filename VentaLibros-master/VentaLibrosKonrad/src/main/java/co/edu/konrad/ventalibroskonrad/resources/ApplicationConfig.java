/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.ventalibroskonrad.resources;

import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 *Registra el inventario de todos los recursos de la aplicacion
 * @author Enrique Suarez.
 */
@ApplicationPath("api")
public class ApplicationConfig extends Application{
    
    /*
    HashSeTUSADO PARA almacenar el lisado de recursos   
    */        
    @Override
    public Set<Class<?>> getClasses(){
        Set<Class<?>> resources = new HashSet<Class<?>>();
        addResourceClasses(resources);
        return resources;
    }
    
    /*
    Agrega el hashset los recursos creados en la aplicacinn
    */
    public void addResourceClasses(Set<Class<?>> resources){
        resources.add(EstudianteResource.class);
    }
}
