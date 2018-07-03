/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arquitectura.universidad.periodolectivo.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author diego
 */
@Entity
@Table(name = "EVA_DETALLE_EVALUACON")
@NamedQueries({
    @NamedQuery(name = "EvaDetalleEvaluacon.findAll", query = "SELECT e FROM EvaDetalleEvaluacon e")})
public class EvaDetalleEvaluacon implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EvaDetalleEvaluaconPK evaDetalleEvaluaconPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PONDERACION")
    private BigDecimal ponderacion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "evaDetalleEvaluacon", fetch = FetchType.LAZY)
    private List<EvaRespuestaCuestionario> evaRespuestaCuestionarioList;
    @JoinColumn(name = "COD_CUESTIONARIO", referencedColumnName = "COD_CUESTIONARIO", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private EvaCuestionario evaCuestionario;
    @JoinColumn(name = "COD_EVALUACION", referencedColumnName = "COD_EVALUACION", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private EvaEvaluacion evaEvaluacion;

    public EvaDetalleEvaluacon() {
    }

    public EvaDetalleEvaluacon(EvaDetalleEvaluaconPK evaDetalleEvaluaconPK) {
        this.evaDetalleEvaluaconPK = evaDetalleEvaluaconPK;
    }

    public EvaDetalleEvaluacon(String codEvaluacion, String codCuestionario) {
        this.evaDetalleEvaluaconPK = new EvaDetalleEvaluaconPK(codEvaluacion, codCuestionario);
    }

    public EvaDetalleEvaluaconPK getEvaDetalleEvaluaconPK() {
        return evaDetalleEvaluaconPK;
    }

    public void setEvaDetalleEvaluaconPK(EvaDetalleEvaluaconPK evaDetalleEvaluaconPK) {
        this.evaDetalleEvaluaconPK = evaDetalleEvaluaconPK;
    }

    public BigDecimal getPonderacion() {
        return ponderacion;
    }

    public void setPonderacion(BigDecimal ponderacion) {
        this.ponderacion = ponderacion;
    }

    public List<EvaRespuestaCuestionario> getEvaRespuestaCuestionarioList() {
        return evaRespuestaCuestionarioList;
    }

    public void setEvaRespuestaCuestionarioList(List<EvaRespuestaCuestionario> evaRespuestaCuestionarioList) {
        this.evaRespuestaCuestionarioList = evaRespuestaCuestionarioList;
    }

    public EvaCuestionario getEvaCuestionario() {
        return evaCuestionario;
    }

    public void setEvaCuestionario(EvaCuestionario evaCuestionario) {
        this.evaCuestionario = evaCuestionario;
    }

    public EvaEvaluacion getEvaEvaluacion() {
        return evaEvaluacion;
    }

    public void setEvaEvaluacion(EvaEvaluacion evaEvaluacion) {
        this.evaEvaluacion = evaEvaluacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (evaDetalleEvaluaconPK != null ? evaDetalleEvaluaconPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EvaDetalleEvaluacon)) {
            return false;
        }
        EvaDetalleEvaluacon other = (EvaDetalleEvaluacon) object;
        if ((this.evaDetalleEvaluaconPK == null && other.evaDetalleEvaluaconPK != null) || (this.evaDetalleEvaluaconPK != null && !this.evaDetalleEvaluaconPK.equals(other.evaDetalleEvaluaconPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.arquitectura.universidad.periodolectivo.model.EvaDetalleEvaluacon[ evaDetalleEvaluaconPK=" + evaDetalleEvaluaconPK + " ]";
    }
    
}
