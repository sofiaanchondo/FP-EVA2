/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_10_for;
import java.util.Scanner;

/**
 *
 * @author Sofia
 */
public class EVA2_10_FOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        // TODO code application logic here
        // IMPRIMIR LOS NUM DEL 1 AL 20
        for(int i = 1; i <= 20; i++)
        System.out.println(i + " - ");
         // IMPRIMIR LOS NUM PARES DE 0 A 100
         // 0-2-4-6-8
         // += suma, -= resta, *= multi, /= divide
         for(int i = 0; i <= 100; i+=2)
         System.out.print(i + " - ");
         
         // REPITAN EL ANTERIOR, EN INVERSO
          for(int i = 100; i >= 0; i-=2)
         System.out.print(i + " - ");
          
         //IMPRIMIR LA LISTA DE NUM ENTRE CUALQUIER VALOR
         // QUE EL USUARIO QUIERA
         
         { int num1, num2;
        System.out.println("Introduce dos numeros");
          System.out.println("Introduce num 1");
          num1 = captu.nextInt();
          System.out.println("Introduce num 2");
          num2 = captu.nextInt();
           for(int i = num1; i <= num2; i++)
           System.out.print(i + " - ");
         }
           
           
           
         // IMPRIMIR LA TABLA DE MULTI 1 AL1 10 DE CUALQUIER NUMERO QUE DE EL USUARIO
         int numero;
           System.out.println("Introduce un numeros");
          System.out.println("Introduce numero");
          numero = captu.nextInt();
          for(int i = 0; i <= numero*10; i+= numero)
           System.out.print(i + " - ");
          
          
         
         
         
         
            }
    
}
