/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_19_do_while;
import java.util.Scanner;

/**
 *
 * @author Sofia
 */
public class EVA2_19_DO_WHILE {
    final static String USUARIO = "admin";
    final static String PWD = "admin";
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    //PEDIMOS DATOS DE ACCESO
Scanner captu = new Scanner (System.in);
String usu,contra;
//VALIDAMOS
//INCORRECTO--> VOLVER A PREGUNTAR 
//CORRECTO-->ACCESO AL SISTEMA
do{
System.out.println("Usuario: ");
usu = captu.nextLine();
System.out.println("Contraseña: ");
contra = captu.nextLine();
}while(!(usu.equals(USUARIO)&& contra.equals(PWD)));

if(usu.equals(USUARIO)&& contra.equals(PWD))
    //VALIDAR
    System.out.println("Acceso concedido, bienvenido");
else 
    System.out.println("Acceso denegado");







        
    }
    
}
