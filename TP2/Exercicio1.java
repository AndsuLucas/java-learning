import java.util.Scanner;

public class Exercicio1 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome completo: ");
        String nomeUsuario = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite o nome da sua mãe: ");
        String nomeMae = scanner.nextLine();

        System.out.print("Digite o nome do seu pai: ");
        String nomePai = scanner.nextLine();

        System.out.println("\nInformações fornecidas:");
        System.out.println("Nome: " + nomeUsuario);
        System.out.println("Idade: " + idade);
        System.out.println("Nome da mãe: " + nomeMae);
        System.out.println("Nome do pai: " + nomePai);

        if (nomeUsuario.length() > nomeMae.length() && nomeUsuario.length() > nomePai.length()) {
            System.out.println("Seu nome é maior que os nomes da sua mãe e do seu pai.");
        } else if (nomeUsuario.length() > nomeMae.length()) {
            System.out.println("Seu nome é maior que o nome da sua mãe.");
        } else if (nomeUsuario.length() > nomePai.length()) {
            System.out.println("Seu nome é maior que o nome do seu pai.");
        } else {
            System.out.println("Seu nome não é maior que o nome da sua mãe nem do seu pai.");
        }

        scanner.close();
    }
}
