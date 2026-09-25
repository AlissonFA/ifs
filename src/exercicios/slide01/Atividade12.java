package exercicios.slide01;
import java.util.Scanner;
import java.util.Locale;

public class Atividade12 {
    void main() {
        Scanner leitor = new Scanner(System.in);
        leitor.useLocale(Locale.US);

        System.out.print("Digite o nome do produto: ");
        String nomeProduto = leitor.nextLine();

        System.out.print("Digite o valor unitário do produto: ");
        double valorUnitario = leitor.nextDouble();

        System.out.print("Digite quantas unidades você está levando: ");
        int unidades = leitor.nextInt();

        double valorTotal = valorUnitario*unidades;

        System.out.println("Você comprou "+unidades+" unidades de "+nomeProduto+". O valor total da compra é: "+valorTotal);

        leitor.close();
    }
}
