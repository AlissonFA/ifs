package exercicios.outubro.condicionais;

import java.util.Scanner;

/**
 * Questão 02. Escreva um programa que pergunte a velocidade do carro de um usuário.
 * Caso ultrapasse 80 km/h, exiba uma mensagem dizendo que o usuário foi multado. Nesse
 * caso, exiba o valor da multa, cobrando R$ 5,00 por km acima de 80Km/h.
 */
public class Atividade02 {
    void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a velocidade do seu carro: ");
        int velocidade = sc.nextInt();

        sc.close();

        if (velocidade > 80) {
            int quilometragem = velocidade - 80;
            int multa = 5 * quilometragem;
            System.out.printf("Você foi multado em R$ %d reais!", multa);
        } else {
            System.out.println("Você não foi multado!");
        }
    }
}
