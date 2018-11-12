/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

import java.util.Scanner;

/**
 *
 * @author Diego Beltrán
 */
public class Clientes {
    Scanner sc = new Scanner(System.in);
    String ced;
    public void ingresarCliente(ListaClientes clie){
        clie.agregar();
    }
    public void buscarCliente(ListaClientes clie){
        
        System.out.println("Ingrese la cedula del cliente: ");
        ced=sc.next();
        Cliente clien;
        clien = (Cliente)clie.buscarPersona(ced);
        if(clien == null){
            System.out.println("Usuario no encontrado");
        } else {
            System.out.println(clien);
        }
    }
    public void actualizarCliente(ListaClientes clie){
    
    }
    public void borrarCliente(ListaClientes clie){
    
    
    }
}
