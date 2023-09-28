package pratica.de.matematica;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sal = new Scanner(System.in);
        System.out.println("Bem-vindo a calculadora de INSS!");
        System.out.println("Insira o valor do salário: ");
        double salario = sal.nextDouble();

        calcularINSS(salario);
    }

    public static void calcularINSS(Double salario) {
        double inss = 0;
        if (salario <= 1100) {
            inss = salario * 0.075;
        } else if (salario <= 2203.48) {
            inss = salario * 0.09;
        } else if (salario <= 3305.22) {
            inss = salario * 0.12;
        } else if (salario <= 6433.57) {
            inss = salario * 0.14;
        } else {
            inss = 751.99;
        }

        System.out.println("O valor do INSS é: R$" + inss);
        System.out.println("O valor do salário líquido é: R$" + (salario - inss));
    }

}
