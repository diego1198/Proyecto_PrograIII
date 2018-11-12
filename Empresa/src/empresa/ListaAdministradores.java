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
public class ListaAdministradores {
    private List<Administrador> listAdministrador;
    private static ListaAdministradores instance;
    
    public ListaAdministradores(){
        listAdministrador = new ArrayList<>();
        listAdministrador.add(new Administrador("1234", "Ventas", "123456", "Juan", "Valle", "123456"));
    }
    public static ListaAdministradores getInstance(){
        if(instance==null)
        {
            instance = new ListaAdministradores();
        }
        return instance;
    }
     public Persona buscarPersona(String ci,String pass){
        int pos=-1;
        for(int i=0;i<listAdministrador.size();i++){
            if(listAdministrador.get(i).getCI().equals(ci)&&listAdministrador.get(i).getContrasena().equals(pass)){
                pos=i;
            }
        }
        if(pos==-1){
            return null;
        }
        return listAdministrador.get(pos);
    }
    
}
