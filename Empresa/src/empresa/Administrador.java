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
public class Administrador extends Persona{
    private String Id;
    private String departamento;

    public Administrador(String Id, String departamento, String CI, String nombre, String Dirección, String Contrasena) {
        super(CI, nombre, Dirección, Contrasena);
        this.Id = Id;
        this.departamento = departamento;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    
    
}
