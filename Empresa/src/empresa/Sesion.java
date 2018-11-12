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
    ListaEmpresas list4 = ListaEmpresas.getInstance();
    HashPedidos pedidos = HashPedidos.getInstance();
    Operaciones oper = new Operaciones();
    public void iniciarSesion(){
        String CI,pass;
        int op;
        Empleado aux1;
        
        while(true){
            System.out.println("1.-Iniciar Seion");
            System.out.println("2.-Registrar nuevo usuario");
            op=sc.nextInt();
            switch(op){
                case 1:{
                    sc.nextLine();
                    System.out.println("Ingrese su CI");
                    CI=sc.nextLine();
                    System.out.println("Ingrese su contraseña:");
                    pass = sc.nextLine();
                    if(buscarUsuario(CI, pass) instanceof Empleado){
                        System.out.println("Usted es un empleado");
                    aux1 = (Empleado)buscarUsuario(CI, pass);
                        //System.out.println(aux1.toString());
                        admin.Empleado(CI, list1, pedidos,list3);
                    }else if(buscarUsuario(CI, pass) instanceof Administrador){
                        System.out.println("Usted es un administrador");
                        admin.Administrador(CI, list2, pedidos);
                    }else if(buscarUsuario(CI, pass) instanceof Cliente)
                    {
                        System.out.println("Usted es un cliente");
                        admin.Cliente(CI,list3,pedidos,list3);
                    }else{
                        System.out.println("Usuario no encontrado");
                    }
                }break;
                case 2:{
                        oper.agregarCliente(list3);
                }break;
            
            }
        
            
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
