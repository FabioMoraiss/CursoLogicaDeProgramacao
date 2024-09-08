package Exercicios.For;

public class Primos {
    public static void main(String[] args) {
        
        for (int i = 1; i <=100; i++) {
            boolean ehPriemo = true;
            for (int j = 2; j <i; j++) {
                if(i % j == 0) {
                    ehPriemo = false;
                    break;
                }
            }
            if(ehPriemo) {
                System.out.println(i);
            }
        }
    }
}
