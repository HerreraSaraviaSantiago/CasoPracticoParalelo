/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pedidos.modelos;
import java.time.LocalDateTime;
import usuarios.modelos.Cliente;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import productos.modelos.Producto;



/**
 *
 * @author user
 */
public class Pedido {
    private int numero;
    private LocalDateTime fechaYhora;
    private Cliente cliente;
    private Estado estado;
    private ArrayList<ProductoDelPedido> listaProductos = new ArrayList<>();

    
    
    public Pedido(int numero, LocalDateTime fechaYhora, Cliente cliente, Estado estado){
        this.numero = numero;
        this.fechaYhora = fechaYhora;
        this.cliente = cliente;
        this.estado = estado;
    }
    
    public void asignarProductoDelPedido(int cantidad, Producto producto){
        ProductoDelPedido pdp = new ProductoDelPedido(cantidad, producto);
        this.listaProductos.add(pdp);
    }
    
    
    public int verNumero(){
        return numero;
    }
    public void asignarNumero(int numero){
        this.numero = numero;
    }
    
    
    
    public LocalDateTime verFechaYhora(){
        return fechaYhora;
    }
    public void asignarFechaYhora(LocalDateTime fechaYhora){
        this.fechaYhora = fechaYhora;
    }
   
    
    public String verFecha() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return this.fechaYhora.format(formato);
    }
    public String verHora() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm");
        return this.fechaYhora.format(formato);
    }
    
    
    public Cliente verCliente(){
        return cliente;
    }
    public void asignarCliente(Cliente cliente){
        this.cliente = cliente;
    }
    
    
    public Estado verEstado(){
        return estado;
    } 
    public void asignarEstado(Estado estado){
        this.estado = estado;
    }
    
    
    public ArrayList<ProductoDelPedido> verListaProductos(){
        return listaProductos;
    }
    public void asignarListaProductos(ArrayList<ProductoDelPedido> listaProductos){
        this.listaProductos = listaProductos;
    }
    
    @Override
    public boolean equals(Object o){
        if(o == null){
            return false;
        }
        if(this == o){
            return true;
        }
        if(this.getClass() != o.getClass()){
            return false;
        }
        Pedido otro = (Pedido) o;
        return this.numero == otro.numero;
    }
    
    @Override
    public int hashCode(){
        int hash = 7;
        hash = 53 * hash + this.numero;
        return hash;
    }
    
    public void mostrar(){
        System.out.println("Nro: " + this.numero);
        System.out.println("Estado: " + this.estado);
        System.out.println("Fecha: " + verFecha() + "\tHora: " + verHora());
        System.out.println("Cliente:\n" + this.cliente.verApellido() + ", " + this.cliente.verNombre());
        System.out.println("Producto\t\t\tCantidad");
        System.out.println("================================================");
        
        for(ProductoDelPedido unProducto : this.listaProductos){
            unProducto.mostrar();
        }
        System.out.println();
    }
}
