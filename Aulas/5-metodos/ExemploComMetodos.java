
public class ExemploComMetodos {
  public static void main(String[] args) {
    // Chamando o método para calcular a área de dois retângulos
    int area1 = cauculaAreaRetangulo(5, 10);
    System.out.println("Área do primeiro retângulo: " + area1);

    int area = cauculaAreaTriangulo(2, 3);
    System.out.println(area);

    cauculaAreaTriangulo(3.0, 4.0);


    funcaoTest(5, 5.0f, " MEU TEXTO PREFERIDO");
  }

  // Método para calcular a área de um retângulo
  public static int cauculaAreaRetangulo(int largura, int altura) {
    return largura * altura;
  }

  public static int cauculaAreaTriangulo(int base, int altura) {
    int area = (base * altura) / 2;
    return area;
  }

  public static int cauculaAreaTriangulo(int base, int altura, int angulo1) {
    int area = (base * altura) / 2;
    return area;
  }

  public static double cauculaAreaTriangulo(double base, double altura) {
    double area = (base * altura) / 2;
    return area;
  }

  public static int funcaoTest(int base, float altura, String string) {
    int area = (int) (base * altura) / 2;
    return area;
  }

  public static void retornoVoid() {
   System.out.println("retornando void...");
  }
}
