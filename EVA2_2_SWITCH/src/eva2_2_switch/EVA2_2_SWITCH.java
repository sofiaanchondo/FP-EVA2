/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_2_switch;
import java.util.Scanner;

/**
 *
 * @author mikas
 */
public class EVA2_2_SWITCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner (System.in);
        int opc;
        System.out.println("1. consultar saldo");
        System.out.println("2.Retirar monto");
        System.out.println("3. depositar monto");
        System.out.println("Selecciona una opcion del menu");
        opc = captu.nextInt();
        switch(opc){
        case 1:
            System.out.println("elegiste imprimir saldo!!");
            break;// ROMPRE O DETINENE INSTRUCCION
        case 2:
            System.out.println("elegiste retirar saldo");
            break;// FIN DEL SWITCH
        case 3:
            System.out.println("elegiste depositar saldo");
            break;
        default:
            System.out.println("OPCION INCORRECTA");
        
        }
        
        
        
        
        
        
    }
    
}
