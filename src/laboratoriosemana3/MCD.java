package laboratoriosemana4;

import java.util.Scanner;

public class MCD{
    public static void main(String[] args) {
        System.out.println("******** PROGRAMA CALCULO MCD ********");
        System.out.println("Calcula el maximo comun divisor de 2 numeros");
        
        Scanner lea = new Scanner(System.in);
        
        int numero1, numero2;
        
        System.out.print("Ingrese numero 1: ");
        numero1=lea.nextInt();
        
        System.out.print("Ingrese numero 2: ");
        numero2=lea.nextInt();
        
        int dividendo = Math.max(numero1, numero2);
        int divisor = Math.min(numero1, numero2);
        int residuo = 0;
        
        do {
            residuo=dividendo % divisor;
            
            dividendo=divisor;
            divisor = residuo;
        
        
        } while (residuo != 0);
        System.out.printf("El maximo comun Divisor de %d y %d es %d ",numero1,numero2,dividendo);
           
    }    
}
