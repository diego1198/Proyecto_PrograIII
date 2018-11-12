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
public class Operaciones {
    private Ordenes pedidos;

    public Operaciones() {
        pedidos = new Ordenes();
    }
    public void agregarPedido(HashPedidos ped,Persona per){
        
        pedidos.agregarPedido(ped,per);
    }
    public void buscarPedido(HashPedidos ped,String cod){
        pedidos.mostrarPedido(ped, cod);
    }
    
    
    
    
}
