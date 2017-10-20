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
public class CuentaCredito implements GestorPagos{

    public CuentaCredito() {
        
    }
    
    @Override
    public void procesarPago(Pago p) {
        
        System.out.println("Nuevo pago recibido. Monto: "+p.getMonto());
        
    }
    
}
