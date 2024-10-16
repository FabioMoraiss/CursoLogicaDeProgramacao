package Exercicios.matrizes;

public class ExbirMatrizes {
    public static void main(String[] args) {
        int[][] x = {
        {01,02,03,4},
        {5,6,7,8},
        {9,10,11,12}};
        exbirMatriz(x);
    }

    public static void exbirMatriz(int[][] matriz) {
        for(int i =0; i<matriz.length; i++) {
            for(int j = 0; j<matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
