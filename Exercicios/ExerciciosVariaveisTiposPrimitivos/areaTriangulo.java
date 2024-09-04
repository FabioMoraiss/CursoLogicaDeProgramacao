import java.util.Scanner;

public class areaTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float baseTriangulo;
        float alturaTriangulo;

        System.out.println("qual a base do triangulo ?");
        baseTriangulo = sc.nextFloat();
        System.out.println("qual a altura do triangulo ?");
        alturaTriangulo = sc.nextFloat();

        float areaTriangulo = (baseTriangulo * alturaTriangulo) /2;
        System.out.println("a área do triangulo é: " + areaTriangulo);



    }
}
