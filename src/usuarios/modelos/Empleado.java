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
public class Empleado extends Usuario {

    public Empleado(String correo, String clave, String nombre, String apellido){
        super(correo, clave, nombre, apellido);
    }
    
    @Override
    public ArrayList<Pedido> verPedidos() {
        return new ArrayList<>();
    }
    
    @Override
    public void mostrar(){
        System.out.println("Empleado: " + verNombre() + " " + verApellido() + " | Correo: " + verCorreo());
    }
}
