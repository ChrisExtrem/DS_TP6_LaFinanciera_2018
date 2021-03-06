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
public class Cliente {
    
    //Atributos
    private int dni;
    private ArrayList<Credito> creditos;

    public int obtenerCreditosActivos(){
        int resultado=0;
        for(Credito c : creditos){
            if(c.getEstado()==Estado.Moroso) resultado++;
        }
        return resultado;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public ArrayList<Cuota> buscarCuotasImpagas() {
        ArrayList<Cuota> lista = new ArrayList<Cuota>();
        for(Credito c : creditos){
            lista.addAll(c.buscarCuotasImpagas());
        }
        return lista;
    }

    public Credito buscarCreditoByNumero(int nroCredito) {
        Credito resultado=null;
        for(Credito c : creditos){
            if(c.getNumero()==nroCredito) resultado=c;
        }
        return resultado;
    }

    public Cuota obtenerCuotaDelCredito(int nroCuota, int nroCredito) {
        Credito cr = this.buscarCreditoByNumero(nroCredito);
        Cuota cu = cr.buscarCuotaByNumero(nroCuota);
        return cu;
    }

    public void finalizarCreditos() {
        for(Credito cr : creditos){
            cr.finalizar();
        }
    }
    
    
}
