package exercicios.outubro.revisao1;

import java.util.Scanner;

/**
 * Questão 01. Determine se um determinado ano lido é bissexto. Regra: um ano é bissexto se for
 * divisível por 400 ou, se for divisível por 4 e não for divisível por 100.
 */
public class Questao1 {
    void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um ano: ");
        int ano = sc.nextInt();

        sc.close();

        if (ano % 400 == 0 || ano % 4 == 0 && ano % 100 != 0) {
            System.out.printf("%d é um ano bissexto!", ano);
        } else {
            System.out.printf("%d não é um ano bissexto!", ano);
        }
    }
}
