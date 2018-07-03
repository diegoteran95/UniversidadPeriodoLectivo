/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arquitectura.universidad.periodolectivo.enums;

/**
 *
 * @author diego
 */
public enum PrlPeriodoLectivoEnum {
    ACT("Activo"),
    INA("Inactivo");

    private String texto;

    private PrlPeriodoLectivoEnum(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return this.texto;
    }
}
