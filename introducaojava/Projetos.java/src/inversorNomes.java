
import java.util.Scanner;

public class inversorNomes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[5];
        System.out.println("Digite 5 nomes para registro");
        for (int i =0; i< 5; i++){
            nomes[i]= sc.nextLine();
        }
        System.out.println("Nomes em ordem inversa");
        for (int i =4 ; i>0; i--){
            System.out.println("Nova ordem " + i +"="+ nomes[i]);
        }
        sc.close();
    }
}
