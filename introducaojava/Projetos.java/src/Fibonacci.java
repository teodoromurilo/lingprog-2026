import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero de termos que sera lido ");
        int num_termos = sc.nextInt();
        int primeiro_termo = 0;
        int segundo_termo = 1;
        System.out.println(" Sequência "+ primeiro_termo +","+ segundo_termo);
        for (int i =2 ; i <=num_termos ; i++){
            int proximo = primeiro_termo + segundo_termo;
            System.out.println(""+proximo);
            primeiro_termo = segundo_termo;
            segundo_termo= proximo ;
        }
        sc.close();
    }
}
