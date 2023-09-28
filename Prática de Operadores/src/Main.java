import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
            int soma, subt, mult, quociente, resto;
            Double x, y, divExata, raizQuadrada, raizCubica, cubo, quadrado;

            Scanner sc = new Scanner(System.in);
            System.out.println("Insira o valor de x: ");
                x = sc.nextDouble();
            System.out.println("Insira o valor de y: ");
                y = sc.nextDouble();
                Double hipotenusa = Math.pow(x, 2) + Math.pow(y, 2);

            soma = (int) (x + y);
            subt = (int) (x - y);
            mult = (int) (x * y);
            quociente = (int) (y / x);
            resto = (int) (x % y);
            divExata = x / y;
            raizQuadrada = Math.sqrt(x);
            raizCubica = Math.cbrt(x);
            cubo = Math.pow(x, 3);
            quadrado = Math.pow(x, 2);

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