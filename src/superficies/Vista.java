/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superficies;

/**
 *la clase vista es para imprimir en pantalla.
 * @author ANDY PEÑA SAMPEDRO
 */
public class Vista {
    public void vista(Modelo mod){
        /**
         * Impresion por pantalla del cuadrado
         *@param mod
         */
       if (mod.getShapeType().equalsIgnoreCase("square")) {
          System.out.println("The area for your square: " + mod.getSquareArea());  
        }
       /**
        * Impresion por pantalla del rectangulo
        * @param mod
        */
        if (mod.getShapeType().equalsIgnoreCase("rectangle")) {
            System.out.println("The area for your rectangle is: " + mod.getRectangleArea());
                   }
        /**
         * Impresion por pantalla del triangulo
         * @param mod
         */
        if (mod.getShapeType().equalsIgnoreCase("triangle")) {
            System.out.println("Your triangles area is: " + mod.getTriangleArea());
        }
        /**
         * Impresion por pantalla del circulo
         * @param mod
         */
        if (mod.getShapeType().equalsIgnoreCase("circle")) {
            System.out.println("Your Circles area is " + mod.getCircleArea());
        }
        
        
        
    }
}
