package exercicios.outubro;

import java.util.Scanner;

/**
 * Imprimir o maior valor
 */
public class AtividadeSala04 {
    void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        double valor1 = sc.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double valor2 = sc.nextDouble();

        System.out.print("Digite o terceiro valor: ");
        double valor3 = sc.nextDouble();

        sc.close();

        if (valor1 >= valor2 && valor1 >= valor3) {
            System.out.printf("O maior valor é %.1f", valor1);
        } else if (valor2 >= valor1 && valor2 >= valor3) {
            System.out.printf("O maior valor é %.1f", valor2);
        } else {
            System.out.printf("O maior valor é %.1f", valor3);
        }
    }
}
