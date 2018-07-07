package ec.edu.espe.arquitectura.universidad.periodolectivo.model;

import ec.edu.espe.arquitectura.universidad.periodolectivo.model.PrlRestriccionPersona;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-07-07T12:30:32")
@StaticMetamodel(PrlRestriccion.class)
public class PrlRestriccion_ { 

    public static volatile SingularAttribute<PrlRestriccion, String> descripcion;
    public static volatile ListAttribute<PrlRestriccion, PrlRestriccionPersona> prlRestriccionPersonaList;
    public static volatile SingularAttribute<PrlRestriccion, String> codRestriccion;

}