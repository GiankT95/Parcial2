/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Sala_04
 */
public class PagoNomina extends Pago {

    public PagoNomina(GestorPagos gestor, double monto) {
        this.monto = monto;
        this.gestor = gestor;
    }

    @Override
    public boolean validarPago() {

        boolean validado = false;

        if (this.monto < 10) {
            validado = true;
            System.out.println("Su pago de nomina ha sido autorizado");
        }
        else{
            System.out.println("Su pago no ha sido autorizado");
        }

        return validado;
    }

    @Override
    public void pagar() {
        if(validarPago()){
            this.getGestor().procesarPago(this);
        }
        else{
            System.out.println("No se pudo procesar su pago.");
        }
    }

}
