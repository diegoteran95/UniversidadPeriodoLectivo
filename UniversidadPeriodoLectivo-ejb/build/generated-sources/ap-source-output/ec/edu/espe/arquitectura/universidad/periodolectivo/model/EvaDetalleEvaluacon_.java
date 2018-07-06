package ec.edu.espe.arquitectura.universidad.periodolectivo.model;

import ec.edu.espe.arquitectura.universidad.periodolectivo.model.EvaCuestionario;
import ec.edu.espe.arquitectura.universidad.periodolectivo.model.EvaDetalleEvaluaconPK;
import ec.edu.espe.arquitectura.universidad.periodolectivo.model.EvaEvaluacion;
import ec.edu.espe.arquitectura.universidad.periodolectivo.model.EvaRespuestaCuestionario;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-07-06T10:21:03")
@StaticMetamodel(EvaDetalleEvaluacon.class)
public class EvaDetalleEvaluacon_ { 

    public static volatile SingularAttribute<EvaDetalleEvaluacon, BigDecimal> ponderacion;
    public static volatile SingularAttribute<EvaDetalleEvaluacon, EvaCuestionario> evaCuestionario;
    public static volatile ListAttribute<EvaDetalleEvaluacon, EvaRespuestaCuestionario> evaRespuestaCuestionarioList;
    public static volatile SingularAttribute<EvaDetalleEvaluacon, EvaEvaluacion> evaEvaluacion;
    public static volatile SingularAttribute<EvaDetalleEvaluacon, EvaDetalleEvaluaconPK> evaDetalleEvaluaconPK;

}