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
public class ListaEmpleados {
        private List<Empleado> listEmpleado;
        private static ListaEmpleados instance;

    public ListaEmpleados() {
        listEmpleado = new ArrayList<Empleado>();
        listEmpleado.add(new Empleado("1234", "Recepcionista", "12-8pm", "123456789", "Pedro", "Valle", "abcde"));
    }
      
    public static ListaEmpleados getInstance(){
        if(instance == null){
           instance = new ListaEmpleados();
        }
       
        return instance;
        
    }
    
    public int buscarEmpleado(String ID){
        int pos=0;
        for(int i=0;i<listEmpleado.size();i++){
            if(listEmpleado.get(i).getCI().equals(ID))
                pos=i;
        }
        return pos;
    }
    public Persona buscarPersona(String ci,String pass){
        int pos=-1;
        for(int i=0;i<listEmpleado.size();i++){
            if(listEmpleado.get(i).getCI().equals(ci)&&listEmpleado.get(i).getContrasena().equals(pass)){
                pos=i;
            }
        }
        if(pos==-1){
            return null;
        }
        return listEmpleado.get(pos);
    }
    public Persona buscarPersona(String CI){
    int pos=-1;
        for(int i=0;i<listEmpleado.size();i++){
            if(listEmpleado.get(i).getCI().equals(CI)){
                pos=i;
            }
        }
        if(pos==-1){
            return null;
        }
        return listEmpleado.get(pos);
    }
        
}
