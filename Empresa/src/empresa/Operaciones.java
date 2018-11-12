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
public class Operaciones {
    private Ordenes pedidos;
    private Empresas empresas;
    private Clientes clientes;

    public Operaciones() {
        pedidos = new Ordenes();
        empresas = new Empresas();
        clientes = new Clientes();
    }
    
    //Seccion CRUD Pedidos y Ordenes
    public void agregarPedido(HashPedidos ped,Persona per,ListaClientes clie){
        
        pedidos.agregarPedido(ped,per,clie);
    }
    public void buscarPedido(HashPedidos ped,String cod){
        pedidos.mostrarPedido(ped, cod);
    }
    public void actualizarPedido(HashPedidos ped){
    
    }
    public void eliminarPedido(HashPedidos ped){
    
    }
    
    //'Seccion de CRUD Empresas
    public void agregarEmpresa(ListaEmpresas emp){
    }
    
    public void buscarEmpresa(ListaEmpresas emp){
    }
    
    public void actualizarEmpresa(ListaEmpresas emp){
    }
    
    public void eliminarEmpresa(ListaEmpresas emp){}
    
    //Seccion de CRUD Clientes
    public void agregarCliente(ListaClientes clie){
        clientes.ingresarCliente(clie);
    }
    public void buscarCliente(ListaClientes clie){}
    public void actualizarCliente(ListaClientes clie){}
    public void borarCliente(ListaClientes clie){}
    
    
}
