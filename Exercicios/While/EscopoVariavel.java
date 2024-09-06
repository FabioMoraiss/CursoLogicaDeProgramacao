package Exercicios.While;

public class EscopoVariavel {
    public static void main(String[] args) {
        int c = 10;
        while (c>=0) {
            int VariavelTeste = 4;
            VariavelTeste++;
            System.out.println(VariavelTeste);
            c--;
        }

        {
            int variavelDesseEscopo = -1;
            variavelDesseEscopo--;
            variavelDesseEscopo = 10;
        }

        int variavelDesseEscopo = 2000;
        System.out.println(variavelDesseEscopo);
    }
}
