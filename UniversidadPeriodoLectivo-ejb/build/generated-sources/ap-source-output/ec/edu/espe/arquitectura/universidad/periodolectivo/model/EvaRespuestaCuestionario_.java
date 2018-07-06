package ec.edu.espe.arquitectura.universidad.periodolectivo.model;

import ec.edu.espe.arquitectura.universidad.periodolectivo.model.EvaDetalleEvaluacon;
import ec.edu.espe.arquitectura.universidad.periodolectivo.model.EvaRespuestaCuestionarioPK;
import ec.edu.espe.arquitectura.universidad.periodolectivo.model.PrlNrc;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-07-06T10:21:03")
@StaticMetamodel(EvaRespuestaCuestionario.class)
public class EvaRespuestaCuestionario_ { 

    public static volatile SingularAttribute<EvaRespuestaCuestionario, Date> fecha;
    public static volatile SingularAttribute<EvaRespuestaCuestionario, EvaDetalleEvaluacon> evaDetalleEvaluacon;
    public static volatile SingularAttribute<EvaRespuestaCuestionario, PrlNrc> prlNrc;
    public static volatile SingularAttribute<EvaRespuestaCuestionario, EvaRespuestaCuestionarioPK> evaRespuestaCuestionarioPK;
    public static volatile SingularAttribute<EvaRespuestaCuestionario, BigDecimal> calificacionPromedio;

}