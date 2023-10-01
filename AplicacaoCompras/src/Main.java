import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> compras = new ArrayList<>();
        List<Double> valores = new ArrayList<>();

        String menu = """
                
                1- Comprar Mais // 2- Olhar suas Compras // 3- Sair
                Digite a opção desejada:
                """;
        String produto = "";
        double valor = 0;
        int limiteDeCredito = 1200;
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        System.out.println("Insira seu nome");
        String nome = scanner.next();
        System.out.println(String.format("Olá %s, seu limite de crédito é de R$ %d", nome, limiteDeCredito));
        System.out.println("Para fazer uma compra, digite o nome do produto:");
        produto = scanner.next();
        System.out.println("Digite o valor do produto:");
        valor = scanner.nextDouble();
        if (valor > limiteDeCredito) {
            System.out.println("Você não tem limite suficiente para comprar esse produto!");
            System.out.println("Limite restante: " + limiteDeCredito);
        } else {
            System.out.println("Você comprou " + produto + " no valor de R$ " + valor);
            limiteDeCredito -= valor;
            compras.add(produto);
            valores.add(valor);
        }

        while (input != 3) {
            System.out.println(menu);
            input = scanner.nextInt();

            if (input == 1) {
                System.out.println("Para fazer uma compra, digite o nome do produto:");
                produto = scanner.next();
                System.out.println("Digite o valor do produto:");
                valor = scanner.nextDouble();

                if (valor > limiteDeCredito) {
                    System.out.println(String.format("""
                            
                            Você não tem limite suficiente para comprar esse produto!
                            """));
                    System.out.println("Limite restante: " + limiteDeCredito);
                    System.out.println("Suas compras foram:");
                    for (int i = 0; i < compras.size(); i++) {
                        System.out.println(compras.get(i) + " - R$ " + valores.get(i));
                    }
                } else {
                    System.out.println("Você comprou " + produto + " no valor de R$ " + valor);
                    limiteDeCredito -= valor;
                    compras.add(produto);
                    valores.add(valor);
                }

            } else if (input == 2) {
                System.out.println("Suas compras foram:");
                for (int i = 0; i < compras.size(); i++) {
                    System.out.println(compras.get(i) + " - R$ " + valores.get(i));
                }
                System.out.println("");
                System.out.println("Total gasto: " + (1200 - limiteDeCredito));
                System.out.println("Seu limite restante é de R$ " + limiteDeCredito);
            } else if (input == 3) {
                System.out.println("Obrigado por comprar conosco! Seu limite restante é de R$ " + limiteDeCredito);
            } else {
                System.out.println("Número inválido! Selecione um número conforme o menu!");
            }
        }
    }
}
