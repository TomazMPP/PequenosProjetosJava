import pratica.de.matematica.Exercicio1;
import pratica.de.matematica.Exercicio2;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Scanner menu = new Scanner(System.in);
                System.out.println("""
                        *********************
                        Digite a opção desejada:
                        1 - Exercício 1 (Múltiplos Cálculos baseados em 2 valores)
                        2 - Exercício 2 (Cálculo INSS)
                        """);

                int opcao = menu.nextInt();
                switch (opcao) {
                        case 1:
                                System.out.println("Digite o valor de x: ");
                                double x = menu.nextDouble();
                                System.out.println("Digite o valor de y: ");
                                double y = menu.nextDouble();
                                Exercicio1.calcularEImprimirResultados(x, y);
                                break;
                        case 2:
                                System.out.println("Digite o salário bruto: ");
                                double salario = menu.nextDouble();
                                Exercicio2.calcularINSS(salario);
                                break;
                        default:
                                System.out.println("Opção inválida!");
                                break;
                }
        }

}