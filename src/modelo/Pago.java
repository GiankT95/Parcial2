package modelo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sala_04
 */
public abstract class Pago {
    
    protected double monto;
    public GestorPagos gestor;
    
    public abstract boolean validarPago();
    public abstract void pagar();

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public GestorPagos getGestor() {
        return gestor;
    }

    public void setGestor(GestorPagos gestor) {
        this.gestor = gestor;
    }
    
    
}
