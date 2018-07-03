package ec.edu.espe.arquitectura.universidad.periodolectivo.model;

import ec.edu.espe.arquitectura.universidad.periodolectivo.model.OrgCarrera;
import ec.edu.espe.arquitectura.universidad.periodolectivo.model.OrgDetalleMalla;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-07-03T15:40:42")
@StaticMetamodel(OrgMalla.class)
public class OrgMalla_ { 

    public static volatile ListAttribute<OrgMalla, OrgDetalleMalla> orgDetalleMallaList;
    public static volatile SingularAttribute<OrgMalla, String> codMalla;
    public static volatile SingularAttribute<OrgMalla, Date> fechaVigencia;
    public static volatile SingularAttribute<OrgMalla, OrgCarrera> codCarrera;
    public static volatile SingularAttribute<OrgMalla, Date> fechaElaboracion;

}