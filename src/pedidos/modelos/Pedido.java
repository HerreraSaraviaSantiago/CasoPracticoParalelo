/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pedidos.modelos;
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.LocalTime;
import usuarios.modelos.Cliente;


/**
 *
 * @author user
 */
public class Pedido {
    private int numero;
    private LocalDateTime fechaYhora;
    private Cliente cliente;
    private Estado estado;
    
    public Pedido(){
    
    }
    
    public Pedido(int numero, LocalDateTime fechaYhora, Cliente cliente, Estado estado){
        this.numero = numero;
        this.fechaYhora = fechaYhora;
        this.cliente = cliente;
        this.estado = estado;
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
    
    public LocalDate verFecha() {
        if (this.fechaYhora != null) {
            return this.fechaYhora.toLocalDate();
        }
        return null;
    }

    public LocalTime verHora() {
        if (this.fechaYhora != null) {
            return this.fechaYhora.toLocalTime();
        }
        return null;
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
    
    public void asignarNumero(Estado estado){
        this.estado = estado;
    }
}
