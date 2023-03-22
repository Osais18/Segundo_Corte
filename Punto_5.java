/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller_1;

import java.util.Scanner;

/**
 *
 * @author OSAIS
 */
public class Punto_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int dato;
        System.out.println("\n Ingrese un numero para dibujar el triangulo equilatero:\n");
        dato = leer.nextInt();

        int[] acomodo = new int[dato];
        String[] numero  = new String[acomodo.length];
        String lata = " x ";
        int cont = 0,suma = 0;
        for (int i = 0; i <= acomodo.length - 1; i++) {
            cont += 1;
            suma = suma += cont;
            for (int j = 0; j <= suma - 1; j++) {
                numero[j] = lata; // le asignamos el x al inidice 0
                acomodo[j]++;
                if (suma-1 == dato) {
                    break;
                }
                System.out.print(numero[j]);
            }
            System.out.println("\n");
            cont = 0;
        }
    }
}
