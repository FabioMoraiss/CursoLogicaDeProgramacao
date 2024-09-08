import java.util.Arrays;

public class tamanhoVetor {
    public static void main(String[] args) {
        // Array original
        int[] vetorOriginal = {1, 2, 3, 4, 5};
        System.out.println(vetorOriginal);
        vetorOriginal = new int[10];
        
        // Novo tamanho do array
        int novoTamanho = 10;

        // Criar um novo array com o tamanho desejado
        int[] novoVetor = Arrays.copyOf(vetorOriginal, 10);

        // Exibir os elementos do novo array
        System.out.println(Arrays.toString(novoVetor));
    }
}
