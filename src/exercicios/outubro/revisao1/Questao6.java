package exercicios.outubro.revisao1;

import java.util.Scanner;

/**
 * Questão 06. Faça um programa que mostre um menu com duas opções: 1 – Ordem crescente; 2 -
 * Ordem decrescente. Caso seja colocada uma opção diferente informe que a opção é inválida. Em
 * seguida, solicite ao usuário três números. Para a opção 1, imprima-os em ordem crescente e para a
 * opção 2, imprima-os em ordem decrescente.
 */
public class Questao6 {
    void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("""
                1 - Ordem crescente
                2 - Ordem decrescente
                """);

        System.out.print("Selecione uma opção: ");
        int opcao = sc.nextInt();

        if (opcao != 1 && opcao != 2) {
            sc.close();
            System.out.println("Opção Inválida!");
            return;
        }

        System.out.print("Informe o primeiro número: ");
        double primeiro = sc.nextDouble();

        System.out.print("Informe o segundo número: ");
        double segundo = sc.nextDouble();

        System.out.print("Informe o terceiro número: ");
        double terceiro = sc.nextDouble();

        sc.close();

        double maior = Math.max(primeiro, Math.max(segundo, terceiro));
        double menor = Math.min(primeiro, Math.min(segundo, terceiro));
        double meio = (primeiro + segundo + terceiro) - menor - maior;

        switch (opcao) {
            case 1 -> System.out.printf("Crescente: %.2f, %.2f, %.2f", menor, meio, maior);
            case 2 -> System.out.printf("Decrescente: %.2f, %.2f, %.2f", maior, meio, menor);
        }
    }
}
