/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Datos.RepositorioCliente;
import Dominio.Cliente;
import Dominio.Credito;
import Dominio.Cuota;
import Dominio.Empleado;
import Dominio.Pago;
import Dominio.Sesion;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class ControladorAbonarCuota {
    //Atributos
    private static Cliente cl;
    private static ArrayList<Cuota> ci;
    private static Pago p;
    private static float total;
    private static ArrayList<Cuota> cp;
    
    public static void ingresarCliente(int dni){
        cl = RepositorioCliente.buscarClienteByDni(dni);
        ci = cl.buscarCuotasImpagas();
        Empleado e = Sesion.getEmpleado();
        p=new Pago(cl,e);
    }
    
    public static void seleccionarCuota(int nroCuota,int nroCredito){
        Cuota cu=cl.obtenerCuotaDelCredito(nroCuota,nroCredito);
        p.agregarCuota(cu);
    }
    
    public static void finalizar(){
        cl.finalizarCreditos();
        float total=p.calcularTotal();
    }
}
