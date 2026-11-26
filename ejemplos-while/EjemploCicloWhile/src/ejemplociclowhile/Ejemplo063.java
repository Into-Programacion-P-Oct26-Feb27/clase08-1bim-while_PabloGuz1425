/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplociclowhile;

import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author SALASC
 */
public class Ejemplo063 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        
        String pais;
        String capital;
        
        boolean bandera = true;
        String cadena = "";
        
        while(bandera==true){ // true == true // false == true
            System.out.println("Estoy en el ciclo"); //Estoy en el ciclo 
            
            System.out.println("Ingresar nombre del Pais");
            pais = entrada.nextLine();
            System.out.println("Ingresar nombre de la capital");
            capital = entrada.nextLine();
            
            cadena = String.format("%s%s\t%s\n",
                cadena, pais, capital);
            
            
            String salir;
            System.out.println("Desea salir del ciclo, ingrese si.");
            salir = entrada.nextLine();
            if (salir.equals("si")){ 
                bandera = false;
            }
            
        }
        System.out.printf("%s\n",cadena);
    }
}
/*
Poder delimitar un valor escrito por teclado con el cual se va a poder salir de
el ciclo.
*/