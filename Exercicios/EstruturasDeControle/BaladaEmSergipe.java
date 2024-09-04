import java.util.Scanner;

public class BaladaEmSergipe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int entradaPadrao = 80;
        final int idadeMinima = 18;
        final int idadeMelhorIdade = 60;
        final int limitePrimeiraFaixaEtaria =26;
        int precoPAGAR = -1;
        

        System.out.println("quantos anos você tem ?");
        int idade = sc.nextInt();
        System.out.println("quantas pessoas estão te acompando ?");
        int numeroAmigos = sc.nextInt();


        if(idade<18 || idade>60) {
            System.out.println("não podem entrar");
            precoPAGAR = 0;
        } else if(idade<26) {
            precoPAGAR = entradaPadrao;
            if(numeroAmigos >0) {
                precoPAGAR = 0;
            }
        } else if(idade>=26 && idade<=30) {
            precoPAGAR = entradaPadrao;
        } else if (idade>=31 && idade<60) {
            precoPAGAR = entradaPadrao * 2;
        }


        System.out.println("preço a pagar = " + precoPAGAR);


    }
}
