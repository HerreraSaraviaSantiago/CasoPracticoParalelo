/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package productos.modelos;

/**
 *
 * @author user
 */
public enum Categoria {
    ENTRADA("Entrada"), PLATO_PRINCIPAL("Plato Principal"), POSTRE("Postre");
    
    
    private String etiqueta;
   
    
    private Categoria(String etiqueta){
        this.etiqueta = etiqueta;
    }
    
    @Override
    public String toString(){
        return this.etiqueta;
    }
}