package ec.edu.espe.arquitectura.universidad.periodolectivo.model;

import ec.edu.espe.arquitectura.universidad.periodolectivo.enums.PrlPeriodoLectivoEnum;
import ec.edu.espe.arquitectura.universidad.periodolectivo.model.PrlMatricula;
import ec.edu.espe.arquitectura.universidad.periodolectivo.model.PrlNrc;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-07-03T15:40:42")
@StaticMetamodel(PrlPeriodoLectivo.class)
public class PrlPeriodoLectivo_ { 

    public static volatile SingularAttribute<PrlPeriodoLectivo, PrlPeriodoLectivoEnum> estado;
    public static volatile SingularAttribute<PrlPeriodoLectivo, BigDecimal> costoCredito;
    public static volatile SingularAttribute<PrlPeriodoLectivo, Integer> componentesEvaluacion;
    public static volatile SingularAttribute<PrlPeriodoLectivo, Date> fehaInicio;
    public static volatile ListAttribute<PrlPeriodoLectivo, PrlMatricula> prlMatriculaList;
    public static volatile SingularAttribute<PrlPeriodoLectivo, String> codPeriodo;
    public static volatile SingularAttribute<PrlPeriodoLectivo, String> semestre;
    public static volatile ListAttribute<PrlPeriodoLectivo, PrlNrc> prlNrcList;
    public static volatile SingularAttribute<PrlPeriodoLectivo, Date> fechaFin;

}