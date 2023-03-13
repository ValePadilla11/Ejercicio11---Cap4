/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11.cap4;

import java.util.Scanner;

public class Ejercicio11Cap4 {

    public static void main(String[] args) {
        double N1, N2, N3, MAYOR;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Numero uno: ");
        N1 = entrada.nextDouble();
        
        System.out.println("Numero dos: ");
        N2 = entrada.nextDouble();
        
        System.out.println("Numero tres: ");
        N3 = entrada.nextDouble();
        
        if (N1 > N2 && N2 > N3) {
            MAYOR = N1;
            System.out.println("EL VALOR MAYOR ENTRE: " + N1+" "+ N2+ " Y "+ N3 + " ES :" + MAYOR);
        } else if (N2 > N1 && N1 > N3) {
            MAYOR = N2;
            System.out.println("EL VALOR MAYOR ENTRE: " + N1+" "+ N2+ " Y "+ N3 + " ES :" + MAYOR);
        } else 
            MAYOR = N3;
            System.out.println("EL VALOR MAYOR ENTRE: " + N1+" "+ N2+ " Y "+ N3 + " ES :" + MAYOR);              
    }
    
}
