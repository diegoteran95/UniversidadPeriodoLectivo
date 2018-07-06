package ec.edu.espe.arquitectura.universidad.periodolectivo.model;

import ec.edu.espe.arquitectura.universidad.periodolectivo.model.EfhHorario;
import ec.edu.espe.arquitectura.universidad.periodolectivo.model.EfhUbicacion;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-07-06T10:21:03")
@StaticMetamodel(EfhUbicacion.class)
public class EfhUbicacion_ { 

    public static volatile SingularAttribute<EfhUbicacion, String> descripcion;
    public static volatile ListAttribute<EfhUbicacion, EfhUbicacion> efhUbicacionList;
    public static volatile ListAttribute<EfhUbicacion, EfhHorario> efhHorarioList;
    public static volatile SingularAttribute<EfhUbicacion, String> codUbicacion;
    public static volatile SingularAttribute<EfhUbicacion, EfhUbicacion> codUbicacionPadre;

}