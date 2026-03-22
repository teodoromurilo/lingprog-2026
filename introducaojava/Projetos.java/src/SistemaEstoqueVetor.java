import java.util.Scanner;
public class SistemaEstoqueVetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[5];
        int[] estoque = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o nome do produto " + (i + 1) + ": ");
            nomes[i] = sc.nextLine();

            System.out.print("Digite a quantidade em estoque para " + nomes[i] + ": ");
            estoque[i] = sc.nextInt();
            sc.nextLine();
        }

        // Listar produtos com estoque crítico (< 5)
        System.out.println("\nProdutos com estoque crítico (menos de 5 unidades):");
        boolean temCritico = false;
        for (int i = 0; i < 5; i++) {
            if (estoque[i] < 5) {
                System.out.println("- " + nomes[i] + ": " + estoque[i] + " unidades");
                temCritico = true;
            }
        }

        if (!temCritico) {
            System.out.println("Nenhum produto com estoque crítico.");
        }

        sc.close();
    }
}

