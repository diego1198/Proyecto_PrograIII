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
public class Persona {
    private String CI;
    private String nombre;
    private String Dirección;
    private String Contrasena;

    public Persona(String CI, String nombre, String Dirección, String Contrasena) {
        this.CI = CI;
        this.nombre = nombre;
        this.Dirección = Dirección;
        this.Contrasena = Contrasena;
    }
    public Persona(){}

    public String getCI() {
        return CI;
    }

    public void setCI(String CI) {
        this.CI = CI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirección() {
        return Dirección;
    }

    public void setDirección(String Dirección) {
        this.Dirección = Dirección;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setContrasena(String Contrasena) {
        this.Contrasena = Contrasena;
    }

    
    
    
}
