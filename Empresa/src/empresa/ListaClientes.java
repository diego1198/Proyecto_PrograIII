/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Diego Beltrán
 */
public class ListaClientes {
    private List<Cliente> listClientes;
    private static ListaClientes instance;
    Scanner sc = new Scanner(System.in);
    public ListaClientes() {
        listClientes = new ArrayList<>();
        listClientes.add(new Cliente("1726010638", "Diego Beltran", "Quito Sur", "abcd1234"));
    }
    public static ListaClientes getInstance(){
        if(instance == null){
            instance = new ListaClientes();
        }
        return instance;
    }
    public void agregar(){
        String ced,nombre,dir,pass,pass2;
        boolean band,band2;
        band2=false;
        System.out.println("Ingrese su cedula");
        ced = sc.nextLine();
        band=buscar(ced);
        if(band==true){
            System.out.println("El cliente ya existe");
        }else{
            System.out.println("Ingrese el nombre y apellido: ");
            nombre = sc.nextLine();
            System.out.println("Ingrese la direccion: ");
            dir = sc.nextLine();
            do{
            System.out.println("ingrese su contraseña");
            pass = sc.nextLine();
            System.out.println("Confirmar la contraseña");
            pass2 = sc.nextLine();
            if(pass.equals(pass2)){
                band2 = true;
            }else{
                System.out.println("Contraseñas incorrectas, vuelva a ingresar");
            }
            }while(band2==false);
            Cliente aux = new Cliente(ced, nombre, dir, pass);
            listClientes.add(aux);
            
        }
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
   public Persona buscarPersona(String CI){
    int pos=-1;
        for(int i=0;i<listClientes.size();i++){
            if(listClientes.get(i).getCI().equals(CI)){
                pos=i;
            }
        }
        if(pos==-1){
            return null;
        }
        return listClientes.get(pos);
    }
    public boolean buscar(String CI){
    boolean band=false;
        for(int i=0;i<listClientes.size();i++){
            if(listClientes.get(i).getCI().equals(CI)){
                band=true;
            }
        }
        return band;
    }
}
