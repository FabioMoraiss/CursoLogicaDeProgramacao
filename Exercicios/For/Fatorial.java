package Exercicios.For;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("usuario, digite um numero para fatoriar!");
        int numero = sc.nextInt();
        int soma= 1; 

        for (int i = 1; i<=numero; i++) {
           soma = i * soma;
        }

        for ( string : args) {
            
        }

        System.out.println(soma);
    }
}
