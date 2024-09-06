package Exercicios.While;

public class breakk {
    public static void main(String[] args) {
        
        int c = 2;
        while (true) {
            while (true) {
                if (c<=0) {
                    break;
                }
                System.out.println(c);
                c--;
            }
            System.out.println("codigo a ser executado");
        }
    }
}
