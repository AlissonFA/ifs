package exercicios.outubro.condicionais;

import java.util.Scanner;

/**
 * Questão 07. Escreva um programa que leia um número inteiro e mostre na tela, a soma de
 * todos os seus algarismos. Por exemplo, ao número 251 corresponderia ao valor 8 (2 + 5 +
 * 1). Se o número lido não for maior do que zero, o programa terminará com a mensagem
 * “Número inválido”.
 */
public class Atividade07 {
    void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite qualquer número inteiro (até 3 dígitos): ");
        int numero = sc.nextInt();

        sc.close();

        int alg1;
        int alg2;
        int alg3;
        int soma;

        if (numero < 0) {
            System.out.println("Número inválido!");
            return;
        } else {
            alg1 = numero / 100;
            alg2 = (numero % 100) / 10;
            alg3 = numero % 10;
            soma = alg1 + alg2 + alg3;
        }
        System.out.printf("Você digitou o número: %d\nSeparadamente: %d, %d e %d\nSoma: %d", numero, alg1, alg2, alg3, soma);
    }
}
