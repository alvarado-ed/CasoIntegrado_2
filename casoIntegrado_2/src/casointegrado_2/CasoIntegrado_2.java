/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casointegrado_2;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author alvarados
 */
public class CasoIntegrado_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String arrProductos[][] = new String[7][5];
        String diasSemana[] = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};

        for (int i = 0; i < 5; i++) {
            {
                String producto = JOptionPane.showInputDialog("Ingrese el producto " + (i + 1));
                if (producto == null) {
                    return;
                }
                productos[i] = producto;
                

                
            
            }
        }
    }

    public static void ventas(String[][] arrProductos, String[] productos) {
        Random random = new Random(10);
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 5; j++) {
                int indiceAleatorio = random.nextInt(productos.length);
                arrProductos[i][j] = productos[indiceAleatorio];
            }
        }
    }

    public static void mejorVenta(String[][] arrProductos, String[] diasSemana, String[] productos) {
        String resultado = "Producto mas vendido por dia:\n";
        for (int i = 0; i < 7; i++) {
            String productoMasVendido = "";
            int maxCan = 0;
            for (String producto : productos) {
                int conteo = 0;
                for (int j = 0; j < 5; j++) {
                    if (comparar(arrProductos[i][j], producto)) {
                        conteo++;
                    }
                }
                if (conteo > maxCan) {
                    maxCan = conteo;
                    productoMasVendido = producto;
                }
            }
            resultado += diasSemana[i] + ": " + productoMasVendido + "\n";
        }
        JOptionPane.showMessageDialog(null, resultado);
    }

    public static boolean comparar(String cadena1, String cadena2) {
        if (cadena1.length() != cadena2.length()) {
            return false;
        }
        for (int i = 0; i < cadena1.length(); i++) {
            if (cadena1.charAt(i) != cadena2.charAt(i)) {
                return false;
            }
        }
        return true;

}
    
}



