import java.util.Random;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1;
        int palpite = 0;
        int tentativas = 0;

        while (palpite != numeroSecreto) {
            System.out.print("Digite seu palpite (1 a 100): ");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite < numeroSecreto) {
                System.out.println("O número secreto é maior.");
            } else if (palpite > numeroSecreto) {
                System.out.println("O número secreto é menor.");
            } else {
                System.out.println("Parabéns! Você acertou em " + tentativas + " tentativas.");
            }
        }

        scanner.close();
    }
}
