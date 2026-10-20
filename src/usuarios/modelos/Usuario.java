/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuarios.modelos;
import java.util.Objects;
import java.util.ArrayList;
import pedidos.modelos.Pedido;

/**
 *
 * @author user
 */
public abstract class Usuario {
    private String correo;
    private String clave;
    private String nombre;
    private String apellido;
    
    public Usuario(String correo, String clave, String nombre, String apellido){
        this.correo = correo;
        this.clave = clave;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    public abstract ArrayList<Pedido> verPedidos();
    
    public String verCorreo(){
        return correo;
    }
    public void asignarCorreo(String correo){
        this.correo= correo;
    }
    
    
    
    public String verClave(){
        return clave;
    }
    
    public void asignarClave(String clave){
        this.clave = clave;
    }
    
    
    
    public String verNombre(){
        return nombre;
    }
    
    public void asignarNombre(String nombre){
        this.nombre = nombre;
    }
    
    
    
    public String verApellido(){
        return apellido;
    }
    
    public void asignarApellido(String apellido){
        this.apellido = apellido;
    }
    
    @Override
    public boolean equals(Object o){
        if(o==null){
            return false;
        }
        if(this==o){
            return true;
        }
        if(!(o instanceof Usuario)){
            return false;
        }
        Usuario otro = (Usuario) o;
        if (this.correo == null) {
            return otro.correo == null;
        }
        return this.correo.equals(otro.correo);
    }
    
    @Override
    public int hashCode(){
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.correo);
        return hash;
    }
    
    public void mostrar(){
        System.out.println("Usuario: " + nombre + " " + apellido + " | Correo: " + correo);
    }
}
