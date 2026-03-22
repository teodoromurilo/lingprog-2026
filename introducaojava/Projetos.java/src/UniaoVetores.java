import java.util.Scanner;

public class UniaoVetores {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] vetor1 = new int[5];
        int [] vetor2= new int[5];
        int [] vetorjuncao= new int[10];
        System.out.println("Digite o 1 vetor com 5 posições");
        for (int i=0 ; i<5;i++){
            System.out.println("Vetor 1 , posição " + (i+1) +":");
            vetor1[i]= sc.nextInt();
        }
        System.out.println("Digite o 2 vetor (5 posições)");
        for (int i = 0; i<5;i++){
            System.out.println("Vetor 2 , posição " + (i+1) + ":");
            vetor2[i] = sc.nextInt();
        }
        for (int i =0; i<5; i++){
            vetorjuncao[i]= vetor1[i];
            vetorjuncao[ i+ 5] = vetor2[i];
        }
        System.out.println("===Resultados===");
        System.out.println("Vetor 1:");
        for (int i =0; i<5;i++){
            System.out.println(vetor1[i]+"");
        }
        System.out.println("Vetor2 :");
        for (int i =0 ; i<5;i++){
            System.out.println(vetor2[i] + "");
        }
        System.out.println();
        System.out.println("Vetor Junção (10 posições)");
        for (int i=0; i<10;i++){
            System.out.println(vetorjuncao[i] + "");
        }
        sc.close();
    }
}
