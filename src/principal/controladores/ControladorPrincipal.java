/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal.controladores;
import productos.modelos.Producto;
import usuarios.modelos.Cliente;
import usuarios.modelos.Empleado;
import usuarios.modelos.Encargado;
import java.util.ArrayList;
import productos.modelos.Categoria;
import productos.modelos.Estado;



/**
 *
 * @author user
 */
public class ControladorPrincipal {
    public static void main(String[] args){
        ArrayList<Cliente> listaClientes = new ArrayList<>();
        ArrayList<Empleado> listaEmpleados = new ArrayList<>();
        ArrayList<Encargado> listaEncargados = new ArrayList<>();
        ArrayList<Producto> listaProductos = new ArrayList<>();
        
        Cliente cliente1 = new Cliente("Carlos" , "Lopez" , "carlos@gmail.com", "123");
       
        listaClientes.add(cliente1);
        
        
        Cliente cliente2 = new Cliente("Juan", "Perez", "Juan@gmail.com", "456");
       
        
        listaClientes.add(cliente2);
        
        Cliente cliente3 = new Cliente("Maximo", "Figueroa", "maximo@gmail.com", "789");
        
        
        listaClientes.add(cliente3);
        
        
        Empleado empleado1 = new Empleado("Carolina", "Saravia", "carolina@gmail.com", "abc");
       
        listaEmpleados.add(empleado1);
        
        Empleado empleado2 = new Empleado("Lucas", "Herrera", "lucas@gmail.com", "def");
      
        listaEmpleados.add(empleado2);
        
        Empleado empleado3 = new Empleado("Juan", "Lopez", "juanl@gmail.com", "ghi");
    
        listaEmpleados.add(empleado3);
        
        Encargado encargado1 = new Encargado("Celia", "Paez", "celia@gmail.com", "jkl");
      
        listaEncargados.add(encargado1);
        
        Encargado encargado2 = new Encargado("Carla", "Paez","carla@gmail.com", "mno");
      
        listaEncargados.add(encargado2);
        
        Encargado encargado3 = new Encargado("Robero", "Chavez", "robert@gmail.com", "pqr");
        
        
        listaEncargados.add(encargado3);
        
        
        Producto p1 = new Producto(9128, 18000.00F, "Sorrentinos", Categoria.PLATO_PRINCIPAL, Estado.DISPONIBLE);
        
        listaProductos.add(p1);
        
        Producto p2 = new Producto(8237, 9000.00F, "Papas americanas", Categoria.ENTRADA, Estado.DISPONIBLE);
        
        listaProductos.add(p2);
        
        Producto p3 = new Producto(7346, 35000.00F, "Parrillada p/2", Categoria.PLATO_PRINCIPAL, Estado.DISPONIBLE);
    
        listaProductos.add(p3);
        
        
        
        System.out.println("Lista de clientes: \n");
        for(Cliente c : listaClientes){
            c.mostrar();
        }
        
        System.out.println("Lista de empleados: \n");
        for(Empleado emp : listaEmpleados){
            emp.mostrar();
        }
        
        System.out.println("Lista de encargados: \n");
        for(Encargado enc : listaEncargados){
            enc.mostrar();
        }
        
        System.out.println("Lista de productos");
        for(Producto p : listaProductos){
            p.mostrar();
        }
        
    }
}
    
    
