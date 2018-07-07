package ec.edu.espe.arquitectura.universidad.periodolectivo.model;

import ec.edu.espe.arquitectura.universidad.periodolectivo.model.PrlDetalleMatricula;
import ec.edu.espe.arquitectura.universidad.periodolectivo.model.PrlPeriodoLectivo;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-07-07T12:30:32")
@StaticMetamodel(PrlMatricula.class)
public class PrlMatricula_ { 

    public static volatile SingularAttribute<PrlMatricula, String> codMatricula;
    public static volatile SingularAttribute<PrlMatricula, String> pagado;
    public static volatile SingularAttribute<PrlMatricula, String> codPersona;
    public static volatile SingularAttribute<PrlMatricula, BigDecimal> promedio;
    public static volatile SingularAttribute<PrlMatricula, BigDecimal> costoMatricula;
    public static volatile SingularAttribute<PrlMatricula, PrlPeriodoLectivo> codPeriodo;
    public static volatile ListAttribute<PrlMatricula, PrlDetalleMatricula> prlDetalleMatriculaList;

}