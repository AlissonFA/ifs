package exercicios.outubro.condicionais;

import java.util.Scanner;

/**
 * Questão 05. Escreva um programa que pergunte a distância que um passageiro deseja
 * percorrer em km. Calcule o preço da passagem, cobrando R$ 2,50 por km para viagens até
 * 200 km, e R$ 3,45 para viagens mais longas.
 */
public class Atividade05 {
    void main() {
        double custoPassagem;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a distância que você deseja percorrer: ");
        double distancia = sc.nextDouble();

        sc.close();

        if (distancia <= 200) {
            custoPassagem = distancia * 2.50;
            System.out.printf("Você percorreu %.1f km e o custo foi R$ 2,50 por km.\nValor: R$ %.2f.", distancia, custoPassagem);
        } else {
            custoPassagem = distancia * 3.45;
            System.out.printf("Você percorreu %.1f km e o custo foi R$ 3,45 por km.\nValor: R$ %.2f.", distancia, custoPassagem);
        }
    }
}
