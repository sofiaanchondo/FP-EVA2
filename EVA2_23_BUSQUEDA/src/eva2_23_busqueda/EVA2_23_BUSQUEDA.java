/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_23_busqueda;
import java.util.Scanner;

/**
 *
 * @author Sofia
 */
public class EVA2_23_BUSQUEDA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        int valor, posi = -1; //SIGNIFICA QUE NO LO ENCONTRAMOS -1
        int datos[] = new int[10];
        
        for (int i = 0; i < datos.length; i++) {
            datos[i] = (int)(Math.random()*100);
        }
        for(int i = 0; i < datos.length; i++){
        System.out.print("[" + datos[i] + "]");
        
        }
        System.out.println("");
        System.out.println("valor a buscar: ");
        valor = captu.nextInt();
        //BUSQUEDA LINEAL
        
       for(int i=0; i < datos.length; i++){
        if(valor == datos [i]){//LO ENCONTRAMOS
            posi = i; //REFRESAMOS DONDE LO ENCONTRAMOS
            break;//YA LO ENCONTRAMOS DETIENE BUSQUEDA
        }
         }
       System.out.println("Posicion: "+ posi);
       
        
    }
    
}
