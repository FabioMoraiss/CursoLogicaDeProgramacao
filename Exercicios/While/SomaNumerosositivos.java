package Exercicios.While;

import java.util.Scanner;

public class SomaNumerosositivos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("USUARIO, INSIRA NUMEROS POSITIVOS ATÉ QUANDO QUISER");
        System.out.println("quando quiser parar, digite um numero negativo");

        int valor = sc.nextInt();
        int soma =0;

        while (valor>0) {
            soma = soma + valor;
            valor = sc.nextInt();
        }


        System.out.println("a soma total dos valores POSITIVOS digitados foi de: " + soma);
       
    }
}
