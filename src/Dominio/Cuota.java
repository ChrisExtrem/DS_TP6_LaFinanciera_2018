/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

/**
 *
 * @author Admin
 */
public class Cuota {
    //Atributos
    private float totalCuota;
    private int numeroCredito;
    private boolean pagada;
    
    Cuota(float totalCuota) {
        this.totalCuota=totalCuota;
    }

    public float getTotalCuota() {
        return totalCuota;
    }

    public void setTotalCuota(float totalCuota) {
        this.totalCuota = totalCuota;
    }

    public int getNumeroCredito() {
        return numeroCredito;
    }

    public void setNumeroCredito(int numeroCredito) {
        this.numeroCredito = numeroCredito;
    }

    public boolean isPagada() {
        return pagada;
    }

    public void setPagada(boolean pagada) {
        this.pagada = pagada;
    }
    
}
