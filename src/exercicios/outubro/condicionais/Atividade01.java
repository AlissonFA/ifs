package exercicios.outubro.condicionais;

import java.util.Scanner;

/**
 * Questão 01. Faça um programa que leia os valores A, B, C e imprima na tela se a soma de
 * A + B é menor que C.
 */
public class Atividade01 {
    void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        double valorA = sc.nextDouble();
        System.out.print("Digite o valor de B: ");
        double valorB = sc.nextDouble();
        System.out.print("Digite o valor de C: ");
        double valorC = sc.nextDouble();

        sc.close();

        if ((valorA + valorB) < valorC) {
            System.out.println("A soma de A+B é MENOR que C.");
        } else {
            System.out.println("A soma de A+B é MAIOR que C.");
        }
    }
}
