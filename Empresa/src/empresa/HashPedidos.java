/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Diego Beltrán
 */
public class HashPedidos {
        private Map<String,Pedido> pedidos;
        private static HashPedidos instance;

    public HashPedidos() {
        pedidos = new HashMap<>();
    }
        
        public static HashPedidos getInstance(){
            if(instance == null)
            {
                instance = new HashPedidos();
            }
            return instance;
        }
        
        public void agregarPedido(Persona empl){
            Pedido ped = new Pedido();
            ped.setEmploy(empl);
            pedidos.put("HC-01", ped);
        }
        public void buscarPedido(String cod){
            if(pedidos.containsKey(cod)){
                System.out.println(pedidos.get(cod).toString());
            }
        }
        
}
