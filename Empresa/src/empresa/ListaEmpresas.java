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
public class ListaEmpresas {
    private List<Empresa> listaEmpresas;
    private static ListaEmpresas instance;
    
    public ListaEmpresas(){
        listaEmpresas = new ArrayList<>();
    }
    public static ListaEmpresas getInstance(){
        if(instance == null){
            instance = new ListaEmpresas();
        }
        return instance;
    }
    
    
}
