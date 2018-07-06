package ec.edu.espe.arquitectura.universidad.periodolectivo.model;

import ec.edu.espe.arquitectura.universidad.periodolectivo.model.OrgDepartamento;
import ec.edu.espe.arquitectura.universidad.periodolectivo.model.OrgMalla;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-07-06T10:21:03")
@StaticMetamodel(OrgCarrera.class)
public class OrgCarrera_ { 

    public static volatile SingularAttribute<OrgCarrera, String> descripcion;
    public static volatile SingularAttribute<OrgCarrera, String> codCarrera;
    public static volatile SingularAttribute<OrgCarrera, String> modalidad;
    public static volatile SingularAttribute<OrgCarrera, OrgDepartamento> codDepartamento;
    public static volatile SingularAttribute<OrgCarrera, String> nivel;
    public static volatile ListAttribute<OrgCarrera, OrgMalla> orgMallaList;

}