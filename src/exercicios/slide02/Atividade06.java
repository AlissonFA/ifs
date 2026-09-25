package exercicios.slide02;
import java.util.Scanner;
import java.util.Locale;

/**
 * Salário Líquido
 */
public class Atividade06 {
    void main() {
        Scanner leitor = new Scanner(System.in);
        leitor.useLocale(Locale.US);

        System.out.print("Digite o seu salário bruto: ");
        double salarioBruto = leitor.nextDouble();

        double previdenciaSocial = salarioBruto*0.1;
        double salarioDesconto1 = salarioBruto - previdenciaSocial;

        double imposto = salarioDesconto1*0.05;
        double salarioLiquido = salarioDesconto1 - imposto;

        System.out.printf("Salário Bruto: %.2f\nSalário após o primeiro desconto: %.2f\nSalário Líquido: %.2f", salarioBruto, salarioDesconto1, salarioLiquido);

        leitor.close();
    }
}
