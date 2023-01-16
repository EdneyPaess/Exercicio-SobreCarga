/* Cria uma aplicação que calcula área dos 3 quadriláteros notáveis: Quandrado, retângulo e trapézio.
Obs:Use sobrecarga */

public class ExercSobrecarga {
    public static double area (double quadrado) {

        return  quadrado * quadrado;
    }

    public static double area (double largura, double altura) {

        return largura * altura;
    }

    public static double area (double baseMaior, double baseMenor, double altura) {

        return ((baseMaior + baseMenor) * altura) / 2;
  
    }

/*     public static void area (double diagonal1, double        diagonal2) {

        double resultado= (diagonal1 * diagonal2) / 2;
        System.out.println("A área do retângulo é: " + resultado);
    } */

    // O código acima ele alerta um erro devido os tipos de dados dele ser o mesmo tipo de dado do código da linha 11, mesmo o nome sendo diferente, ele acusa erro devido o tipo de dado ser diferente, para arrumar isso podemos trocar para float

    public static float area (Float diagonal1, Float        diagonal2) {

        return (diagonal1 * diagonal2) / 2;
  
    } 
    //Agora sim da certo, e na hora de chamar esse método lá no método main, para diferenciar o tipo de dados, para double colocamos D no final do numero e F no final do numero Float
}

// Então aqui temos 3 sobrecargas, métodos com o mesmo nome porém com parametros diferentes.
