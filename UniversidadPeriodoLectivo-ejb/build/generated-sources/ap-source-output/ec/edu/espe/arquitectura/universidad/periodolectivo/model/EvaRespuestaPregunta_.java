package ec.edu.espe.arquitectura.universidad.periodolectivo.model;

import ec.edu.espe.arquitectura.universidad.periodolectivo.model.EvaPregunta;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-07-03T15:40:43")
@StaticMetamodel(EvaRespuestaPregunta.class)
public class EvaRespuestaPregunta_ { 

    public static volatile SingularAttribute<EvaRespuestaPregunta, String> codPersona;
    public static volatile SingularAttribute<EvaRespuestaPregunta, Integer> codRegistroRespuestas;
    public static volatile SingularAttribute<EvaRespuestaPregunta, EvaPregunta> codPregunta;
    public static volatile SingularAttribute<EvaRespuestaPregunta, Integer> respuesta;

}