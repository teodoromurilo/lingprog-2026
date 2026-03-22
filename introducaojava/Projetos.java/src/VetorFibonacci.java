import java.util.Scanner;
public class VetorFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número N: ");
        int n = scanner.nextInt();
        scanner.close();

        if (n <= 0) {
            System.out.println("N deve ser maior que 0.");
            return;
        }

        long[] vetor = new long[n];

        if (n > 0) {
            vetor[0] = 0;
        }
        if (n > 1) {
            vetor[1] = 1;
        }
        for (int i = 2; i < n; i++) {
            vetor[i] = vetor[i - 1] + vetor[i - 2];
        }

        System.out.print("Vetor de Fibonacci: ");
        for (int i = 0; i < n; i++) {
            System.out.print(vetor[i]);
            if (i < n - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}

