/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Dominio.Cliente;
import Datos.RepositorioCliente;
import Datos.RepositorioPlan;
import DatosExternos.Veraz;
import Dominio.Credito;
import Dominio.Empleado;
import Dominio.Plan;
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
        Cliente cl=RepositorioCliente.buscarClienteByDni(dni);
        boolean deuda=Veraz.verificarEstado(dni); //Si hay deuda devuelve true, Si No hay deuda False
        int tc=0;
        if(!deuda) tc=cl.obtenerCreditosActivos(); //Si No Hay deuda(siendo Deuda False) ingresa
        Empleado e=Sesion.getEmpleado();
        if(!deuda && tc<=2) cr= new Credito(cl,e); //Crear Credito
    }
    
    public static void ingresarCredito(int numero, float capital){
        Plan p = RepositorioPlan.buscarPlanByNumero(numero);
        if(capital<=50000) cr.agregarPlan(p,capital);
    }
    
    public static void confirmarCredito(){
        cr.confirmar();
    }
    
}
