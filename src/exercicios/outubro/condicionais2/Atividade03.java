package exercicios.outubro.condicionais2;

import java.util.Scanner;

/**
 * Combustível
 */
public class Atividade03 {
    void main() {
        final double PRECO_ALCOOL = 4.20;
        final double PRECO_GASOLINA = 6.40;

        final double ALCOOL_DESCONTO_20L = 0.97;
        final double ALCOOL_DESCONTO_ACIMA_20L = 0.95;
        final double GASOLINA_DESCONTO_20L = 0.96;
        final double GASOLINA_DESCONTO_ACIMA_20L = 0.94;

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos litros de combustível você deseja? ");
        double litros = sc.nextDouble();

        System.out.print("Qual tipo de combustível você deseja? (Utilize A para álcool e G para gasolina) ");
        char tipoCombustivel = sc.next().charAt(0);

        sc.close();

        double desconto;
        double valorTotal;

        if (tipoCombustivel == 'A') {
            if (litros <= 20) {
                desconto = PRECO_ALCOOL * ALCOOL_DESCONTO_20L;
            } else {
                desconto = PRECO_ALCOOL * ALCOOL_DESCONTO_ACIMA_20L;
            }
            valorTotal = litros * desconto;
            System.out.printf("Você pediu %.2f litros de álcool. O valor total foi R$ %.2f!", litros, valorTotal);
        } else if (tipoCombustivel == 'G') {
            if (litros <= 20) {
                desconto = PRECO_GASOLINA * GASOLINA_DESCONTO_20L;
            } else {
                desconto = PRECO_GASOLINA * GASOLINA_DESCONTO_ACIMA_20L;
            }
            valorTotal = litros * desconto;
            System.out.printf("Você pediu %.2f litros de gasolina. O valor total foi R$ %.2f!", litros, valorTotal);
        } else {
            System.out.println("Tipo de combustível inválido! Digite apenas 'A' ou 'G'.");
        }
    }
}
