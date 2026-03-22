import java.util.Scanner;

public class OrdemcrecenteVetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        System.out.println("Digite 5 numeros de vetores");
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o " + (i + 1) + "°n");
            numeros[i] = sc.nextInt();
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4 - i; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int aux = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = aux;
                }
            }
        }

        System.out.print("Vetor em ordem crescente: ");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println();

        sc.close();
    }
}




