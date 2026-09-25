package exercicios.slide02;
import java.util.Scanner;

/**
 * Valor ao quadrado e ao cubo
 */
public class Atividade05 {
    void main() {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um valor inteiro: ");
        int valor = leitor.nextInt();

        int quadrado = valor*valor;
        int cubo = valor*valor*valor;

        System.out.println("Valor: "+valor+"\nValor ao Quadrado: "+quadrado+"\nValor ao Cubo: "+cubo);

        leitor.close();
    }
}
