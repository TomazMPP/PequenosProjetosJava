import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(String.format("""
                Olá, bem-vindo a Calculadora Java desenvolvida por Tomaz!
                Insira o primeiro número!
                """));
        double primeiroNumero = input.nextDouble();
        System.out.println("Insira o segundo número!");
        double segundoNumero = input.nextDouble();
        System.out.println(String.format("""
                Agora insira a operação:
                + Adição
                - Substração
                * Multiplicação
                / Divisão
                """));
        char operador = input.next().charAt(0);
        input.close();
        double resultado;

        switch (operador) {
            case '+':
                resultado = primeiroNumero + segundoNumero;
                break;
            case '-':
                resultado = primeiroNumero - segundoNumero;
                break;
            case '*':
                resultado = primeiroNumero * segundoNumero;
                break;
            case '/':
                resultado = primeiroNumero / segundoNumero;
            default:
                System.out.println("Operação Inválida!");
                return;
        }

        System.out.println(primeiroNumero + " " + operador + " " + segundoNumero + " = " + resultado);
    }
}