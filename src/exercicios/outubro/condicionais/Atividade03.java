package exercicios.outubro.condicionais;

import java.util.Scanner;

/**
 * Questão 03. Escreva um programa que, dados dois números inteiros, mostre na tela o
 * maior deles, assim como a diferença que existente entre ambos.
 */
public class Atividade03 {
    void main() {
        Scanner sc = new Scanner(System.in);

        int diferenca;

        System.out.print("Digite um número inteiro: ");
        int numeroA = sc.nextInt();
        System.out.print("Digite outro número inteiro: ");
        int numeroB = sc.nextInt();

        sc.close();

        if (numeroA > numeroB) {
            diferenca = numeroA - numeroB;
            System.out.printf("O maior número é %d e a diferença é %d.", numeroA, diferenca);
        } else {
            diferenca = numeroB - numeroA;
            System.out.printf("O maior número é %d e a diferença é %d.", numeroB, diferenca);
        }
    }
}
