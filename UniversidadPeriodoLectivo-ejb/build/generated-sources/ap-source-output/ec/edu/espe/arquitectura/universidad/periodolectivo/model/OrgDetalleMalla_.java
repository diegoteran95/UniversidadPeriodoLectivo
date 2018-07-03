package ec.edu.espe.arquitectura.universidad.periodolectivo.model;

import ec.edu.espe.arquitectura.universidad.periodolectivo.model.OrgAsignatura;
import ec.edu.espe.arquitectura.universidad.periodolectivo.model.OrgMalla;
import ec.edu.espe.arquitectura.universidad.periodolectivo.model.OrgPrerrequisito;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-07-03T15:40:42")
@StaticMetamodel(OrgDetalleMalla.class)
public class OrgDetalleMalla_ { 

    public static volatile SingularAttribute<OrgDetalleMalla, OrgAsignatura> codAsignatura;
    public static volatile SingularAttribute<OrgDetalleMalla, OrgMalla> codMalla;
    public static volatile ListAttribute<OrgDetalleMalla, OrgPrerrequisito> orgPrerrequisitoList;
    public static volatile SingularAttribute<OrgDetalleMalla, Integer> codDetalleMalla;
    public static volatile ListAttribute<OrgDetalleMalla, OrgPrerrequisito> orgPrerrequisitoList1;
    public static volatile SingularAttribute<OrgDetalleMalla, Short> nivel;

}