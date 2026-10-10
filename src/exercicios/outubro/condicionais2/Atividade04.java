package exercicios.outubro.condicionais2;

import java.util.Scanner;

/**
 * Escolha de Operação
 */
public class Atividade04 {
    void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double numero1 = sc.nextDouble();

        System.out.print("Digite outro número: ");
        double numero2 = sc.nextDouble();

        String operacoes = """
                ### OPÇÕES DE OPERAÇÕES PARA FAZER ###
                1 -> Média entre os dois números
                2 -> Diferença do maior pelo menor
                3 -> Produto entre os dois números
                4 -> Divisão do primeiro número pelo segundo número
                """;
        System.out.print(operacoes);

        System.out.print("Por favor, escolha uma opção: ");
        int opcaoOperacao = sc.nextInt();

        sc.close();

        double media;
        double diferenca;
        double produto;
        double divisao;

        switch (opcaoOperacao) {
            case 1 -> {
                media = (numero1 + numero2) / 2;
                System.out.printf("A média entre os dois números é %.2f!", media);
            }
            case 2 -> {
                if (numero1 > numero2) {
                    diferenca = numero1 - numero2;
                } else {
                    diferenca = numero2 - numero1;
                }
                System.out.printf("A diferença entre os dois números é %.2f!", diferenca);
            }
            case 3 -> {
                produto = numero1 * numero2;
                System.out.printf("O produto entre os dois números é %.2f!", produto);
            }
            case 4 -> {
                if (numero2 == 0) {
                    System.out.println("Erro: O segundo número precisa ser diferente de 0.");
                } else {
                    divisao = numero1 / numero2;
                    System.out.printf("A divisão entre os dois números é %.2f!", divisao);
                }
            }
            default -> System.out.println("Opção inválida!");
        }
    }
}
