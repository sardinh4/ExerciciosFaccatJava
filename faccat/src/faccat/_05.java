package faccat;

import java.util.Scanner;

public class _05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int valorNumero = scanner.nextInt();

        int antecessor = valorNumero - 1;

        System.out.println("O antecessor de " + valorNumero + " é " + antecessor);
    }
}
