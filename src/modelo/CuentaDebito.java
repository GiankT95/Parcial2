/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Sala_04
 */
public class CuentaDebito implements GestorPagos {

    public CuentaDebito() {

    }

    @Override
    public void procesarPago(Pago p) {
        
        System.out.println("Pago realizado exitosamente. Monto: "+p.getMonto());
        
    }

}
