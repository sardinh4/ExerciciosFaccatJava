package faccat;

import java.util.Scanner;

public class _33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro valor:");
        int primeiroValor = scanner.nextInt();

        System.out.println("Digite o segundo valor:");
        int segundoValor = scanner.nextInt();

        if (primeiroValor == segundoValor) {
            System.out.println("Números iguais");
        } else if (primeiroValor > segundoValor) {
            System.out.println("Primeiro é maior");
        } else {
            System.out.println("Segundo é maior");
        }
    }
}
