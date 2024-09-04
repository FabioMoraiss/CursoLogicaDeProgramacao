import java.util.Scanner;

public class PassouDeAno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean passouPorMedia;
        boolean passouProvaRecuperacao;
        boolean aprovado;



        System.out.println("você passou por media ?");
        passouPorMedia = sc.nextBoolean();

        if(passouPorMedia) {
            System.out.println("PARABENS VOCÊ É MUITO INTELIGENTE");
        } else {
            System.out.println("você passou na prova de recuperação ?");
            passouProvaRecuperacao = sc.nextBoolean();
            
            if(passouProvaRecuperacao){
                System.out.println("PARABENS VOCÊ PASSOU");
            } else {
                System.out.println("VOCÊ REPROVOU! NAO NAO SABE VAI TER QUE APRENDER");
            }
        }



    }
}
