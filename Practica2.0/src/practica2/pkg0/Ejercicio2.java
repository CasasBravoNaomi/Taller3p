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
public class Ejercicio2 {
    public static void main(String[] args) {
        
        double prom, pensionb, pensiond = 0, pension, pf;
        int contado;
        
        Scanner lector = new Scanner (System.in);
        
        System.out.println("Ingrese su promedio");
        prom = lector.nextDouble();
        
        System.out.println("Ingrese su pension base");
        pensionb = lector.nextDouble();
        
        System.out.println("Pagara al contado? (1: Si/ 2:No)");
        contado = lector.nextInt();
        
        if(prom>=18 && prom<=20){
            pensiond = pensionb*0.2;
            pension = pensionb - pensiond;
        }else if(prom>=15 && prom<=17.99){
            pensiond = pensionb*0.1;
            pension = pensionb - pensiond;
        }else if(prom>=13 && prom<=14.99){
            pensiond = pensionb*0.05;
            pension = pensionb - pensiond;
        }else{
            pension=pensionb;
            
        }
        
        double resultado=(contado==1)? 50:0;
        pf = pension - resultado;
        
        System.out.println("---DESGLOSE DE MATRICULA---");
        System.out.printf("Pension base: S/%.2f%n", pensionb);
        System.out.printf("Descuento por promedio: S/%.2f%n", pensiond);
        System.out.printf("Bono pago al contado: S/%.2f%n", resultado);
        System.out.printf("Monto final a pagar: S/%.2f%n", pf);
        System.out.println("----------------------------");
        
             
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
