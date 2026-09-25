package exercicios.slide02;
import java.util.Scanner;

/**
 * Nome Completo
 */
public class Atividade02 {
    void main() {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String primeiroNome = leitor.nextLine();

        System.out.print("Digite o seu sobrenome: ");
        String sobrenome = leitor.nextLine();

        String nomeCompleto = primeiroNome+" "+sobrenome;

        System.out.println("O seu nome completo é: "+nomeCompleto);

        leitor.close();
    }
}
