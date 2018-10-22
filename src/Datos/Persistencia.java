/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Dominio.Cliente;
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
    
}
