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
public class Administrar {
        
        Scanner sc = new Scanner(System.in);
        Operaciones oper = new Operaciones();
        Persona per = new Persona();
        String cod;
        public void Empleado(String ID,ListaEmpleados list1,HashPedidos pedidos){
            int op;
            do{
            System.out.println("1.-Ingresar nuevo pedido: ");
            System.out.println("2.-Buscar pedido");
            System.out.println("3.-Actualizar pedido");
            System.out.println("4.-Borrar Pedido");
            System.out.println("5.-Cerrar Sesion");
            op=sc.nextInt();
            switch(op){
                case 1:{
                    per = list1.buscarPersona(ID);
                    oper.agregarPedido(pedidos,per);
                }break;
                case 2:{
                    System.out.println("Aqui podra buscar un pedido");
                    System.out.println("Ingrese el codigo del pedido:");
                    cod = sc.next();
                    oper.buscarPedido(pedidos,cod);
                }break;
                case 3:{
                    System.out.println("Aqui podra actualizar los datos de un pedido");
                }break;
                case 4:{
                    System.out.println("Aqui podra borrar un pedido");
                }break;
            }
            }while(op!=5);
        }
        public void Administrador(String ID,ListaAdministradores list1,HashPedidos pedidos){
        int op;
            do{
            System.out.println("1.-Buscar pedido");
            System.out.println("2.-Cerrar Sesion");
            op=sc.nextInt();
            switch(op){
                case 1:{
                    System.out.println("Aqui podra buscar un pedido");
                    System.out.println("Ingrese el codigo del pedido:");
                    cod = sc.next();
                    oper.buscarPedido(pedidos,cod);
                }break;
            }
            }while(op!=2);
        }
        
        
        public void Cliente(){}
        
    
}
