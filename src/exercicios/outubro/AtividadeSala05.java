package exercicios.outubro;

import java.util.Scanner;

/**
 * Desconto Funcionário e VIP
 */
public class AtividadeSala05 {
    void main() {
        final double DESCONTOFUNCIONARIO = 0.90;
        final double DESCONTOVIP = 0.95;
        double valorTotal;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor total da compra: ");
        double valor = sc.nextDouble();

        System.out.print("Digite a sua categoria (utilize 1 para funcionário e 2 para vip): ");
        int categoria = sc.nextInt();

        sc.close();

        switch (categoria) {
            case 1 -> {
                valorTotal = valor * DESCONTOFUNCIONARIO;
                System.out.printf("Você é um funcionário e recebeu um desconto de 10%%.\nValor Total: R$ %.1f", valorTotal);
            }
            case 2 -> {
                valorTotal = valor * DESCONTOVIP;
                System.out.printf("Você é um vip e recebeu um desconto de 5%%.\nValor Total: R$ %.1f", valorTotal);
            }
            default -> System.out.println("Erro");
        }
    }
}
