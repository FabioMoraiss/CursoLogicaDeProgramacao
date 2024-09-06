package Exercicios.While;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("me de um numero usuario!");
        int numeroBase = sc.nextInt();

        int contador = 0;
        while (contador<=11) {
            int resultado = numeroBase * contador;
            System.out.println(numeroBase + " x " + contador + " = " + resultado);
            contador++;
        }


    }
}
