import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor em reais (R$): ");
        double valorReais = scanner.nextDouble();

        System.out.print("Escolha a moeda de destino (dólar, euro, libra): ");
        String moedaDestino = scanner.next().toLowerCase();

        double taxaCambio;
        switch (moedaDestino) {
            case "dólar":
                taxaCambio = 5.10;
                break;
            case "euro":
                taxaCambio = 5.50;
                break;
            case "libra":
                taxaCambio = 6.40;
                break;
            default:
                System.out.println("Moeda inválida.");
                scanner.close();
                return;
        }

        double valorConvertido = valorReais / taxaCambio;
        System.out.printf("Valor convertido: %.2f %s\n", valorConvertido, moedaDestino);

        scanner.close();
    }
}
