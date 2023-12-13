package faccat;

import java.util.Scanner;

public class _38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int codigoUsuarioCorreto = 1234;

        System.out.print("Digite o código de usuário: ");
        int codigoUsuario = scanner.nextInt();

        if (codigoUsuario != codigoUsuarioCorreto) {
            System.out.println("Usuário inválido!");
        } else {
            System.out.print("Digite a senha: ");
            int senha = scanner.nextInt();

            if (senha != 9999) {
                System.out.println("Senha incorreta!");
            } else {
                System.out.println("Acesso permitido.");
            }
        }
    }
}
