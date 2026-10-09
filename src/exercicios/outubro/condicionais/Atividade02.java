package exercicios.outubro.condicionais;

import java.util.Scanner;

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
