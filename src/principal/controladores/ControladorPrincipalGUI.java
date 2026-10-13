/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal.controladores;

import javax.swing.UIManager;
import productos.vistas.VentanaAMProducto;
import usuarios.vistas.VentanaAMCliente;
import usuarios.vistas.VentanaAMEmpleado;
import usuarios.vistas.VentanaAMEncargado;

/**
 *
 * @author mariana
 */
public class ControladorPrincipalGUI {
    public static void main(String[] args) {
       establecerLookAndFeel("Nimbus"); 

        // 1. PRODUCTO
        VentanaAMProducto ventanaProd = new VentanaAMProducto(null);
        ventanaProd.setLocationRelativeTo(null);
        ventanaProd.setTitle("Nuevo producto");
        ventanaProd.setVisible(true);

        // 2. CLIENTE
        VentanaAMCliente ventanaCli = new VentanaAMCliente(null);
        ventanaCli.setLocationRelativeTo(null);
        ventanaCli.setTitle("Nuevo cliente");
        ventanaCli.setVisible(true);

        // 3. EMPLEADO
        VentanaAMEmpleado ventanaEmp = new VentanaAMEmpleado(null);
        ventanaEmp.setLocationRelativeTo(null);
        ventanaEmp.setTitle("Nuevo empleado");
        ventanaEmp.setVisible(true);

        // 4. ENCARGADO
        VentanaAMEncargado ventanaEnc = new VentanaAMEncargado(null);
        ventanaEnc.setLocationRelativeTo(null);
        ventanaEnc.setTitle("Nuevo encargado");
        ventanaEnc.setVisible(true);
       }
    
    /**
     * Asigna el look and feel especificado a la ventana
     * @param laf cadena con el nombre del look and feel
     */
    public static void establecerLookAndFeel(String laf) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if (laf.equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                }
            }
        } catch (Exception e) {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } 
            catch (Exception e2) {
            }
        }
    }
}