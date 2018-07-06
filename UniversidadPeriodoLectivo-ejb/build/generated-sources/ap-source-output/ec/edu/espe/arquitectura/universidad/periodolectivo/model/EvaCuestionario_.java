package ec.edu.espe.arquitectura.universidad.periodolectivo.model;

import ec.edu.espe.arquitectura.universidad.periodolectivo.model.EvaDetalleEvaluacon;
import ec.edu.espe.arquitectura.universidad.periodolectivo.model.EvaPregunta;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-07-06T10:21:03")
@StaticMetamodel(EvaCuestionario.class)
public class EvaCuestionario_ { 

    public static volatile SingularAttribute<EvaCuestionario, String> estado;
    public static volatile ListAttribute<EvaCuestionario, EvaDetalleEvaluacon> evaDetalleEvaluaconList;
    public static volatile SingularAttribute<EvaCuestionario, String> codCuestionario;
    public static volatile SingularAttribute<EvaCuestionario, Date> fechaCreacion;
    public static volatile ListAttribute<EvaCuestionario, EvaPregunta> evaPreguntaList;

}