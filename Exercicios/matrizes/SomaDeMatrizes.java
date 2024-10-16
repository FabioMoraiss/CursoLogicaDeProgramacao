package Exercicios.matrizes;

public class SomaDeMatrizes {
    public static void main(String[] args) {
        int[][] matriz1 = {
            {3, 4, 5},
            {8, 2, 4},
            {1 ,8, 3}
        };

        int[][] matriz2 = {
            {2, 4, 5},
            {8, 9, 4},
            {0 ,7, 1}
        };

        int[][] matrizResultado = somaDeMatrizes(matriz1, matriz2);
        ExbirMatrizes.exbirMatriz(matrizResultado);
    }

    public static int[][] somaDeMatrizes(int[][] matriz1, int[][] matriz2) {
        if(matrizesDeTamanhoIdentico(matriz1, matriz2)){
            int[][] resultado = new int[matriz1.length][matriz1[0].length];

            for(int i=0; i<matriz1.length; i++) {
                for(int j = 0; j<matriz1[0].length; j++) {
                    resultado[i][j] = matriz1[i][j] + matriz2[i][j];
                }
            }
            return resultado;
        } else {
            return null;
        }

        

    }

    public static boolean matrizesDeTamanhoIdentico(int[][] matriz1, int[][] matriz2) {
        if(matriz1.length == matriz2.length){
            if(matriz1[0].length == matriz2[0].length) {
                return true;
            }
        }
        return false;
    }


}
