/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Datos.RepositorioCliente;
import Dominio.Cliente;
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
    
    public static void ingresarCliente(int dni){
        cl = RepositorioCliente.buscarClienteByDni(dni);
        ci = cl.buscarCuotasImpagas();
        Empleado e = Sesion.getEmpleado();
        p=new Pago(cl,e);
    }
}
