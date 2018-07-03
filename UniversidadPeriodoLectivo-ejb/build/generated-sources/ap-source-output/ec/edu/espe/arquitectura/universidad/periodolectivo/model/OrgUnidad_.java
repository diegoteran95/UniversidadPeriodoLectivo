package ec.edu.espe.arquitectura.universidad.periodolectivo.model;

import ec.edu.espe.arquitectura.universidad.periodolectivo.model.OrgDepartamento;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-07-03T15:40:43")
@StaticMetamodel(OrgUnidad.class)
public class OrgUnidad_ { 

    public static volatile SingularAttribute<OrgUnidad, String> descripcion;
    public static volatile ListAttribute<OrgUnidad, OrgDepartamento> orgDepartamentoList;
    public static volatile SingularAttribute<OrgUnidad, String> codUnidad;
    public static volatile SingularAttribute<OrgUnidad, String> nombre;

}