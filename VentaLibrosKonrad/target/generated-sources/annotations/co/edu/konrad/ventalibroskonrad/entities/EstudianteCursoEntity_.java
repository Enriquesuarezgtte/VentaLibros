package co.edu.konrad.ventalibroskonrad.entities;

import co.edu.konrad.ventalibroskonrad.entities.CursoEntity;
import co.edu.konrad.ventalibroskonrad.entities.EstudianteEntity;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-16T08:37:55")
@StaticMetamodel(EstudianteCursoEntity.class)
public class EstudianteCursoEntity_ { 

    public static volatile SingularAttribute<EstudianteCursoEntity, Integer> periodo;
    public static volatile SingularAttribute<EstudianteCursoEntity, CursoEntity> curso;
    public static volatile SingularAttribute<EstudianteCursoEntity, EstudianteEntity> estudianteEntity;
    public static volatile SingularAttribute<EstudianteCursoEntity, Long> idEstudianteCurso;

}