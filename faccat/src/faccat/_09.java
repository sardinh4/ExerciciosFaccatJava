package faccat;

import java.util.Scanner;

public class _09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário mensal atual: ");
        double salarioAtual = scanner.nextDouble();

        System.out.print("Digite o percentual de reajuste: ");
        double percentualReajuste = scanner.nextDouble();

        double novoSalario = calcularNovoSalario(salarioAtual, percentualReajuste);

        System.out.println("O novo salário é: " + novoSalario);
    }

    private static double calcularNovoSalario(double salarioAtual, double percentualReajuste) {
        double valorReajuste = salarioAtual * (percentualReajuste / 100);
        double novoSalario = salarioAtual + valorReajuste;

        return novoSalario;
    }
}
