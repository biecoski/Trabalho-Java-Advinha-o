import java.util.Scanner;

public class JogoAdivinhacao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroAleatorio = (int) (Math.random() * 100) + 1;
        int numeroTentativas = 10; // número máximo de tentativas
        boolean acertou = false;

        System.out.println("Bem-vindo ao nosso Jogo de Adivinhação! Tente adivinhar o número entre 1 e 100.");

        while (numeroTentativas > 0) {
            System.out.println("Você ainda tem " + numeroTentativas + " tentativas.");
            System.out.print("Digite seu palpite: ");
            int palpite = scanner.nextInt();

            if (palpite < numeroAleatorio) {
                System.out.println("Seu palpite está baixo. Tente um número maior.");
            } else if (palpite > numeroAleatorio) {
                System.out.println("Seu palpite está alto. Tente um número menor.");
            } else {
                acertou = true;
                break;
            }

            numeroTentativas--;
        }

        if (acertou) {
            System.out.println("Parabéns! Você acertou o número " + numeroAleatorio + "!");
            System.out.println("Você precisou de " + (10 - numeroTentativas) + " tentativas.");
        } else {
            System.out.println("Suas tentativas acabaram! O número era: " + numeroAleatorio);
        }

        scanner.close();
    }
}
