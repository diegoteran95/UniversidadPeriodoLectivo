package ec.edu.espe.arquitectura.universidad.periodolectivo.model;

import ec.edu.espe.arquitectura.universidad.periodolectivo.model.EfhFranjaHoraria;
import ec.edu.espe.arquitectura.universidad.periodolectivo.model.EfhUbicacion;
import ec.edu.espe.arquitectura.universidad.periodolectivo.model.PrlNrc;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-07-06T10:21:03")
@StaticMetamodel(EfhHorario.class)
public class EfhHorario_ { 

    public static volatile SingularAttribute<EfhHorario, PrlNrc> prlNrc;
    public static volatile SingularAttribute<EfhHorario, EfhUbicacion> codUbicacion;
    public static volatile SingularAttribute<EfhHorario, String> codHorario;
    public static volatile SingularAttribute<EfhHorario, EfhFranjaHoraria> codFranjaMatricula;

}