/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practicas13;
import java.util.Scanner;
        
public class PRACTICAS13 {

    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        double X;
        System.out.println("Ingresa el valor de A");
        double A = entrada.nextInt();
        System.out.println("Ingresa el valor de B");
        double B = entrada.nextInt();
        
        if ( A != 0 ) {
        X=-B/A;
        System.out.print("Solucion de la ecuacion:" + X);
    
        }else {
            System.out.print("solucion imposible");
        }
        
    }
}
