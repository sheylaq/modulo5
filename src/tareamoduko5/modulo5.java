/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareamoduko5;

import helpers.Circulo;
import helpers.Cuadrado;
import helpers.Linea;
import helpers.Triangulo;

/**
 *
 * @author user
 */
public class modulo5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Circulo circulo = new Circulo();
        Triangulo triangulo = new Triangulo();
        Cuadrado cuadrado = new Cuadrado();
        Linea linea = new Linea();
       
            System.out.println(  circulo.dibujar());
         System.out.println("Area: " +circulo.calcularRadio());
   
         System.out.println("------------------------------\n");
       System.out.println(  linea.dibujar()); 
        
         System.out.println("------------------------------\n");
          System.out.println( cuadrado.dibujar());
        System.out.println("Area: " + cuadrado.calcularArea());
         
                  System.out.println("------------------------------\n");
                System.out.println( triangulo.dibujar());
System.out.println("Area: " + triangulo.calcularArea());
 System.out.println("------------------------------\n");
     
        
        
        
        
    }
    
}
