import java.util.Scanner;

public class fahrenheit {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        
        float fahrenheit;
        float celsius;

        System.out.println("USUARIO! OLÁ! Digite uma temperatura em fahrenheit");
        fahrenheit = entrada.nextFloat();

        celsius = (fahrenheit -32) / 1.9f;

        System.out.println("a sua temperatura em celsius é " + celsius + " graus");
    }
}
