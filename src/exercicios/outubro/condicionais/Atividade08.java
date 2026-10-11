package exercicios.outubro.condicionais;

import java.util.Scanner;

/**
 * Questão 08. Faça um programa que leia 2 notas de um aluno, verifique se as notas são
 * válidas. Uma nota válida deve ser, obrigatoriamente, um valor entre 0,0 e 10,0, onde caso a
 * nota não possua um valor válido, este fato deve ser informado ao usuário e o programa
 * termina. Caso as notas sejam válidas, calcule e mostre a média destas notas.
 */
public class Atividade08 {
    void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a sua primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.print("Digite a sua segunda nota: ");
        double nota2 = sc.nextDouble();

        sc.close();

        boolean nota1Valida = nota1 >= 0.0 && nota1 <= 10.0;
        boolean nota2Valida = nota2 >= 0.0 && nota2 <= 10.0;

        if (!nota1Valida) {
            System.out.println("Sua nota 1 é inválida. Por favor, digite uma nota válida!");
        }
        if (!nota2Valida) {
            System.out.println("Sua nota 2 é inválida. Por favor, digite uma nota válida!");
        }
        if (nota1Valida && nota2Valida) {
            System.out.println("As duas notas são válidas!");
        }
    }
}
