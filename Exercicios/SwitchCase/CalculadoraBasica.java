package Exercicios.SwitchCase;

import java.util.Scanner;

public class CalculadoraBasica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float resultado;

        System.out.println("QUEIRO USUARIO, POR FAVOR, DIGITE 2 NUMEROS INTEIROS");
        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();

        System.out.println("QUERIDO USUARIO, QUAL OPERAÇÃO DESEJA FAZER ?");
        String operacao = sc.next();

        switch (operacao) {
            case "+":
                resultado = numero1 + numero2;
                break;
            case "-":
                resultado = numero1 - numero2;
                break;
            case "*":
                resultado = numero1 * numero2;
                break;
            case "/":
                resultado = (float) numero1 / numero2;
                break;
            case "%":
                resultado = numero1 % numero2;
                break;
            default:
                System.out.println("operação INVALIDA");
                resultado = -1;
                break;
        }

        if(operacao == "+") {
            resultado = numero1 + numero2;
        }

        System.out.println("O RESULTADO DA SUA OPERAÇÃO FOI " + resultado);
    }
}
