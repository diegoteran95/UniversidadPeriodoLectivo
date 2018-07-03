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
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author diego
 */
@Entity
@Table(name = "PRL_MATRICULA")
public class PrlMatricula implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "COD_MATRICULA", nullable = false, length = 10)
    private String codMatricula;

    @Column(name = "COD_PERSONA", nullable = false, length = 20)
    private String codPersona;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PROMEDIO")
    private BigDecimal promedio;

    @Column(name = "COSTO_MATRICULA", nullable = false)
    private BigDecimal costoMatricula;

    @Column(name = "PAGADO", length = 3)
    private String pagado;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "prlMatricula", fetch = FetchType.LAZY)
    private List<PrlDetalleMatricula> prlDetalleMatriculaList;
    @JoinColumn(name = "COD_PERIODO", referencedColumnName = "COD_PERIODO")
    @ManyToOne(fetch = FetchType.LAZY)
    private PrlPeriodoLectivo codPeriodo;

    public PrlMatricula() {
    }

    public PrlMatricula(String codMatricula) {
        this.codMatricula = codMatricula;
    }

    public PrlMatricula(String codMatricula, String codPersona, BigDecimal costoMatricula) {
        this.codMatricula = codMatricula;
        this.codPersona = codPersona;
        this.costoMatricula = costoMatricula;
    }

    public String getCodMatricula() {
        return codMatricula;
    }

    public void setCodMatricula(String codMatricula) {
        this.codMatricula = codMatricula;
    }

    public String getCodPersona() {
        return codPersona;
    }

    public void setCodPersona(String codPersona) {
        this.codPersona = codPersona;
    }

    public BigDecimal getPromedio() {
        return promedio;
    }

    public void setPromedio(BigDecimal promedio) {
        this.promedio = promedio;
    }

    public BigDecimal getCostoMatricula() {
        return costoMatricula;
    }

    public void setCostoMatricula(BigDecimal costoMatricula) {
        this.costoMatricula = costoMatricula;
    }

    public String getPagado() {
        return pagado;
    }

    public void setPagado(String pagado) {
        this.pagado = pagado;
    }

    public List<PrlDetalleMatricula> getPrlDetalleMatriculaList() {
        return prlDetalleMatriculaList;
    }

    public void setPrlDetalleMatriculaList(List<PrlDetalleMatricula> prlDetalleMatriculaList) {
        this.prlDetalleMatriculaList = prlDetalleMatriculaList;
    }

    public PrlPeriodoLectivo getCodPeriodo() {
        return codPeriodo;
    }

    public void setCodPeriodo(PrlPeriodoLectivo codPeriodo) {
        this.codPeriodo = codPeriodo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codMatricula != null ? codMatricula.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PrlMatricula)) {
            return false;
        }
        PrlMatricula other = (PrlMatricula) object;
        if ((this.codMatricula == null && other.codMatricula != null) || (this.codMatricula != null && !this.codMatricula.equals(other.codMatricula))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.arquitectura.universidad.periodolectivo.model.PrlMatricula[ codMatricula=" + codMatricula + " ]";
    }
    
}
