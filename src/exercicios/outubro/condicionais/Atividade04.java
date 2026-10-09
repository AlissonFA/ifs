package exercicios.outubro.condicionais;

import java.util.Scanner;
import java.util.Locale;

public class Atividade04 {
    void main() {
        final double AUMENTO1 = 1.10;
        final double AUMENTO2 = 1.15;

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Digite o seu salário: ");
        double salario = sc.nextDouble();

        sc.close();

        if (salario > 1500) {
            salario = salario * AUMENTO1;
            System.out.printf("Você recebeu um aumento de 10%% e seu salário ficou R$ %.2f", salario);
        } else {
            salario = salario * AUMENTO2;
            System.out.printf("Você recebeu um aumento de 15%% e seu salário ficou R$ %.2f reais.", salario);
        }
    }
}
