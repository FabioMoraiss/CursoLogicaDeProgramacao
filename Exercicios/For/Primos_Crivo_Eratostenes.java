package Exercicios.For;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Primos_Crivo_Eratostenes {
    public static void main(String[] args) {
        // Definindo o limite de 1 milhao
        int limite = 1_000_000;
        
        // Medir o tempo de execução (início)
        long inicio = System.currentTimeMillis();

        // Crivo de Eratóstenes
        boolean[] ehPrimo = new boolean[limite + 1];
        
        // Inicializando todas as posições como verdadeiras, assumindo que todos são primos
        for (int i = 2; i <= limite; i++) {
            ehPrimo[i] = true;
        }

        // Aplicando o Crivo de Eratóstenes
        for (int i = 2; i * i <= limite; i++) {
            if (ehPrimo[i]) {
                // Elimina múltiplos de i
                for (int j = i * i; j <= limite; j += i) {
                    ehPrimo[j] = false;
                }
            }
        }

        // Gravando os números primos em um arquivo
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("primosCrivoEratostenes.txt"))) {
            for (int i = 2; i <= limite; i++) {
                if (ehPrimo[i]) {
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
