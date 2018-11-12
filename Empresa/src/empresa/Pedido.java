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
        private Empresa Empresa;
        private String Fecha;
        private String Descripcion;
        private Cliente client;
        private Persona employ;
        private int calificacion;
        private String comentario;
        private String estado;

    public Pedido() {
        
        
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    
    

    public Empresa getEmpresa() {
        return Empresa;
    }

    public void setEmpresa(Empresa Empresa) {
        this.Empresa = Empresa;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
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
        return "Pedido\n" + "Empresa= " + Empresa + ", Fecha= " + Fecha + ", Descripcion= " + Descripcion  + client.toString() + employ ;
    }

    
    
    
    
      
}
