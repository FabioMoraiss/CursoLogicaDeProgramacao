package Exercicios.vetores;

import java.util.Arrays;
import java.util.Collections;

public class VetorInverso {
    public static void main(String[] args) {
        Integer[] vetor = {1, 14, 18, 2, 100, 4, 200, 17};

         Arrays.sort(vetor);

        for(int i = 0; i<vetor.length ;i++ ) {
            System.out.println(vetor[i]);
        }
    }
}
