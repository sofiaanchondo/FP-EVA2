/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_27_cuenta;
import java.util.Scanner;

/**
 *
 * @author Sofia
 */
public class EVA2_27_CUENTA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        int val;
        int cuenta = 1000000;
        do {
            System.out.println("cantidad a retirar");
            val = captu.nextInt();
            cuenta = cuenta - val;
            //CUENTA -= VAL;
        }while(cuenta > 0);
        System.out.println("Tu saldo es: "+ cuenta);
        
        
        
        
        
        
      
    }
    
}
