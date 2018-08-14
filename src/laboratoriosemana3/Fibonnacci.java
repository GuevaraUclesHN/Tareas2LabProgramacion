package laboratoriosemana4;

import java.util.Scanner;

public class Fibonnacci {
    public static void main(String[] args) {
Scanner lea = new Scanner (System.in);
int numero,aux1,aux2,aux3;        
          
do{ 
System.out.print("Ingrese un numero para calcular la serie Fibonnacci: ");
numero=lea.nextInt();
aux1=0;
aux2=1;

for (aux3 = 2; aux3 <= numero; aux3++) {
            aux2=aux1+aux2;
            aux1=aux2-aux1;    
    }
System.out.println("El numero de la serie Fibonacci para "+numero+" seria : "+aux2);

  

} while (numero>0);
    }
    
}
