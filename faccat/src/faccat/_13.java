package faccat;

import java.util.Scanner;

public class _13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double notaUm = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double notaDois = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double notaTres = scanner.nextDouble();

        double mediaFinal = calcularMediaFinal(notaUm, notaDois, notaTres);

        System.out.println("A média final é: " + mediaFinal);
    }

    private static double calcularMediaFinal(double nota1, double nota2, double nota3) {
        return (nota1 * 2 + nota2 * 3 + nota3 * 5) / 10;
    }
}
