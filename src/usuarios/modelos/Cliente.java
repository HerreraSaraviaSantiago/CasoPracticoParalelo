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
public class Cliente extends Usuario {
    private ArrayList<Pedido> pedidos;

    public Cliente(String correo, String clave, String nombre, String apellido) {
        super(correo, clave, nombre, apellido);
        this.pedidos = new ArrayList<>();
    }

    @Override
    public ArrayList<Pedido> verPedidos() {
        return this.pedidos;
    }

    public void asignarPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    // Si ya existe lo reemplaza, si no está lo agrega
    public void agregarPedido(Pedido pedido) {
        if (this.pedidos.contains(pedido)) {
            int indice = this.pedidos.indexOf(pedido);
            this.pedidos.set(indice, pedido);
        } else {
            this.pedidos.add(pedido);
        }
    }

    // Cancela (elimina) el pedido de la lista
    public void cancelarPedido(Pedido pedido) {
        this.pedidos.remove(pedido);
    }

    @Override
    public void mostrar() {
        System.out.println("Cliente: " + verNombre() + " " + verApellido() + " | Correo: " + verCorreo());
    }
}