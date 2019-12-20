/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg9;

import java.util.Scanner;

/**
 *
 * @author Laboratorio
 */
public class Ejercicio9 {
static final double IVA = 0.21;
    /**
     * Lee un número por teclado que pida el precio de un producto (puede tener decimales)
     * y calcule el precio final con IVA. El IVA sera una constante que sera del 21%.
     */
    public static void main(String[] args) {
       Scanner Teclado = new Scanner(System.in);
        double Precio;

      
        System.out.println("Digite el precio de un producto: ");
        Precio = Teclado.nextDouble();
        Precio= Precio+Precio*IVA;
        
        System.out.println("El precio real con IVA es de: "+Precio);
    }
    
}
