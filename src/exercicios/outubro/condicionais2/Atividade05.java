package exercicios.outubro.condicionais2;

import java.util.Scanner;

/**
 * Um banco concederá um crédito especial aos seus clientes, de acordo com o saldo
 * médio no último ano. Faça um programa que receba o saldo médio de um cliente e
 * calcule o valor do crédito, de acordo com a tabela a seguir (inserido no código). Mostre o saldo médio e o
 * valor do crédito.
 */
public class Atividade05 {
    void main() {
        final double SALDO_MEDIO_ATE_200 = 0.1;
        final double SALDO_MEDIO_ENTRE_200_E_300 = 0.2;
        final double SALDO_MEDIO_ENTRE_300_E_400 = 0.25;
        final double SALDO_MEDIO_ACIMA_400 = 0.3;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o seu saldo médio do último ano: ");
        double saldoMedio = sc.nextDouble();

        sc.close();

        double limite;

        if (saldoMedio <= 200) {
            limite = saldoMedio * SALDO_MEDIO_ATE_200;
        } else if (saldoMedio <= 300) {
            limite = saldoMedio * SALDO_MEDIO_ENTRE_200_E_300;
        } else if (saldoMedio <= 400) {
            limite = saldoMedio * SALDO_MEDIO_ENTRE_300_E_400;
        } else {
            limite = saldoMedio * SALDO_MEDIO_ACIMA_400;
        }

        System.out.printf("Seu saldo médio é R$ %.2f. Você recebeu um limite de %.2f reais", saldoMedio, limite);
    }
}
