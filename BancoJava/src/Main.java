import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome = "Tomaz Pontes";
        String tipo = "Conta Corrente";
        double saldo = 5000;
        System.out.println(String.format("""
                **************************
                Dados iniciais do cliente:
                
                Nome: %s
                Tipo de conta: %s
                Saldo inicial: R$ %.2f
                
                **************************
                """, nome, tipo, saldo));

        String menu = """
                Operações
                
                1- Consultar Saldos
                2- Depósito
                3- Saque Pix
                4- Sair
                
                Digite a opção desejada:
                """;

        Scanner leitura = new Scanner(System.in);
        int input = 0;
        while (input != 4) {
            System.out.println(menu);
            input = leitura.nextInt();

            if (input == 1) {
                System.out.println("O saldo atual é de: R$" + saldo);
            } else if (input == 2) {
                System.out.println("Informe o valor a receber:");
                double valorNovo = leitura.nextDouble();
                if (valorNovo > 0) {
                    saldo += valorNovo;
                    System.out.println("O seu novo saldo é de R$" + saldo);
                } else {
                    System.out.println("Valor inválido! O depósito deve ser positivo!");
                }
            } else if (input == 3) {
                System.out.println("Informe o valor a sacar via Pix:");
                double saqueValor = leitura.nextDouble();
                if (saqueValor > saldo) {
                    System.out.println("Não há saldo para realizar saque!");
                } else {
                    saldo -= saqueValor;
                    System.out.println("Saque realizado com sucesso. O seu novo saldo é de R$" + saldo);
                }
            }
            else if (input == 4){

            } else {
                System.out.println("Número inválido! Selecione um número conforme o menu!");
            }
        }
    }
}