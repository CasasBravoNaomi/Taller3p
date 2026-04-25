/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica2.pkg0;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        double soles, total = 0;
        int opcion;
        String moneda = null;
        
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad en soles (PEN)");
        soles = lector.nextDouble();
        
        String menu="""
                    SELECCIONE LA MONEDA DESTINO:
                    1.DOLARES AMERICANOS(USD)
                    2.EUROS(EUR)
                    3.LIBRAS ESTERLINAS(GBP)
                    4.PESOS MEXICANOS(MXN)
                    """;
        
        System.out.println("Opcion elegida:");
        opcion = lector.nextInt();
        
        switch(opcion){
            case 1:
                total =  soles*0.27;
                moneda = "USD";
                break;
            case 2:
                total =  soles*0.25;
                moneda = "EUR";
                break;
            case 3:
                total =  soles*0.21;
                moneda = "GBP";
                break;
            case 4:
                total =  soles*4.50;
                moneda = "MXN";
                break;
            default:
                System.out.println("MONEDA NO DISPONIBLE");
                
        }
        
        System.out.printf("Resultado: %.2f soles equivalen a %.2f%s%n", soles, total, moneda);
        
        
        
        
        
        
    }
    
    
    
    
    
    
}
