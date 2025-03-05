import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor inicial: ");
        int valorInicial = scanner.nextInt();

        System.out.print("Digite o valor do incremento: ");
        int incremento = scanner.nextInt();

        int numeroAtual = valorInicial;

        while (numeroAtual <= 100) {
            if (numeroAtual != valorInicial) {
                System.out.print(", ");
            }
            System.out.print(numeroAtual);
            numeroAtual += incremento;
        }

        scanner.close();
    }
}
