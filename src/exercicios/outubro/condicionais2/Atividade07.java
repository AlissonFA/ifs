package exercicios.outubro.condicionais2;

import java.util.Scanner;

/**
 * Uma empresa decidiu dar uma gratificação de Natal a seus funcionários, baseada no
 * número de horas extras e no número de horas que o funcionário faltou ao trabalho.
 * O valor do prêmio é obtido pela consulta à tabela que se segue (inserido no código), na qual:
 * H = número de horas extras – (2/3 * (número de horas falta))
 */
public class Atividade07 {
    void main() {
        final double GRATIFICACAO_MENOR_600 = 100;
        final double GRATIFICACAO_ATE_1200 = 200;
        final double GRATIFICACAO_ATE_1800 = 300;
        final double GRATIFICACAO_ATE_2400 = 400;
        final double GRATIFICACAO_ACIMA_2400 = 500;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de horas extras que você fez: ");
        int horasExtras = sc.nextInt();

        System.out.print("Digite o número de horas que você faltou: ");
        int horasFaltas = sc.nextInt();

        sc.close();

        double h = horasExtras - ((2.0 / 3.0) * horasFaltas);
        double minutos = h * 60;
        double premio;

        if (minutos < 600) {
            premio = GRATIFICACAO_MENOR_600;
        } else if (minutos < 1200) {
            premio = GRATIFICACAO_ATE_1200;
        } else if (minutos < 1800) {
            premio = GRATIFICACAO_ATE_1800;
        } else if (minutos < 2400) {
            premio = GRATIFICACAO_ATE_2400;
        } else {
            premio = GRATIFICACAO_ACIMA_2400;
        }
        System.out.printf("Seu prêmio é de R$ %.2f", premio);
    }
}
