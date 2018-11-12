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
public class Sesion {
    Scanner sc = new Scanner(System.in);
    Administrar admin = new Administrar();
    Persona per = new Persona();
    ListaEmpleados list1 = ListaEmpleados.getInstance();
    ListaAdministradores list2 = ListaAdministradores.getInstance();
    ListaClientes list3 = ListaClientes.getInstance();
    HashPedidos pedidos = HashPedidos.getInstance();
    public void iniciarSesion(){
        String CI,pass;
        Empleado aux1;
        System.out.println("Ingrese su CI");
        CI=sc.next();
        System.out.println("Ingrese su contraseña:");
        pass = sc.next();
        
        if(buscarUsuario(CI, pass) instanceof Empleado){
        aux1 = (Empleado)buscarUsuario(CI, pass);
            //System.out.println(aux1.toString());
            admin.agregarPedidos(CI, list1, pedidos);
        }else if(buscarUsuario(CI, pass) instanceof Administrador){
            System.out.println("Usted es un administrador");
        }else if(buscarUsuario(CI, pass) instanceof Cliente)
        {
            System.out.println("Usted es un cliente");
        }else{
            System.out.println("Usuario no encontrado");
        }
            
        
    }

    public Persona buscarUsuario(String ci, String pass){
        Persona aux;
        aux=list1.buscarPersona(ci, pass);
        if(aux==null){
        aux = list2.buscarPersona(ci, pass);
        }
        if(aux == null){
        aux = list3.buscarPersona(ci, pass);
        }
            
    return aux;
    }
    
}
