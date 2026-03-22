import java.util.Scanner;

public class SubstituicaoValores {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] num = new int[10];
        System.out.println("Digite 10 numeros inteiros , caso Negativo ele sera substituido por 0!!");
        for (int i= 0; i<10 ; i++){
            System.out.println("Numeros digitados : "+(i+1));
            num[i]= sc.nextInt();
        }
        for (int i =0; i<10;i++){
            if (num[i]<0){
                num[i] = 0;
            }
        }
        System.out.println("Substituiçaõ dos Valores");
        for (int i =0 ; i<10;i++){
            System.out.println("Posição atualizada"+ i +":"+num[i]);
        }
        sc.close();
    }
}
