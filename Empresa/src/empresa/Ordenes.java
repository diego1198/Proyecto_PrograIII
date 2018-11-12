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
public class Ordenes{
    
    public void agregarPedido(HashPedidos pedido,Persona per,ListaClientes clie){
        Pedido order = new Pedido();
        Scanner sc = new Scanner(System.in);
        String ced=null;
        Persona aux = new Persona();
        if(per instanceof Empleado){
            
            System.out.println("El empleado que le asigna el pedido es: "+ per.toString());
            System.out.println("Ingrese cedula de cliente:");
            ced=sc.next();
            aux = clie.buscarPersona(ced);
            if(aux==null){
                System.out.println("Pedir datos de cliente  ");
                aux.setNombre(sc.nextLine());
                aux.setDirección(sc.nextLine());
            }
            pedido.agregarPedido(per,aux);
        }else if(per instanceof Cliente){
            System.out.println("El cliente asignando el pedido es: "+ ((Cliente) per).toString());
            pedido.agregarPedido(per,per);
        }
    }
    public void quitarPedido(HashPedidos pedido){
        System.out.println("Borrando pedido");
    }
    public void actualizarPedido(HashPedidos pedido){
    
    }
    public void mostrarPedido(HashPedidos pedido,String cod){
        pedido.buscarPedido(cod);
    }
   
}
