package Exercicios.vetores;

public class SomaDosElementos {
    public static void main(String[] args) {
        int[] vetor = {10, 10, 10, 10, 10 ,10 ,10, 10, 90, 10 };
        int soma = 0;

        for(int i =0; i<vetor.length; i++) {
            soma = soma +vetor[i];
        }

        System.out.println(soma);
    }
}
