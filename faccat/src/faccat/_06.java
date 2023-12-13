package faccat;

import java.util.Scanner;

public class _06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a base do retângulo: ");
        double baseValor = scanner.nextDouble();

        System.out.print("Digite a altura do retângulo: ");
        double alturaValor = scanner.nextDouble();

        double area = calcularAreaRetangulo(baseValor, alturaValor);

        System.out.println("A área do retângulo é: " + area);
    }

    private static double calcularAreaRetangulo(double base, double altura) {
        return base * altura;
    }
}
