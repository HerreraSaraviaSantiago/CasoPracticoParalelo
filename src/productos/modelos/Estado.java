/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package productos.modelos;

/**
 *
 * @author user
 */
public enum Estado {
    DISPONIBLE("Disponible"), NO_DISPONIBLE("No disponible");
    
    private String etiqueta;
   
    
    private Estado(String etiqueta){
        this.etiqueta = etiqueta;
    }
    
    @Override
    public String toString(){
        return this.etiqueta;
    }
}
