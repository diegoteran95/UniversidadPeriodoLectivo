package ec.edu.espe.arquitectura.universidad.periodolectivo.model;

import ec.edu.espe.arquitectura.universidad.periodolectivo.model.EvaEvaluacion;
import ec.edu.espe.arquitectura.universidad.periodolectivo.model.EvaResultadoEvaluacionPK;
import ec.edu.espe.arquitectura.universidad.periodolectivo.model.PrlNrc;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-07-03T15:40:42")
@StaticMetamodel(EvaResultadoEvaluacion.class)
public class EvaResultadoEvaluacion_ { 

    public static volatile SingularAttribute<EvaResultadoEvaluacion, BigDecimal> promedioTotal;
    public static volatile SingularAttribute<EvaResultadoEvaluacion, PrlNrc> prlNrc;
    public static volatile SingularAttribute<EvaResultadoEvaluacion, EvaResultadoEvaluacionPK> evaResultadoEvaluacionPK;
    public static volatile SingularAttribute<EvaResultadoEvaluacion, EvaEvaluacion> evaEvaluacion;

}