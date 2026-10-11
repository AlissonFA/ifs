package exercicios.outubro.condicionais2;

import java.util.Scanner;
import java.util.Locale;

/**
 * Faça um programa que receba a altura(m), o sexo biológico (F- feminino/M-masculino)
 * de uma pessoa e seu peso (kg) e mostre uma mensagem informando se ela está no
 * peso ideal, acima ou abaixo. Utilize as fórmulas abaixo para cálculo de peso ideal:
 * ■■ Masculino: (72.7 *altura) – 58.
 * ■■ Feminino: (62.1 *altura) – 44.7.
 */
public class Atividade06 {
    void main() {
        final double MULTIPLICACAO_MASCULINO = 72.7;
        final double SUBTRACAO_MASCULINO = 58;
        final double MULTIPLICACAO_FEMININO = 62.1;
        final double SUBTRACAO_FEMININO = 44.7;

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Digite a sua altura: ");
        double altura = sc.nextDouble();

        System.out.print("Digite o seu sexo (M para masculino e F para feminino): ");
        char sexo = Character.toUpperCase(sc.next().charAt(0));

        System.out.print("Digite o seu peso: ");
        double peso = sc.nextDouble();

        sc.close();

        double pesoIdeal;

        if (sexo == 'M') {
            pesoIdeal = (MULTIPLICACAO_MASCULINO * altura) - SUBTRACAO_MASCULINO;
        } else if (sexo == 'F') {
            pesoIdeal = (MULTIPLICACAO_FEMININO * altura) - SUBTRACAO_FEMININO;
        } else {
            System.out.println("Sexo inválido! Por favor, digite somente M ou F.");
            return;
        }

        if (peso < pesoIdeal) {
            System.out.println("Você está abaixo do peso ideal!");
        } else if (peso > pesoIdeal) {
            System.out.println("Você está acima do peso ideal!");
        } else {
            System.out.println("Você está no peso ideal!");
        }

        System.out.printf("Seu peso ideal é %.2f kg", pesoIdeal);
    }
}
