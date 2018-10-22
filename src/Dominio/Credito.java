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
public class Credito {
    
    //Atributos
    private Estado estado;
    private Cliente cliente;
    private Empleado empleado;
    private ArrayList<Cuota> cuotas;

    public Credito(Cliente cl, Empleado e) {
        this.cliente=cl;
        this.empleado=e;
        this.cuotas=new ArrayList<Cuota>();
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    
    
    
    
    
}
