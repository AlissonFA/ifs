package exercicios.outubro;

import java.util.Scanner;

/**
 * Triângulo equilatero
 */
public class AtividadeSala01 {
    void main() {
        Scanner sc = new Scanner(System.in);
        String triangulo = """
                       /\\
                   A  /  \\  B
                     /    \\
                    /      \\
                   /________\\
                       C
                """;
        System.out.println("Considere o triângulo:\n"+triangulo);
        System.out.print("Digite o lado A do triângulo: ");
        double ladoA = sc.nextDouble();
        System.out.print("Digite o lado B do triângulo: ");
        double ladoB = sc.nextDouble();
        System.out.print("Digite o lado C do triângulo: ");
        double ladoC = sc.nextDouble();

        sc.close();

        if (ladoA == ladoB && ladoB == ladoC) {
            System.out.println("É um triângulo equilátero!");
        } else {
            System.out.println("Não é um triângulo equilátero!");
        }
    }
}
