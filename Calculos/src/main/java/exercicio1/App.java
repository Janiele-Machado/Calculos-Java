package exercicio1;

import java.util.Scanner;

/**
 * Classe criada com um código simples para testar os métodos da Classe Calculos;
 *
 * @author Janiele
 * @since 11/12/2024
 */
public class App {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {

            System.out.println("Calculando a media:");
            System.out.println("Digite sua primeira nota para o calculo da media");
            double n1 = scan.nextDouble();
            scan.nextLine();
            System.out.println("Digite sua segunda nota para o calculo da media");
            double n2 = scan.nextDouble();
            scan.nextLine();
            System.out.println("Digite sua terceira nota para o calculo da media");
            double n3 = scan.nextDouble();
            scan.nextLine();
            System.out.println("Digite sua quarta nota para o calculo da media");
            double n4 = scan.nextDouble();
            scan.nextLine();

            Calculos aluno = new Calculos();
            double media = aluno.calculaMedia(n1, n2, n3, n4);

            System.out.println("A sua media foi de " + media);
            System.out.println("Voce foi : " + aluno.calculaAcimaMedia(media));
        } catch (Exception e) {
            System.out.println(e);
        }

        scan.close();

    }
}
