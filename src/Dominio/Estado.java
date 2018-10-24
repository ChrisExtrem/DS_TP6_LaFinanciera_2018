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
public enum Estado {
    Pendiente,
    Finalizado,
    Moroso;
    
    public static Estado getPendiente() {    
        return Pendiente;
    }

    public static Estado getFinalizado() {
        return Finalizado;
    }

    public static Estado getMoroso() {
        return Moroso;
    }
}
