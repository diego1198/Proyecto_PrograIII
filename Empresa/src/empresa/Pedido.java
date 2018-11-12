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
public class Pedido {
        private String Empresa;
        private String Fecha;
        private String Descripcion;
        private Cliente client;
        private Persona employ;

    public Pedido() {
        Empresa = "Transportes Ecuador";
        Fecha = "12/11/2018";
        Descripcion="Entrega de encomienda";
        client = new Cliente("123456", "Carolina", "Valle", "123456");
    }
    
    
    public String getEmpresa() {
        return Empresa;
    }

    public void setEmpresa(String Empresa) {
        this.Empresa = Empresa;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getDescripción() {
        return Descripcion;
    }

    public void setDescripción(String Descripción) {
        this.Descripcion = Descripción;
    }

    public Cliente getClient() {
        return client;
    }

    public void setClient(Cliente client) {
        this.client = client;
    }

    public Persona getEmploy() {
        return employ;
    }

    public void setEmploy(Persona employ) {
        this.employ = employ;
    }

    @Override
    public String toString() {
        return "Pedido\n" + "Empresa=" + Empresa + ", Fecha=" + Fecha + ", Descripcion=" + Descripcion  + client.toString() + employ ;
    }

    
    
    
    
      
}
