/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Pago {
    //Atributos
    Cliente cliente;
    Empleado empleado;
    ArrayList<Cuota> cuotasPagadas;

    public Pago(Cliente cl, Empleado e) {
        this.cliente=cl;
        this.empleado=e;
        this.cuotasPagadas=new ArrayList<Cuota>();
    }
    
}
