package faccat;

import java.util.Scanner;

public class _36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade do primeiro homem: ");
        int idadeHomemUm = scanner.nextInt();

        System.out.print("Digite a idade do segundo homem: ");
        int idadeHomemDois = scanner.nextInt();

        while (idadeHomemUm == idadeHomemDois) {
            System.out.println("As idades devem ser diferentes. Digite novamente.");
            System.out.print("Digite a idade do segundo homem: ");
            idadeHomemDois = scanner.nextInt();
        }

        System.out.print("Digite a idade da primeira mulher: ");
        int idadeMulher1 = scanner.nextInt();

        System.out.print("Digite a idade da segunda mulher: ");
        int idadeMulher2 = scanner.nextInt();

        while (idadeMulher1 == idadeMulher2) {
            System.out.println("As idades das mulheres devem ser diferentes. Digite novamente.");
            System.out.print("Digite a idade da segunda mulher: ");
            idadeMulher2 = scanner.nextInt();
        }

        int somaIdades = (idadeHomemUm > idadeHomemDois ? idadeHomemUm : idadeHomemDois) +
                (idadeMulher1 < idadeMulher2 ? idadeMulher1 : idadeMulher2);

        int produtoIdades = (idadeHomemUm < idadeHomemDois ? idadeHomemUm : idadeHomemDois) *
                (idadeMulher1 > idadeMulher2 ? idadeMulher1 : idadeMulher2);

        System.out.println("Soma das idades do homem mais velho e a mulher mais nova é de: " + somaIdades);
        System.out.println("Produto das idades do homem mais novo e a mulher mais velha é de: " + produtoIdades);
    }
}
