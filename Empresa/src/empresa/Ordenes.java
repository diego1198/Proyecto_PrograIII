/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

/**
 *
 * @author Diego Beltrán
 */
public class Ordenes{
    
    public void agregarPedido(HashPedidos pedido,Persona per){
        Pedido order = new Pedido();
        if(per instanceof Empleado){
            
            System.out.println("El empleado que le asigna el pedido es: "+ per.toString());
            pedido.agregarPedido(per);
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
