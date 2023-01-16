public class main {
  public static void main(String[] args) {

    System.out.println("Exercícios quadrilátero:");

    double areaQuadrado= ExercSobrecarga.area (3d);
    System.out.println("Área do quadrado: " + areaQuadrado);

    double areaRetangulo= ExercSobrecarga.area (5d, 5d);
    System.out.println("Área do retângulo: " + areaRetangulo);

    System.out.println("Área do retângulo: " + areaRetangulo);

    double areaTrapezio= ExercSobrecarga.area (7d,8d,9d);
    System.out.println("Área do trapézio: " + areaTrapezio);

  }
}

//Agora podemos guardar os valores dos retornos dos métodos em váriaveis, dessa forma abre um leque para a reutilização dos métodos.
