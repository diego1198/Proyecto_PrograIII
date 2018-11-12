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
        
        
        
        public void agregarPedidos(String ID,ListaEmpleados list1,HashPedidos pedidos){
            int pos=0;
            pos=list1.buscarEmpleado(ID);
            list1.ingresarPedido(pos,pedidos);
        }
        
        public void Empleado(String ID,ListaEmpleados list1,HashPedidos pedidos){
            int op;
            do{
            System.out.println("1.-Ingresar nuevo pedido: ");
            System.out.println("2.-Buscar pedido");
            System.out.println("3.-Actualizar pedido");
            System.out.println("4.-Borrar Pedido");
            op=sc.nextInt();
            switch(op){
                case 1:{
                    agregarPedidos(ID,list1,pedidos);
                }break;
                case 2:{
                    System.out.println("Aqui podra buscar un pedido");
                }break;
                case 3:{
                    System.out.println("Aqui podra actualizar los datos de un pedido");
                }break;
                case 4:{
                    System.out.println("Aqui podra borrar un pedido");
                }break;
            }
            }while(op==5);
        }
        public void Administrador(){}
        
        
        public void Cliente(){}
        
    
}
