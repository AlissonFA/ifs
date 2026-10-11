package exercicios.outubro.condicionais2;

import java.util.Scanner;

/**
 * 1. Desenvolva um programa que leia o ano de nascimento de uma pessoa e o ano atual,
 * calcule e mostre sua idade e , também, verifique e mostre se ela já tem idade para
 * votar (16 anos ou mais) e para conseguir a carteira de habilitação (18 anos ou mais).
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
