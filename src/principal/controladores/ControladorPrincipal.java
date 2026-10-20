/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal.controladores;

import java.time.LocalDateTime;
import java.util.ArrayList;
import pedidos.modelos.Pedido;
import productos.modelos.Categoria;
import productos.modelos.Estado;
import productos.modelos.Producto;
import usuarios.modelos.Cliente;
import usuarios.modelos.Empleado;
import usuarios.modelos.Encargado;
import usuarios.modelos.Usuario;

/**
 *
 * @author user
 */
public class ControladorPrincipal {

    public static void main(String[] args) {
        // ÚNICA lista polimórfica para todos los usuarios
        ArrayList<Usuario> listaUsuarios = new ArrayList<>();
        ArrayList<Producto> listaProductos = new ArrayList<>();
        ArrayList<Pedido> listaPedidos = new ArrayList<>();

        // --- Carga de Clientes (referencia tipo Usuario) ---
        Usuario cliente1 = new Cliente("carlos@gmail.com", "123", "Carlos", "Lopez");
        if (!listaUsuarios.contains(cliente1)) {
            listaUsuarios.add(cliente1);
        }

        Usuario cliente2 = new Cliente("Juan@gmail.com", "456", "Juan", "Perez");
        if (!listaUsuarios.contains(cliente2)) {
            listaUsuarios.add(cliente2);
        }

        Usuario cliente3 = new Cliente("maximo@gmail.com", "789", "Maximo", "Figueroa");
        if (!listaUsuarios.contains(cliente3)) {
            listaUsuarios.add(cliente3);
        }

        // --- Carga de Empleados (referencia tipo Usuario) ---
        Usuario empleado1 = new Empleado("carolina@gmail.com", "abc", "Carolina", "Saravia");
        if (!listaUsuarios.contains(empleado1)) {
            listaUsuarios.add(empleado1);
        }

        Usuario empleado2 = new Empleado("lucas@gmail.com", "def", "Lucas", "Herrera");
        if (!listaUsuarios.contains(empleado2)) {
            listaUsuarios.add(empleado2);
        }

        Usuario empleado3 = new Empleado("juanl@gmail.com", "ghi", "Juan", "Lopez");
        if (!listaUsuarios.contains(empleado3)) {
            listaUsuarios.add(empleado3);
        }

        // --- Carga de Encargados (referencia tipo Usuario) ---
        Usuario encargado1 = new Encargado("celia@gmail.com", "jkl", "Celia", "Paez");
        if (!listaUsuarios.contains(encargado1)) {
            listaUsuarios.add(encargado1);
        }

        Usuario encargado2 = new Encargado("carla@gmail.com", "mno", "Carla", "Paez");
        if (!listaUsuarios.contains(encargado2)) {
            listaUsuarios.add(encargado2);
        }

        Usuario encargado3 = new Encargado("robert@gmail.com", "pqr", "Robero", "Chavez");
        if (!listaUsuarios.contains(encargado3)) {
            listaUsuarios.add(encargado3);
        }

        // --- Carga de Productos ---
        Producto p1 = new Producto(9128, 18000.00F, "Sorrentinos", Categoria.PLATO_PRINCIPAL, Estado.DISPONIBLE);
        if (!listaProductos.contains(p1)) {
            listaProductos.add(p1);
        }

        Producto p2 = new Producto(8237, 9000.00F, "Papas americanas", Categoria.ENTRADA, Estado.DISPONIBLE);
        if (!listaProductos.contains(p2)) {
            listaProductos.add(p2);
        }

        Producto p3 = new Producto(7346, 35000.00F, "Parrillada p/2", Categoria.PLATO_PRINCIPAL, Estado.DISPONIBLE);
        if (!listaProductos.contains(p3)) {
            listaProductos.add(p3);
        }

        // --- Armado de Pedidos ---
        // listaUsuarios.get(0) es cliente1 -> casteo explícito (Cliente)
        Pedido pedido1 = new Pedido(1, LocalDateTime.now(), (Cliente) listaUsuarios.get(0), pedidos.modelos.Estado.CREADO);
        pedido1.asignarProductoDelPedido(1, listaProductos.get(2));
        if (!listaPedidos.contains(pedido1)) {
            listaPedidos.add(pedido1);
        }

        // listaUsuarios.get(1) es cliente2
        Pedido pedido2 = new Pedido(2, LocalDateTime.now(), (Cliente) listaUsuarios.get(1), pedidos.modelos.Estado.CREADO);
        pedido2.asignarProductoDelPedido(2, listaProductos.get(0));
        if (!listaPedidos.contains(pedido2)) {
            listaPedidos.add(pedido2);
        }

        // listaUsuarios.get(2) es cliente3
        Pedido pedido3 = new Pedido(3, LocalDateTime.now(), (Cliente) listaUsuarios.get(2), pedidos.modelos.Estado.CREADO);
        pedido3.asignarProductoDelPedido(1, listaProductos.get(2));
        if (!listaPedidos.contains(pedido3)) {
            listaPedidos.add(pedido3);
        }

        // --- Mostrar lista única de usuarios (Polimorfismo puro) ---
        System.out.println("Lista de usuarios: \n");
        for (Usuario u : listaUsuarios) {
            u.mostrar();
        }

        // --- Mostrar productos ---
        System.out.println("\nLista de productos:\n");
        for (Producto p : listaProductos) {
            p.mostrar();
        }

        // --- Mostrar pedidos ---
        System.out.println("\nLista de pedidos: \n");
        for (Pedido pedido : listaPedidos) {
            pedido.mostrar();
        }
        
        // ========================================================
        // PRUEBA DE PEDIDOS DE UN CLIENTE (SECCIÓN 3)
        // ========================================================
        System.out.println("\n----- GESTIÓN DE PEDIDOS DE UN CLIENTE -----");

        // 1. Obtenemos un cliente de la lista de usuarios mediante casteo
        Cliente clientePrueba = (Cliente) listaUsuarios.get(0);

        // 2. Tomamos uno de los pedidos creados de la lista de pedidos
        Pedido pedidoPrueba = listaPedidos.get(0);

        // 3. Agregamos el pedido al cliente
        clientePrueba.agregarPedido(pedidoPrueba);

        // Intentamos agregar dos veces el mismo pedido para verificar que no se duplique
        clientePrueba.agregarPedido(pedidoPrueba);

        // 4. Mostramos los pedidos del cliente usando verPedidos()
        System.out.println("\nPedidos del cliente " + clientePrueba.verNombre() + " (verificando no duplicados):");
        for (Pedido p : clientePrueba.verPedidos()) {
            p.mostrar();
        }

        // 5. Cancelamos el pedido
        System.out.println("\nCancelando el pedido " + pedidoPrueba.verNumero() + "...");
        clientePrueba.cancelarPedido(pedidoPrueba);

        // 6. Verificamos que la operación se realizó (debe estar vacía o sin ese pedido)
        System.out.println("Pedidos del cliente tras la cancelación (cantidad: " + clientePrueba.verPedidos().size() + "):");
        for (Pedido p : clientePrueba.verPedidos()) {
            p.mostrar();
        }
    }
}
    
    
