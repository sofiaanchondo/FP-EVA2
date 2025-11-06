/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_29_contra_for;
import java.util.Scanner;

/**
 *
 * @author Sofia
 */
public class EVA2_29_CONTRA_FOR {
      final static String USUARIO = "admin";
    final static String PWD = "admin";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner (System.in);
        String usu,contra;
        boolean accesoCorrecto = false;
        for(int i = 1; i<= 4; i++){
           
        System.out.println("Usuario: ");
        usu = captu.nextLine();
        System.out.println("Contraseña: ");
        contra = captu.nextLine();
        if(usu.equals(USUARIO)&& contra.equals(PWD)){
            accesoCorrecto = true;
           break;
        }
        if(accesoCorrecto){
           System.out.println("Acceso concedido");
        }else{
           System.out.println("Acceso denegado");
        }
        }
        
        
    }  
}
    
         

    
    
    
    
    
        

    
    

      