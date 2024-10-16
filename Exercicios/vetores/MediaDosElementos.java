package Exercicios.vetores;

public class MediaDosElementos {
    public static void main(String[] args) {
        int[] vetor = {5,7, 9, 22, 14};
        int soma = 0;
        double media = 0;

        for(int i =0; i<vetor.length; i++) {
            soma = soma + vetor[i];
        }

        media = (double) soma / vetor.length;
        System.out.println(media);
    }
}
