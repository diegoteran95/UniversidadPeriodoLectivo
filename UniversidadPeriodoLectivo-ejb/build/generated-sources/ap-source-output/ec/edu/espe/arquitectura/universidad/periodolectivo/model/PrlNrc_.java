package ec.edu.espe.arquitectura.universidad.periodolectivo.model;

import ec.edu.espe.arquitectura.universidad.periodolectivo.model.EfhHorario;
import ec.edu.espe.arquitectura.universidad.periodolectivo.model.EvaRespuestaCuestionario;
import ec.edu.espe.arquitectura.universidad.periodolectivo.model.EvaResultadoEvaluacion;
import ec.edu.espe.arquitectura.universidad.periodolectivo.model.OrgAsignatura;
import ec.edu.espe.arquitectura.universidad.periodolectivo.model.PrlDetalleMatricula;
import ec.edu.espe.arquitectura.universidad.periodolectivo.model.PrlNrcPK;
import ec.edu.espe.arquitectura.universidad.periodolectivo.model.PrlPeriodoLectivo;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-07-03T15:40:43")
@StaticMetamodel(PrlNrc.class)
public class PrlNrc_ { 

    public static volatile SingularAttribute<PrlNrc, OrgAsignatura> codAsignatura;
    public static volatile ListAttribute<PrlNrc, EfhHorario> efhHorarioList;
    public static volatile SingularAttribute<PrlNrc, String> codPersona;
    public static volatile SingularAttribute<PrlNrc, PrlNrcPK> prlNrcPK;
    public static volatile SingularAttribute<PrlNrc, PrlPeriodoLectivo> prlPeriodoLectivo;
    public static volatile ListAttribute<PrlNrc, EvaRespuestaCuestionario> evaRespuestaCuestionarioList;
    public static volatile ListAttribute<PrlNrc, PrlDetalleMatricula> prlDetalleMatriculaList;
    public static volatile ListAttribute<PrlNrc, EvaResultadoEvaluacion> evaResultadoEvaluacionList;

}