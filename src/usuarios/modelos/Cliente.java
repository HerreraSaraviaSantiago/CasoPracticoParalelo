/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuarios.modelos;
import java.util.ArrayList;
import pedidos.modelos.Pedido;

/**
 *
 * @author user
 */
public class Cliente {
    private String correo;
    private String clave;
    private String nombre;
    private String apellido;
    private ArrayList<Pedido> pedidos;
    
    public Cliente(){
        this.pedidos = new ArrayList<>();
    }
    
    public Cliente(String nombre, String apellido, String correo, String clave){
        this.correo = correo;
        this.clave = clave;
        this.nombre = nombre;
        this.apellido = apellido;
        this.pedidos = new ArrayList<>();
    }
    
    
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
    
    
    
    public ArrayList<Pedido> verPedidos() {
        return this.pedidos;
    }

    public void asignarPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public void agregarPedido(Pedido pedido) {
        this.pedidos.add(pedido);
    }
            
            
            
    public void mostrar(){
        System.out.println("Cliente: " + nombre + " " + apellido + " | Correo: " + correo);
    }
}
