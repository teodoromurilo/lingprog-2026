import java.util.Scanner;
public class SomatorioN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos numeros você quer somar ");
        int quant = sc.nextInt();
        double soma = 0;
        for (int i = 1 ; i<=quant; i++){
            System.out.println("Digite o numero " + i+ ":");
            int num = sc.nextInt();
            soma+= num;

        }
        System.out.println("A soma total é de :"+ soma);
        sc.close();

    }
}
