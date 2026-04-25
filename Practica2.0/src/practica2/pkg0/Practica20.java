
package practica2.pkg0;

import java.util.Scanner;

/**
 *
 * @author Nyv
 */
public class Practica20 {

    public static void main(String[] args) {
        int horas, min, seg;
        
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Ingrese los segundos");
        seg = lector.nextInt();
        
        System.out.println("Ingrese los minutos");
        min = lector.nextInt();
        
        System.out.println("Ingrese las horas");
        horas = lector.nextInt();
        
        if(horas<0|| horas>23||
           min<0 || min>59||
           seg<0 || seg>59){
            System.out.println("LOS DATOS SON INVALIDOS. ERROR");
        }
        
        seg++;
        if(seg==60){
            seg=0;
            min++;
            if(min==60){
                min=0;
                horas++;
                if(horas==24){
                    horas=0;
                }
            
            }
        
        }
     
        System.out.printf("Resultado: %02d:%02d:%02d%n", horas,min,seg);
        
        
        
        
        
        
    }
    
}
