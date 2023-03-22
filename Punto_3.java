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
public class Punto_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("\nInserte el numero de latas\n");
        int cans = leer.nextInt();
        int aux = cans, cotator = 1;
        do {

            if (aux > 0) {
                aux -= cotator;
                cotator++;
            }

            if (aux == 0) {
                System.out.println(" no le hace faltan latas para armar una piramide por que quedo justa");
                break;
            } else if (aux < 0) {
                System.out.println("le faltan " + (aux * -1) + " para poder hacer el sigiente piso ");
                break;
            }

        } while (aux > 0);
    }
}
