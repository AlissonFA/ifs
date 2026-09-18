package exercicios;
import java.util.Scanner;
import java.util.Locale;

public class Atividade09 {
    void main() {
        Scanner leitor = new Scanner(System.in);
        leitor.useLocale(Locale.US);

        System.out.print("Digite a sua nota do primeiro bimestre: ");
        double notaPrimeiroBimestre = leitor.nextDouble();

        System.out.print("Digite a sua nota do segundo bimestre: ");
        double notaSegundoBimestre = leitor.nextDouble();

        System.out.print("Digite a sua nota do terceiro bimestre: ");
        double notaTerceiroBimestre = leitor.nextDouble();

        double media = (notaPrimeiroBimestre+notaSegundoBimestre+notaTerceiroBimestre)/3;
        String resultado = String.format("%.1f", media);

        System.out.println("A sua média final é: "+resultado);

        leitor.close();
    }
}
