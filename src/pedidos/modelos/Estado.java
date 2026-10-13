/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package pedidos.modelos;

/**
 *
 * @author user
 */
public enum Estado {
    CREADO("Creado"), PROCESANDO("Procesado"), ENTREGADO("Entregado");
    
    private String etiqueta;
    
    private Estado(String etiqueta){
        this.etiqueta = etiqueta;
    }
    
    @Override
    public String toString(){
        return this.etiqueta;
    }
}
