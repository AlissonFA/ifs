package exercicios.outubro.revisao1;

import java.util.Scanner;

/**
 * Questão 03. Uma estação meteorológica deseja classificar a temperatura ambiente de acordo com
 * a leitura atual. Crie um programa que leia a temperatura em graus Celsius fornecida pelo usuário e
 * exiba uma das seguintes mensagens:
 * ● Se a temperatura for abaixo de 10°C → "Temperatura muito baixa."
 * ● Se estiver entre 10°C e 25°C (inclusive) → "Temperatura agradável."
 * ● Se estiver acima de 25°C e abaixo de 35°C → "Temperatura alta."
 * ● Se a temperatura for 35°C ou mais → "Temperatura extrema."
 * O programa deve exibir também o valor da temperatura informado com uma casa decimal com
 * uma mensagem como: "Temperatura registrada: 28.0°C"
 */
public class Questao3 {
    void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Celsius: ");
        double temperaturaC = sc.nextDouble();

        sc.close();

        if (temperaturaC < 10) {
            System.out.printf("Temperatura muito baixa.\nTemperatura registrada: %.1f°C", temperaturaC);
        } else if (temperaturaC <= 25) {
            System.out.printf("Temperatura agradável.\nTemperatura registrada: %.1f°C", temperaturaC);
        } else if (temperaturaC < 35) {
            System.out.printf("Temperatura alta.\nTemperatura registrada: %.1f°C", temperaturaC);
        } else {
            System.out.printf("Temperatura extrema.\nTemperatura registrada: %.1f°C", temperaturaC);
        }
    }
}
