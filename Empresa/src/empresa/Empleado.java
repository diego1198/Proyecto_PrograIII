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
public class Empleado extends Persona{
    
    private String ID;
    private String cargo;
    private String Horario;
    
    private Operaciones  oper = new Operaciones();

    public Empleado(String ID, String cargo, String Horario, String CI, String nombre, String Dirección, String Contrasena) {
        super(CI, nombre, Dirección, Contrasena);
        this.ID = ID;
        this.cargo = cargo;
        this.Horario = Horario;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getHorario() {
        return Horario;
    }

    public void setHorario(String Horario) {
        this.Horario = Horario;
    }

    @Override
    public String toString() {
        return "Empleado{" + "ID=" + ID + ", cargo=" + cargo + ", Horario=" + Horario  + getCI() +" "+ getNombre();
    }
    
    
    public void agregarPedido(HashPedidos ped){
        oper.agregarPedido(ped);
    }
    
    
    
    
}
