package Exercicios.SwitchCase;

import java.util.Scanner;

public class DiaSemana {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("me de um numero de 1 a 7");
        int diaSemanaNumero = entrada.nextInt();
        String diaSemanaTexto;

        switch (diaSemanaNumero) {
            case 1:
                diaSemanaTexto = "domingo";
                break;
            case 2:
                diaSemanaTexto = "segunda";
                break;
            case 3:
                diaSemanaTexto= "terça";
                break;
            case 4:
                diaSemanaTexto = "quarta";
                break;
            case 5:
                diaSemanaTexto = "quinta";
                break;
            case 6:
                diaSemanaTexto = "sexta";
                break;
            case 7:
                diaSemanaTexto = "sabado";
                break;
            default:
                diaSemanaTexto = "DIA INVALIDO, NAO EXISTE";
                break;
        }

        if(diaSemanaNumero == 1) {
            diaSemanaTexto = "domingo";
        } else if (diaSemanaNumero == 2) {
            diaSemanaTexto = "segunda";
        } else if(diaSemanaNumero == 3) {
            diaSemanaTexto= "terça";
        } else if(diaSemanaNumero == 4) {
            diaSemanaTexto = "quarta";
        } else if(diaSemanaNumero == 5) {
            diaSemanaTexto = "quinta";
        } else if (diaSemanaNumero == 6) {
            diaSemanaTexto = "sexta";
        } else if(diaSemanaNumero == 7) {
            diaSemanaTexto = "sabado";
        } else {
            diaSemanaTexto = "DIA INVALIDO, NAO EXISTE";
        }

        System.out.println("O DIA DA SEMANA EH " + diaSemanaTexto);
    }
}
