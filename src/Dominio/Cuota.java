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
    private int numero;
    private float totalCuota;
    private int numeroCredito;
    private boolean pagada;
    float subTotal;
    float monto;
    
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
        this.pagada=pagada;
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setSubTotal(float subTotal){
        this.subTotal=subTotal;
    }
    
    public float getSubTotal(){
        return this.subTotal;
    }
    
    public float calcularSubTotal() {
        float result=monto,i;
        int dv = this.calcularDiasVencidos();
        if(dv!=0){
            i=this.calcularInteres(dv);
            result=monto+monto*i;
        }
        this.setSubTotal(result);
        return result;
    }
    
    private float calcularInteres(int dv){
        float resultado=0;
        float i=Reglas.getInteresDiario();
        resultado=dv*i;
        return resultado;
    }

    private int calcularDiasVencidos() {
        int resultado=0;
        return resultado;
    }
    
}
