/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuarios.modelos;

/**
 *
 * @author user
 */
public class Empleado {
    private String correo;
    private String clave;
    private String nombre;
    private String apellido;
    
    public Empleado(){
        
    }
    
    public Empleado(String nombre, String apellido, String correo, String clave){
        this.correo = correo;
        this.clave = clave;
        this.nombre = nombre;
        this.apellido = apellido;
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
    
    
    
    public void mostrar(){
        System.out.println("Empleado: " + nombre + " " + apellido + " | Correo: " + correo);
    }
}
