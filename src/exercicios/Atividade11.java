package exercicios;
import java.util.Scanner;
import java.util.Locale;

public class Atividade11 {
    void main() {
        Scanner leitor = new Scanner(System.in);
        leitor.useLocale(Locale.US);

        final double PI = 3.1415;

        System.out.print("Digite o valor do raio do círculo: ");
        double raio = leitor.nextDouble();

        double area = PI*raio*raio;

        System.out.println("O valor da área é: "+area);

        leitor.close();
    }
}
