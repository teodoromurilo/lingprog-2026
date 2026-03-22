import java.util.Scanner;

public class SomaPares {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] numeros = new int[8];
        int somapares =0;
        System.out.println("Digite 8 numeros inteiros");
        for (int i = 0 ; i<8;i++){
            System.out.println("Numeros inteiros " + i);
            numeros[i]= sc.nextInt();
            if (numeros[i]%2==0){
               somapares+= numeros[i];
            }
        }
        System.out.println("==Resultados==");
        System.out.println("Soma de Pares é "+ somapares);
        sc.close();
    }
}
