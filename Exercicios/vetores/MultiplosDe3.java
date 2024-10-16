package Exercicios.vetores;

public class MultiplosDe3 {
    public static void main(String[] args) {
        int[] abacaxi = {2,4,6,8,10,12,14,16,18,20};

        for(int i=0; i<abacaxi.length; i++) {
            if(abacaxi[i] % 3 ==0) {
                System.out.println(abacaxi[i]);
            }
        }
    }
}
