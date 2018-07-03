package ec.edu.espe.arquitectura.universidad.periodolectivo.model;

import ec.edu.espe.arquitectura.universidad.periodolectivo.model.OrgAsignatura;
import ec.edu.espe.arquitectura.universidad.periodolectivo.model.OrgCarrera;
import ec.edu.espe.arquitectura.universidad.periodolectivo.model.OrgUnidad;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-07-03T15:40:43")
@StaticMetamodel(OrgDepartamento.class)
public class OrgDepartamento_ { 

    public static volatile SingularAttribute<OrgDepartamento, String> descripcion;
    public static volatile ListAttribute<OrgDepartamento, OrgCarrera> orgCarreraList;
    public static volatile SingularAttribute<OrgDepartamento, String> codDepartamento;
    public static volatile ListAttribute<OrgDepartamento, OrgAsignatura> orgAsignaturaList;
    public static volatile SingularAttribute<OrgDepartamento, OrgUnidad> codUnidad;

}