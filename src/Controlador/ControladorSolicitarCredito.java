/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Dominio.Cliente;
import Datos.Persistencia;
import DatosExternos.Veraz;
import Dominio.Credito;
import Dominio.Empleado;
import Dominio.Sesion;

/**
 *
 * @author Admin
 */
public class ControladorSolicitarCredito{
    //Atributos
    private static Credito cr;
    //Metodos
    public static void ingresarCliente(int dni){
        Cliente cl=Persistencia.buscarClienteByDni(dni);
        boolean deuda=Veraz.verificarEstado(dni); //Si hay deuda devuelve true, Si No hay deuda False
        int tc=0;
        if(!deuda) tc=cl.obtenerCreditosActivos(); //Si No Hay deuda(siendo Deuda False) ingresa
        Empleado e=Sesion.getEmpleado();
        if(!deuda && tc<=2) cr= new Credito(cl,e); //Crear Credito
    }
    
}
