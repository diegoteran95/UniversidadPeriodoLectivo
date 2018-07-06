package ec.edu.espe.arquitectura.universidad.periodolectivo.model;

import ec.edu.espe.arquitectura.universidad.periodolectivo.model.EfhHorario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-07-06T10:21:03")
@StaticMetamodel(EfhFranjaHoraria.class)
public class EfhFranjaHoraria_ { 

    public static volatile ListAttribute<EfhFranjaHoraria, EfhHorario> efhHorarioList;
    public static volatile SingularAttribute<EfhFranjaHoraria, String> codFranjaHoraria;
    public static volatile SingularAttribute<EfhFranjaHoraria, Date> finHora;
    public static volatile SingularAttribute<EfhFranjaHoraria, Date> inicioHora;
    public static volatile SingularAttribute<EfhFranjaHoraria, String> dia;

}