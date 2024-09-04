import java.util.Scanner;

public class olaUsuario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        byte idadeDoUsuario;
        String nomeDoUsuario;

        System.out.println("Olá, qual seu nome ?");
        nomeDoUsuario = entrada.nextLine();
        System.out.println("qual a sua idade ?");
        idadeDoUsuario = (byte) entrada.nextInt();

        System.out.println("olá " + nomeDoUsuario + ", você tem exatamente "+ idadeDoUsuario + " anos");
    }
}
