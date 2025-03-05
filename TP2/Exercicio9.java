import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Cadastre uma senha: ");
        String senhaCorreta = scanner.nextLine();
        String senhaDigitada;

        do {
            System.out.print("Digite a senha: ");
            senhaDigitada = scanner.nextLine();

            if (!senhaDigitada.equals(senhaCorreta)) {
                System.out.println("Senha incorreta. Tente novamente.");
            }
        } while (!senhaDigitada.equals(senhaCorreta));

        System.out.println("Senha correta! Acesso concedido.");

        scanner.close();
    }
}
