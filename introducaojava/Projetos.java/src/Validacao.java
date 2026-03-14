import java.util.Scanner;
public class Validação {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma nota de 0 a 10 !!");
        int nota = sc.nextInt();
        while (nota<0 || nota>10){
            System.out.println("Valor invalido !!!! Digite novamente !!!!");
            System.out.println("Digite um valor entre 0 e 10 !!!");
            nota = sc.nextInt();
        }
        sc.close();
    }
}