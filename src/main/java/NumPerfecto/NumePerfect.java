/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NumPerfecto;

import java.util.Scanner;

/**
 *
 * @author Tere
 */
public class NumePerfect {
     
    public static void main(String[] args) {
      int i, suma = 0, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        n = sc.nextInt();
        for (i = 1; i < n; i++) {  // i son los divisores. Se divide desde 1 hasta n-1                            
            if (n % i == 0) {
                suma = suma + i;   // si es divisor se suma
                 System.out.println("Los Divisores de " + n + " son: " + i );
            }
        }
        if (suma == n) {           // si el numero es igual a la suma de sus divisores es perfecto                
            System.out.println(" Es Perfecto");
        } else {
            System.out.println("No es perfecto");

        }
    }
}

