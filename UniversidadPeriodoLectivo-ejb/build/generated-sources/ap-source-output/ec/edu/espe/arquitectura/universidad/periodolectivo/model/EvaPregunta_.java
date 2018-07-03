package ec.edu.espe.arquitectura.universidad.periodolectivo.model;

import ec.edu.espe.arquitectura.universidad.periodolectivo.model.EvaCuestionario;
import ec.edu.espe.arquitectura.universidad.periodolectivo.model.EvaRespuestaPregunta;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-07-03T15:40:43")
@StaticMetamodel(EvaPregunta.class)
public class EvaPregunta_ { 

    public static volatile SingularAttribute<EvaPregunta, Integer> codPregunta;
    public static volatile SingularAttribute<EvaPregunta, String> enunciado;
    public static volatile SingularAttribute<EvaPregunta, EvaCuestionario> codCuestionario;
    public static volatile ListAttribute<EvaPregunta, EvaRespuestaPregunta> evaRespuestaPreguntaList;

}