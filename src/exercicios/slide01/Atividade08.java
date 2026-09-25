package exercicios.slide01;
import java.util.Scanner;
import java.util.Locale;

public class Atividade08 {
    void main() {
        Scanner leitor = new Scanner(System.in);
        leitor.useLocale(Locale.US);

        System.out.print("Digite um número inteiro: ");
        int numero1 = leitor.nextInt();

        System.out.print("Digite mais um número inteiro: ");
        int numero2 = leitor.nextInt();

        int soma = numero1+numero2;
        int restoDivisao = numero1%numero2;

        System.out.println("Número 1: "+numero1+"\nNúmero 2: "+numero2+"\nSoma: "+soma+"\nResto da Divisão: "+restoDivisao);

        leitor.close();
    }
}
