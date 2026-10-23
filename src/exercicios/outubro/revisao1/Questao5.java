package exercicios.outubro.revisao1;

import java.util.Scanner;
import java.util.Locale;

/**
 * Questão 05. Implementar um programa que calcula o desconto previdenciário de um funcionário a
 * partir do salário do funcionário. Entretanto, o cálculo de desconto segue a regra: o desconto deve
 * ser de 11% do valor do salário, entretanto, o valor máximo permitido de desconto é 318,20.
 */
public class Questao5 {
    void main() {
        final double DESCONTO = 0.11;

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Digite o seu salário: ");
        double salario = sc.nextDouble();

        sc.close();

        double calculo;

        if (salario * DESCONTO >= 318.20) {
            salario -= 318.20;
            System.out.printf("Você recebeu um desconto de R$ 318,20. Salário real é R$ %.2f", salario);
        } else {
            calculo = salario * DESCONTO;
            salario -= calculo;
            System.out.printf("Você recebeu um desconto de R$ %.2f. Salário real é R$ %.2f", calculo, salario);
        }
    }
}
