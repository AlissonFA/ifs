package exercicios.slide02;
import java.util.Scanner;
import java.util.Locale;

/**
 * Calcular área do triângulo
 */
public class Atividade01 {
    void main() {
        Scanner leitor = new Scanner(System.in);
        leitor.useLocale(Locale.US);

        System.out.print("Digite a base do triângulo: ");
        double baseTriangulo = leitor.nextDouble();

        System.out.print("Digite a altura do triângulo: ");
        double alturaTriangulo = leitor.nextDouble();

        double area = (baseTriangulo*alturaTriangulo)/2;

        System.out.println("A área do triângulo é: "+area);

        leitor.close();
    }
}
