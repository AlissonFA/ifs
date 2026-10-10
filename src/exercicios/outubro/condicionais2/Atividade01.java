package exercicios.outubro.condicionais2;

import java.util.Scanner;

/**
 * Pode votar e tirar habilitação?
 */
public class Atividade01 {
    void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o seu ano de nascimento: ");
        int anoNascimento = sc.nextInt();

        System.out.print("Digite o ano atual: ");
        int anoAtual = sc.nextInt();

        int idade = anoAtual - anoNascimento;

        if (idade >= 18) {
            System.out.printf("Você tem %d anos! Pode votar e tirar a habilitação.", idade);
        } else if (idade >= 16) {
            System.out.printf("Você tem %d anos! Pode votar, mas não pode tirar a habilitação.", idade);
        } else {
            System.out.printf("Você tem %d anos! Não pode votar e nem tirar a habilitação.", idade);
        }
    }
}
