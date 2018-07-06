package ec.edu.espe.arquitectura.universidad.periodolectivo.model;

import ec.edu.espe.arquitectura.universidad.periodolectivo.model.EvaDetalleEvaluacon;
import ec.edu.espe.arquitectura.universidad.periodolectivo.model.EvaResultadoEvaluacion;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-07-06T10:21:03")
@StaticMetamodel(EvaEvaluacion.class)
public class EvaEvaluacion_ { 

    public static volatile SingularAttribute<EvaEvaluacion, String> descripcion;
    public static volatile ListAttribute<EvaEvaluacion, EvaDetalleEvaluacon> evaDetalleEvaluaconList;
    public static volatile SingularAttribute<EvaEvaluacion, String> codEvaluacion;
    public static volatile ListAttribute<EvaEvaluacion, EvaResultadoEvaluacion> evaResultadoEvaluacionList;

}