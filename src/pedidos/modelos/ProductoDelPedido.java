/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pedidos.modelos;
import productos.modelos.Producto;
import java.util.Objects;

/**
 *
 * @author user
 */
public class ProductoDelPedido {
    private int cantidad;
    private Producto producto;
    
    public ProductoDelPedido(int cantidad, Producto producto){
        this.cantidad = cantidad;
        this.producto = producto;
    }
    
    
    
    public int verCantidad(){
        return cantidad;
    }
    public void asignarCantidad(int cantidad){
        this.cantidad = cantidad;
    }
    
    
    public Producto verProducto(){
        return producto;
    }
    public void asignarProducto(Producto producto){
        this.producto = producto;
    }
    
    
    @Override
    public String toString(){
        return "Producto: " + this.producto.verDescripcion() + "- Cantidad: " + this.cantidad;
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
        ProductoDelPedido otro = (ProductoDelPedido) o;
        if(this.producto == null){
            return otro.producto == null;
        }
        return this.producto.equals(otro.producto);
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.producto);
        return hash;
    }
    
    public void mostrar(){
        System.out.println(this.producto.toString() + "\t" + this.cantidad);
    }
}
