package Exercicios.vetores;

public class MaiorNumero {
    public static void main(String[] args) {
        int[] vetor= {5, 7, 9, 14, 22, 17, 200, 400, 4, 8, 12, 20, -100, -1000, - 300};

        int menorValor = Integer.MAX_VALUE;
        for(int i =0; i<vetor.length; i++) {
            if(vetor[i] < menorValor){
                menorValor = vetor[i];
            }
        }

        System.out.println(menorValor);
    }
}
