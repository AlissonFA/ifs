package exercicios.outubro.revisao1;

import java.util.Scanner;
import java.util.Locale;

/**
 * Questão 02. Crie um programa que calcule o valor total da conta de energia elétrica de um
 * usuário. O programa deve ler a quantidade de kWh consumidos no mês e calcular o valor final,
 * seguindo as regras abaixo:
 * ● Até 150 kWh: R$ 0,90 por kWh
 * ● Acima de 150 kWh: R$ 0,60 por kWh e deve ser informado por uma mensagem que foi
 * aplicada tarifa reduzida.
 * O programa deve exibir ao final uma mensagem com o valor a pagar com duas casas decimais
 */
public class Questao2 {
    void main() {
        final double ATE_150_KWH = 0.90;
        final double ACIMA_150_KWH = 0.60;

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Digite a quantidade de kWh consumida no mês: ");
        double kwh = sc.nextDouble();

        sc.close();

        double valor;

        if (kwh <= 150) {
            valor = kwh * ATE_150_KWH;
            System.out.printf("Você consumiu %.2f de kWh no mês e irá pagar %.2f reais.", kwh, valor);
        } else {
            valor = kwh * ACIMA_150_KWH;
            System.out.printf("Você consumiu %.2f de kWh no mês e irá pagar %.2f reais. (tarifa reduzida)", kwh, valor);
        }
    }
}
