package Exercicios.matrizes;

public class SomaMatriz {
    public static void main(String[] args) {
        int[][] matriz = {
            {20, 30, 40, 1},
            {2, 7, 8, 16},
            {200, 700, 800, 234},
            {9,18, 17, 22}
        };
        ExbirMatrizes.exbirMatriz(matriz);
        //somaMatriz(matriz);
        System.out.println(somaMatriz(matriz));
    }

    public static int somaMatriz(int[][] matriz) {
        int soma =0;
        for(int i =0; i<matriz.length; i++) {
            for(int j =0; j<matriz[i].length; j++) {
                soma = soma + matriz[i][j];
            }
        }


        return soma;
    }
}
