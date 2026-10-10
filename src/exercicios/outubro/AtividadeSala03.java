package exercicios.outubro;

import java.util.Scanner;
import java.util.Locale;

/**
 * Reajuste salarial
 */
public class AtividadeSala03 {
    void main() {
        final double AUMENTO1 = 0.35;
        final double AUMENTO2 = 0.15;

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Digite seu salário: ");
        double salario = sc.nextDouble();

        sc.close();

        if (salario <= 300) {
            double salarioAumento1 = salario * AUMENTO1;
            double novoSalario1 = salario + salarioAumento1;
            System.out.printf("Você recebeu um aumento de R$ %.2f reais! Seu salário ficou R$ %.2f reais.", salarioAumento1, novoSalario1);

        } else {
            double salarioAumento2 = salario * AUMENTO2;
            double novoSalario2 = salario + salarioAumento2;
            System.out.printf("Você recebeu um aumento de R$ %.2f reais! Seu salário ficou R$ %.2f reais.", salarioAumento2, novoSalario2);
        }
    }

}
