/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Dominio.Cliente;
import Dominio.Plan;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Admin
 */
public class Persistencia {

    //Atributos
    private static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    
    //Metodos
    public static Cliente buscarClienteByDni(int dni) {
        Cliente cr = null;
        for(Cliente c : clientes){
            if(c.getDni()==dni) cr=c;
        }
        return cr;
    }

    public static Plan buscarPlanByNumero(int numero) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
