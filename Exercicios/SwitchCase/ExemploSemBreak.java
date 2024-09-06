package Exercicios.SwitchCase;

import java.util.Scanner;

public class ExemploSemBreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número de 1 a 3:");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Você escolheu a opção 1");
            case 2:
                System.out.println("Você escolheu a opção 2");
            case 3:
                System.out.println("Você escolheu a opção 3");
            default:
                System.out.println("Opção inválida!");
        }
    }
}
