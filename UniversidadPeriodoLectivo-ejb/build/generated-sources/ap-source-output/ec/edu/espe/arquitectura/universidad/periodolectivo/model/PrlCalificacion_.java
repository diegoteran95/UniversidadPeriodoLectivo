package ec.edu.espe.arquitectura.universidad.periodolectivo.model;

import ec.edu.espe.arquitectura.universidad.periodolectivo.model.PrlCalificacionPK;
import ec.edu.espe.arquitectura.universidad.periodolectivo.model.PrlDetalleMatricula;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-07-06T10:21:03")
@StaticMetamodel(PrlCalificacion.class)
public class PrlCalificacion_ { 

    public static volatile SingularAttribute<PrlCalificacion, PrlCalificacionPK> prlCalificacionPK;
    public static volatile SingularAttribute<PrlCalificacion, BigDecimal> puntaje;
    public static volatile SingularAttribute<PrlCalificacion, PrlDetalleMatricula> prlDetalleMatricula;

}