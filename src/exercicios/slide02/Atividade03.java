package exercicios.slide02;
import java.util.Scanner;
import java.util.Locale;

/**
 * Conversão de Temperatura
 */
public class Atividade03 {
    void main() {
        Scanner leitor = new Scanner(System.in);
        leitor.useLocale(Locale.US);

        System.out.print("Digite uma temperatura em graus Celsius: ");
        double temperaturaC = leitor.nextDouble();

        double fahrenheit = (9*temperaturaC+160)/5;

        System.out.printf("A temperatura em Fahrenheit é: %.1f ", fahrenheit);

        leitor.close();
    }
}
