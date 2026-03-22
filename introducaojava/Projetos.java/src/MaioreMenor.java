
import java.util.Scanner;

public class MaioreMenor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[]num = new int[10];
        int maior =0;
        int menor =0;
        int posmaior= 0;
        int posmenor = 0;
        System.out.println("Digite 10 numeros para dar continuidade");
        for (int i =0; i<10; i++){
            System.out.println("Numero :"+(i+1));
            num[i]= sc.nextInt();
        }
        for (int i =0; i<10;i++){
            if (num[i]>maior){
                maior= num[i];
                posmaior= i;
            }
            if (num[i]<menor){
                menor= num[i];
                posmenor = i;
            }
        }
        System.out.println("===Resultados===");
        System.out.println("Maior valor é : "+ maior + " na posição : " + posmaior);
        System.out.println("Menor valor é : "+ menor + " na posição : " + posmenor);
        sc.close();
    }
}
