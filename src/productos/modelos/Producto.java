/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productos.modelos;

/**
 *
 * @author user
 */
public class Producto {
    private int codigo;
    private float precio;
    private String descripcion;
    private Categoria categoria;
    private Estado estado;
    
    public Producto(){
    
    }
    
    public Producto(int codigo, float precio,String descripcion, Categoria categoria, Estado estado){
        this.codigo = codigo;
        this.precio = precio;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.estado = estado;
    }
    
    public int verCodigo(){
        return codigo;
    }
    
    public void asignarCodigo(int codigo){
        this.codigo = codigo;
    }
    
    
    
    public float verPrecio(){
        return precio;
    }
    
    public void asignarPrecio(float precio){
        this.precio = precio;
    }
    
    
    
    public String verDescripcion(){
        return descripcion;
    }
    
    public void asignarDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    
    
    public Categoria verCategoria(){
        return categoria;
    }
    
    public void asignarCategoria(Categoria categoria){
        this.categoria = categoria;
    }
    
    
    public Estado verEstado(){
        return estado;
    }
    
    public void asignarEstado(Estado estado){
        this.estado = estado;
    }
    
    public void mostrar(){
        System.out.println("Codigo: " + codigo + " | Precio: " + precio + " | Producto: " + descripcion + " | Categoria: " + categoria + " | Estado: " + estado);
    }
    
    @Override
    public String toString(){
        return "[" + this.codigo + "] " + this.descripcion + "\t$" + this.precio;
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
        Producto otro = (Producto) o;
        return this.codigo == otro.codigo;
    }
    
    @Override
    public int hashCode(){
        int hash = 7;
        hash = 53 * hash + this.codigo;
        return hash;
    }
}
