package ec.edu.espe.arquitectura.universidad.periodolectivo.model;

import ec.edu.espe.arquitectura.universidad.periodolectivo.enums.PrlDetalleMatriculaEnum;
import ec.edu.espe.arquitectura.universidad.periodolectivo.model.PrlCalificacion;
import ec.edu.espe.arquitectura.universidad.periodolectivo.model.PrlDetalleMatriculaPK;
import ec.edu.espe.arquitectura.universidad.periodolectivo.model.PrlMatricula;
import ec.edu.espe.arquitectura.universidad.periodolectivo.model.PrlNrc;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-07-03T15:40:43")
@StaticMetamodel(PrlDetalleMatricula.class)
public class PrlDetalleMatricula_ { 

    public static volatile SingularAttribute<PrlDetalleMatricula, PrlMatricula> prlMatricula;
    public static volatile SingularAttribute<PrlDetalleMatricula, PrlNrc> prlNrc;
    public static volatile SingularAttribute<PrlDetalleMatricula, BigDecimal> costoNrc;
    public static volatile SingularAttribute<PrlDetalleMatricula, PrlDetalleMatriculaEnum> aprobacionNrc;
    public static volatile ListAttribute<PrlDetalleMatricula, PrlCalificacion> prlCalificacionList;
    public static volatile SingularAttribute<PrlDetalleMatricula, PrlDetalleMatriculaPK> prlDetalleMatriculaPK;

}