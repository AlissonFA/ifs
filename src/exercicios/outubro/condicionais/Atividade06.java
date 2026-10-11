package exercicios.outubro.condicionais;

import java.util.Scanner;

/**
 * Questão 06. Elabore um programa que calcule o valor que deve ser pago por um produto,
 * considerando o preço normal de etiqueta que será fornecido pelo usuário. Em seguida
 * pergunte ao usuário se o pagamento será à vista. Caso o valor seja pago à vista deve ser
 * dado um desconto de 10%. Caso contrário, o pagamento será parcelado,assim, solicite a
 * quantidade de parcelas e mostre o valor da parcela.
 */
public class Atividade06 {
    void main() {
        final double DESCONTOAVISTA = 0.90; // Retirando do 100%
        double custo;
        int parcelas;

        String valoresProdutos = """
                ### PREÇO ###
                Arroz: R$ 5,80
                Feijão: R$ 7,20
                Leite: R$ 4,90
                Café: R$ 17,50
                Óleo de Soja: R$ 6,50
                """;

        System.out.println(valoresProdutos);

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do produto que você quer comprar: ");
        String produto = sc.nextLine(); // Seria interessante aplicar trim() e toLowerCase para evitar erros.

        System.out.print("Você vai pagar a vista? ");
        String pagamentoAVista = sc.nextLine();

        if (pagamentoAVista.trim().equalsIgnoreCase("sim")) {
            switch (produto) {
                case "arroz" -> {
                    custo = 5.80 * DESCONTOAVISTA;
                    System.out.println("Você recebeu um desconto de 10%! O total ficou R$ " + custo);
                }
                case "feijão" -> {
                    custo = 7.20 * DESCONTOAVISTA;
                    System.out.println("Você recebeu um desconto de 10%! O total ficou R$ " + custo);
                }
                case "leite" -> {
                    custo = 4.90 * DESCONTOAVISTA;
                    System.out.println("Você recebeu um desconto de 10%! O total ficou R$ " + custo);
                }
                case "café" -> {
                    custo = 17.50 * DESCONTOAVISTA;
                    System.out.println("Você recebeu um desconto de 10%! O total ficou R$ " + custo);
                }
                case "óleo de soja" -> {
                    custo = 6.50 * DESCONTOAVISTA;
                    System.out.println("Você recebeu um desconto de 10%! O total ficou R$ " + custo);
                }
                default -> System.out.println("Não temos esse produto!");
            }
        } else {
            System.out.print("Digite quantas parcelas você deseja: ");
            parcelas = sc.nextInt();

            switch (produto) {
                case "arroz" -> {
                    custo = 5.80 / parcelas;
                    System.out.printf("Custo do Produto: R$ 5,80\nQuantidade de Parcelas: %d\n Total ficou R$ %.2f", parcelas, custo);
                }
                case "feijão" -> {
                    custo = 7.20 / parcelas;
                    System.out.printf("Custo do Produto: R$ 7,20\nQuantidade de Parcelas: %d\n Total ficou R$ %.2f", parcelas, custo);
                }
                case "leite" -> {
                    custo = 4.90 / parcelas;
                    System.out.printf("Custo do Produto: R$ 4,90\nQuantidade de Parcelas: %d\n Total ficou R$ %.2f", parcelas, custo);
                }
                case "café" -> {
                    custo = 17.50 / parcelas;
                    System.out.printf("Custo do Produto: R$ 17,50\nQuantidade de Parcelas: %d\n Total ficou R$ %.2f", parcelas, custo);
                }
                case "óleo de soja" -> {
                    custo = 6.50 / parcelas;
                    System.out.printf("Custo do Produto: R$ 6,50\nQuantidade de Parcelas: %d\n Total ficou R$ %.2f", parcelas, custo);
                }
                default -> System.out.println("Não temos esse produto!");
            }
        }

        sc.close();
    }
}
