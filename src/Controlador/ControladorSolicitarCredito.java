/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Dominio.Cliente;
import Datos.Persistencia;

/**
 *
 * @author Admin
 */
public class ControladorSolicitarCredito{
    //Atributos
    private static Cliente cl;
    //Metodos
    public static void ingresarCliente(int dni){
        cl=Persistencia.buscarClienteByDni(dni);
    }
    
}
