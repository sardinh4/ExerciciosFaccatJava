package faccat;

import java.util.Scanner;

public class _11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de carros vendidos: ");
        int numeroCarros = scanner.nextInt();

        System.out.print("Digite o valor total das vendas: ");
        double valorVendas = scanner.nextDouble();

        System.out.print("Digite o salário fixo: ");
        double salarioFixo = scanner.nextDouble();

        System.out.print("Digite o valor por carro vendido: ");
        double valorPorCarro = scanner.nextDouble();

        double salarioFinal = calcularSalarioFinal(numeroCarros, valorVendas, salarioFixo, valorPorCarro);

        System.out.println("O salário final do vendedor é: " + salarioFinal);
    }

    private static double calcularSalarioFinal(int numeroCarros, double valorVendas, double salarioFixo, double valorPorCarro) {
        // Calculando a comissão (5% do valor das vendas)
        double comissao = 0.05 * valorVendas;

        // Calculando o salário final
        double salarioFinal = salarioFixo + (numeroCarros * valorPorCarro) + comissao;

        return salarioFinal;
    }
}
