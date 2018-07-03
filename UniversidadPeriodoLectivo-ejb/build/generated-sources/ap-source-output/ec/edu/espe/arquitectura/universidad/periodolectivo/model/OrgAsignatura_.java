package ec.edu.espe.arquitectura.universidad.periodolectivo.model;

import ec.edu.espe.arquitectura.universidad.periodolectivo.enums.OrgAsignaturaEnum;
import ec.edu.espe.arquitectura.universidad.periodolectivo.model.OrgDepartamento;
import ec.edu.espe.arquitectura.universidad.periodolectivo.model.OrgDetalleMalla;
import ec.edu.espe.arquitectura.universidad.periodolectivo.model.PrlNrc;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-07-03T15:40:43")
@StaticMetamodel(OrgAsignatura.class)
public class OrgAsignatura_ { 

    public static volatile SingularAttribute<OrgAsignatura, String> codAsignatura;
    public static volatile SingularAttribute<OrgAsignatura, String> descripcion;
    public static volatile ListAttribute<OrgAsignatura, OrgDetalleMalla> orgDetalleMallaList;
    public static volatile SingularAttribute<OrgAsignatura, OrgAsignaturaEnum> estado;
    public static volatile SingularAttribute<OrgAsignatura, OrgDepartamento> codDepartamento;
    public static volatile SingularAttribute<OrgAsignatura, Short> numCreditos;
    public static volatile ListAttribute<OrgAsignatura, PrlNrc> prlNrcList;
    public static volatile SingularAttribute<OrgAsignatura, String> nombre;

}