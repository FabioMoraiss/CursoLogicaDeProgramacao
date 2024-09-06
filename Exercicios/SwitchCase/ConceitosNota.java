package Exercicios.SwitchCase;

import java.util.Scanner;

public class ConceitosNota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("OLÁ USUARIO, DIGITE UM NUMERO DE 0 A 10");
        int nota = sc.nextInt();

        switch (nota) {
            case 10:
            case 9:
                System.out.println("conceito A");
                break;
            case 8:
            case 7:
                System.out.println("Conceito B");
                break;
            case 6:
            case 5:
                System.out.println("Conceito C");
                break;
            case 4:
            case 3:
                System.out.println("Conceito D");
                break;
            case 2:
            case 1:
            case 0:
                System.out.println("Conceito E");
                break;
            default:
                System.out.println("nota invalida");
                break;
        }

        if(nota>0 && nota<2) {
            System.out.println("Conceito A");
        }
    }
}
