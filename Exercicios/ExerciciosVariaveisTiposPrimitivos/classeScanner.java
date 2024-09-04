import java.util.Scanner;

public class classeScanner {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String nomeUsuario; 

        System.out.println("OLÁ USUARIO, POR FAVOR DIGITE O SEU NOME: ");
        nomeUsuario = entrada.nextLine();
        System.out.println("olá " + nomeUsuario + ", seja muito bem vindo");
    }
}
