package exercicios.outubro.condicionais2;

import java.util.Scanner;

/**
 * Time Vencedor
 */
public class Atividade02 {
    void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do primeiro time: ");
        String nomeTime1 = sc.nextLine();

        System.out.print("Digite a quantidade de gols do primeiro time: ");
        int golsTime1 = sc.nextInt();

        sc.nextLine(); // Impede de ficar na mesma linha após a leitura do int.

        System.out.print("Digite o nome do segundo time: ");
        String nomeTime2 = sc.nextLine();

        System.out.print("Digite a quantidade de gols do segundo time: ");
        int golsTime2 = sc.nextInt();

        sc.close();

        if (golsTime1 > golsTime2) {
            System.out.printf("O time vencedor foi %s com %d gols!", nomeTime1, golsTime1);
        } else if (golsTime2 > golsTime1) {
            System.out.printf("O time vencedor foi %s com %d gols!", nomeTime2, golsTime2);
        } else {
            System.out.printf("Houve um empate entre os times %s e %s.", nomeTime1, nomeTime2);
        }
    }
}
