package pratica.de.matematica;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner ex1 = new Scanner(System.in);
        System.out.println("Insira o valor de x: ");
        double x    = ex1.nextDouble();
        System.out.println("Insira o valor de y: ");
        double y = ex1.nextDouble();

        calcularEImprimirResultados(x, y);
    }

            public static void calcularEImprimirResultados(double x, double y) {
                double hipotenusa = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
                int soma = (int) (x + y);
                int subt = (int) (x - y);
                int mult = (int) (x * y);
                int quociente = (int) (y / x);
                int resto = (int) (x % y);
                double divExata = x / y;
                double raizQuadrada = Math.sqrt(x);
                double raizCubica = Math.cbrt(x);
                double cubo = Math.pow(x, 3);
                double quadrado = Math.pow(x, 2);

                System.out.println("A hipotenusa de X e Y ao quadrado é: " + hipotenusa);
                System.out.println("A soma de " + x + " + " + y + " é: " + soma);
                System.out.println("A subtração de " + x + " - " + y + " é: " + subt);
                System.out.println("A multiplicação de " + x + " * " + y + " é: " + mult);
                System.out.println("O quociente de " + x + " / " + y + " é: " + quociente);
                System.out.println("O resto de " + x + " % " + y + " é: " + resto);
                System.out.println("A divisão exata de " + y + " / " + x + " é: " + divExata);
                System.out.println("A raiz quadrada de " + x + " é: " + raizQuadrada);
                System.out.println("A raiz cúbica de " + x + " é: " + raizCubica);
                System.out.println("O cubo de " + x + " é: " + cubo);
                System.out.println("O quadrado de " + x + " é: " + quadrado);
                System.out.println("X multiplicado por PI é: " + x * Math.PI);
    }
}
