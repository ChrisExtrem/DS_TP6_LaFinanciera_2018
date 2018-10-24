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
    private int numero;
    private Estado estado;
    private Cliente cliente;
    private Empleado empleado;
    private ArrayList<Cuota> cuotas;
    private int cantidadCuotas;
    private float interes;
    private float capital;

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

    public float getInteres() {
        return interes;
    }

    public void setInteres(float interes) {
        this.interes = interes;
    }

    public void agregarPlan(Plan p,float capital) {
        float i = p.getInteres();
        int cc = p.getCuotas();
        this.setCapital(capital);
        this.setInteres(i);
        this.setCantidadCuotas(cc);
        float total = this.calcularTotal(capital,interes);
        float totalCuota = this.calcularTotalCuota(total,cc);
        for(int j=0;j<cc;j++){
            Cuota cu = new Cuota(totalCuota);
            cuotas.add(cu);
        }
    }
    
    public float getCapital(){
        return capital;
    }

    public void setCapital(float capital) {
        this.capital = capital;
    }

    public int getCantidadCuotas() {
        return cantidadCuotas;
    }

    public void setCantidadCuotas(int cantidadCuotas) {
        this.cantidadCuotas = cantidadCuotas;
    }

    private float calcularTotal(float capital, float interes) {
        return capital+capital*interes;
    }

    private float calcularTotalCuota(float total, int cc) {
        return total/cc;
    }

    public void confirmar() {
        this.setEstado(estado.Pendiente);
    }
    
    public ArrayList<Cuota> buscarCuotasImpagas(){
        ArrayList<Cuota> lista = new ArrayList<Cuota>();
        for(Cuota c : cuotas){
            if(!c.isPagada())   lista.add(c);
        }
        return lista;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public ArrayList<Cuota> getCuotas() {
        return cuotas;
    }

    public void setCuotas(ArrayList<Cuota> cuotas) {
        this.cuotas = cuotas;
    }

    public Cuota buscarCuotaByNumero(int nroCuota) {
        Cuota cu=null;
        for(Cuota c : cuotas){
            if(c.getNumero()==nroCuota) cu=c;
        }
        cu.calcularSubTotal();
        
        return cu;
    }

    void finalizar() {
        ArrayList<Cuota> ci = this.buscarCuotasImpagas();
        int cci=ci.size();
        if(cci==0)  this.estado=estado.Finalizado;
    }
}