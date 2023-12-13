package faccat;

import java.util.Scanner;

public class _19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        double valorUm = scanner.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double valorDois = scanner.nextDouble();

        if (valorUm > valorDois) {
            System.out.println("O maior valor é: " + valorUm);
        } else {
            System.out.println("O maior valor é: " + valorDois);
        }
    }
}
