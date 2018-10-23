/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Dominio.Plan;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class RepositorioPlan {
    //Atributos
    protected static ArrayList<Plan> planes;
    //Metodos
    public static Plan buscarPlanByNumero(int numero) {
        Plan resultado=null;
        for(Plan p : planes){
            if(p.getNumero()==numero)   resultado=p;
        }
        return resultado;
    }
}
