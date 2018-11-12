/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Diego Beltrán
 */
public class ListaClientes {
    private List<Cliente> listClientes;
    private static ListaClientes instance;

    public ListaClientes() {
        listClientes = new ArrayList<>();
    }
    public static ListaClientes getInstance(){
        if(instance == null){
            instance = new ListaClientes();
        }
        return instance;
    }
   public Persona buscarPersona(String ci,String pass){
        int pos=-1;
        for(int i=0;i<listClientes.size();i++){
            if(listClientes.get(i).getCI().equals(ci)&&listClientes.get(i).getContrasena().equals(pass)){
                pos=i;
            }
        }
        if(pos==-1){
            return null;
        }
        return listClientes.get(pos); 
   }
    
}
