package faccat;

import java.util.Scanner;
public class _17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota da 1a. avaliação: ");
        double notaUm = scanner.nextDouble();

        System.out.print("Digite a nota da 2a. avaliação: ");
        double notaDois = scanner.nextDouble();

        double media = (notaUm + notaDois) / 2;

        System.out.println("Média: " + media);

        if (media >= 6) {
            System.out.println("Aluno Aprovado!");
        } else {
            System.out.println("Aluno Reprovado.");
        }
    }
}
