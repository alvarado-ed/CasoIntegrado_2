/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casointegrado_2;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author alvarados
 */
public class productos {

    private String productos;
    public String diasSemana;
    private int cantidad;

    public productos(String productos, String diasSemana, int cantidad) {
        this.productos = productos;
        this.diasSemana = diasSemana;
        this.cantidad = cantidad;
    }

    public productos() {
    }

    public String getProductos() {
        return productos;
    }

    public String getDiasSemana() {
        return diasSemana;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setProductos(String productos) {
        this.productos = productos;
    }

    public void setDiasSemana(String diasSemana) {
        this.diasSemana = diasSemana;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    
    @Override
    public String toString() {
        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}

    
        

            
            
           
        
            
            


        
            
        
        
            
       
    
    


   
    

