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
    public void agregarPedido(HashPedidos ped){
        pedidos.agregarPedido(ped);
    }
    
    
    
}