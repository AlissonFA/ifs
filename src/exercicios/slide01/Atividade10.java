package exercicios.slide01;
import java.util.Scanner;
import java.util.Locale;

public class Atividade10 {
    void main() {
        Scanner leitor = new Scanner(System.in);
        leitor.useLocale(Locale.US);

        System.out.print("Digite o seu nome: ");
        String nome = leitor.nextLine();

        System.out.print("Digite a sua idade: ");
        int idade = leitor.nextInt();

        System.out.print("Digite o seu peso: ");
        double peso = leitor.nextDouble();

        System.out.print("Digite o seu sexo (M ou F): ");
        char sexoBiologico = leitor.next().charAt(0);

        System.out.println("Cadastro realizado: "+nome+", "+idade+" anos, "+peso+" kg, sexo "+sexoBiologico+".");

        leitor.close();
    }
}
