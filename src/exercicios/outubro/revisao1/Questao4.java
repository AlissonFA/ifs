package exercicios.outubro.revisao1;

import java.util.Scanner;
import java.util.Locale;

/**
 * Questão 04. Elabore um algoritmo que receba o valor de um produto e a condição de pagamento.
 * Em seguida, calcule o valor a ser pago por um cliente ao comprar determinado produto diante das
 * opções abaixo. (opções está no código como String)
 */
public class Questao4 {
    void main() {
        final double DINHEIRO = 0.10;
        final double CARTAO = 0.05;
        final double PARCELADO;
        final double ENTRADA_E_PARCELADO = 1.10;

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        String condicoes = """
                1 -> À vista em dinheiro
                2 -> À vista no cartão
                3 -> Parcelado em duas vezes no cartão
                4 -> Entrada (25% do valor) + 2 parcelas
                """;
        System.out.print("Digite o valor do produto: ");
        double valorProduto = sc.nextDouble();

        System.out.print(condicoes + "\nCom base nas condições, escolha uma (apenas número): ");
        int codigoCondicao = sc.nextInt();

        sc.close();

        double entrada;
        double desconto;
        double juros;
        double original = valorProduto;

        switch (codigoCondicao) {
            case 1 -> {
                desconto = valorProduto * DINHEIRO;
                valorProduto -= desconto;
                System.out.printf("Preço Original: R$ %.2f\nDesconto: R$ %.2f (%.2f%%)\nValor Total: R$ %.2f", original, desconto, DINHEIRO * 100, valorProduto);
            }
            case 2 -> {
                desconto = valorProduto * CARTAO;
                valorProduto -= desconto;
                System.out.printf("Preço Original: R$ %.2f\nDesconto: R$ %.2f (%.2f%%)\nValor Total: R$ %.2f", original, desconto, CARTAO * 100, valorProduto);
            }
            case 3 -> {
                PARCELADO = valorProduto;
                System.out.printf("Parcelas: %.2f\nValor Total: R$ %.2f", PARCELADO / 2, PARCELADO);
            }
            case 4 -> {
                entrada = valorProduto * 0.25;
                valorProduto -= entrada;
                juros = valorProduto * ENTRADA_E_PARCELADO;
                System.out.printf("Preço Original: R$ %.2f\nEntrada: %.2f\nJuros: %.2f%% no valor restante\nValor Total: R$ %.2f", original, entrada, (ENTRADA_E_PARCELADO - 1) * 100, juros);
            }
            default -> System.out.println("Por favor, digite uma opção válida!");
        }
    }
}
