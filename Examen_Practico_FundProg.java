
package examen_practico_fundprog;

import java.util.Scanner;


public class Examen_Practico_FundProg {

    
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        
        System.out.println("Elige Piedra (1) papel (2) o tijera (3):");
        int eleccionUsuario = scanner.nextInt();
        
        //Generar aleatoriamente piedra (1) papel (2) tijera (3)
        int eleccionMaquina = (int) (Math.random() * 2) + 1;
        
        if (eleccionUsuario == eleccionMaquina) {
            if (eleccionUsuario == 3 ) {
                System.out.println("¡Has elegido piedra y has ganado!");
                 System.out.println("¡Has elegido papel y has ganado!");
            } else {
                System.out.println ("¡Has elegido tijera y has ganado!");
            }
        } else { 
            if (eleccionUsuario == 1) {
               System.out.println("¡Has elegido piedra pero has perdido!"); 
            } else {
                 System.out.println("¡Has elegido papel pero has perdido!");
                 System.out.println ("¡Has elegido tijera pero has perdido!");
                 
                 //PREGUNTAR: CANTIDAD DE VECES QUE GANO LA COMPUTADORA Y EL USUARIO
                 int ganarComputadora;
                   
        Scanner captu = new Scanner (System.in);
        System.out.println("¿Cuantas veces gano la computadora y por el usuario?");
        
        ganarComputadora = captu.nextInt();
        for (int i = 1; i <= ganarComputadora; i++) { 
            System.out.println("cantidad de veces que gano");
            int cantVeces = captu.nextInt();
        
       
       
        
       
        
        
        
        
        
        }
        }
    }
}
}


       
    
    

