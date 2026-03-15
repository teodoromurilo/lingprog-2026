import java.util.Scanner;

public class Investimento {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double valor_inicial ;
        double taxa ;
        System.out.println("Digite o valor inicial do investimento");
        valor_inicial = sc.nextDouble();
        System.out.println("Digite o valor da taxa de juros mensal ");
        taxa = sc.nextDouble();
        double saldo = valor_inicial;
        for (int mes =1; mes <=12 ; mes++){
            saldo = saldo * (1 + taxa);
            System.out.println("Mês " + mes + ": R$ "+ saldo);
        }
        sc.close();
    }
}
