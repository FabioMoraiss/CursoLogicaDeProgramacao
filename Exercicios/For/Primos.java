package Exercicios.For;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Primos {
    public static void main(String[] args) {
        // Definindo o limite de 1 bilhão
        int limite = 1_000_000;

        // Medir o tempo de execução (início)
        long inicio = System.currentTimeMillis();

        // Gravando os números primos em um arquivo
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("primos.txt"))) {
            for (int i = 2; i <= limite; i++) {
                boolean ehPrimo = true;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        ehPrimo = false;
                        break;
                    }
                }
                if (ehPrimo) {
                    writer.write(i + "\n");
                }
                
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Medir o tempo de execução (fim)
        long fim = System.currentTimeMillis();
        long tempoGasto = fim - inicio;
        
        System.out.println("Tempo gasto: " + tempoGasto + " milissegundos");
    }
}
