package exercicios.slide02;
import java.util.Scanner;
import java.util.Locale;

/**
 * Distância Percorrida e Litros Usados
 */
public class Atividade04 {
    void main() {
        Scanner leitor = new Scanner(System.in);
        leitor.useLocale(Locale.US);

        System.out.print("Digite o tempo gasto na viagem: ");
        double tempoGasto = leitor.nextDouble();

        System.out.print("Digite a velocidade média durante a viagem: ");
        double velocidadeMedia = leitor.nextDouble();

        double distanciaPercorrida = tempoGasto*velocidadeMedia;

        double litrosUsados = distanciaPercorrida/12;

        System.out.println("Velocidade média: "+velocidadeMedia+"\nTempo gasto na viagem: "+tempoGasto+"\nDistância percorrida: "+distanciaPercorrida+"\nQuantidade de litros: "+litrosUsados);

        leitor.close();
    }
}
