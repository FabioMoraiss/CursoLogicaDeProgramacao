package Exercicios.While;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ME DE UM NUMERO PARA FATORIAR");
        int fatoriando = sc.nextInt();
        int fatoriandoOrigianl = fatoriando;
        int soma = 0;

        while(fatoriando>=1) {
            if(fatoriando == fatoriandoOrigianl) {
                soma = fatoriando * (fatoriando -1);
                fatoriando --;
                fatoriando --;
            } else {
                soma = soma * fatoriando;
                fatoriando --;
            }
            
        }

        System.out.println("seu fatorial eh " + soma);
    }
}
