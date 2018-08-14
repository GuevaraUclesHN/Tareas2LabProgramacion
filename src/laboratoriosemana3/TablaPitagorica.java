
package laboratoriosemana4;
import java.util.Scanner;
public class TablaPitagorica {
    public static void main(String[] args) {
    Scanner lea = new Scanner(System.in);
    
        System.out.println("Ingrese ");
        int n = lea.nextInt();
        
        
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i*j+"\t");
            }
            System.out.println("");
        }
   
        
        
    } 
}
