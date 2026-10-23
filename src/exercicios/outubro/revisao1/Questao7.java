package exercicios.outubro.revisao1;

import java.util.Scanner;

/**
 * Questão 07. A Locadora de Veículos Eudora lançou uma grande promoção esse mês: pagando
 * apenas R$ 90 por diária, o cliente pode alugar um carro de passeio. Para cada diária, o cliente
 * recebe uma cota de quilometragem de 100 Km. Cada quilômetro a mais custará uma taxa extra de
 * R$ 12. Escreva um programa que receba como entrada a quantidade de dias e a quilometragem
 * total rodada por um cliente dessa locadora e exiba o valor total a ser pago com duas casas
 * decimais.
 */
public class Questao7 {
    void main() {
        final double PRECO_DIARIA = 90.0;
        final double COTA_POR_DIA = 100.0;
        final double TAXA_KM_EXTRA = 12.0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite quantos dias você ficou com o carro: ");
        int dias = sc.nextInt();

        System.out.print("Digite a quilometragem total rodada: ");
        double quilometragemTotal = sc.nextDouble();

        sc.close();

        double valorDiarias = dias * PRECO_DIARIA;
        double cotaTotal = dias * COTA_POR_DIA;
        double valorTaxaExtra = 0.0;

        if (quilometragemTotal > cotaTotal) {
            double kmExcedente = quilometragemTotal - cotaTotal;
            valorTaxaExtra = kmExcedente * TAXA_KM_EXTRA;
        }

        double totalGeral = valorDiarias + valorTaxaExtra;

        System.out.printf("Valor total a ser pago: R$ %.2f", totalGeral);
    }
}
