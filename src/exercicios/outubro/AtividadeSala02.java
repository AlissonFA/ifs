package exercicios.outubro;

import java.util.Scanner;

/**
 * Par ou Impar
 */
public class AtividadeSala02 {
    void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = sc.nextInt();

        sc.close();

        if (numero % 2 == 0) {
            System.out.println("PAR!");
        } else {
            System.out.println("IMPAR!");
        }
    }
}
