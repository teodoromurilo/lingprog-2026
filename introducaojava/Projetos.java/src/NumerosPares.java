import java.util.Scanner;
public class NumerosPares {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um limite inferior ");
        int inferior = sc.nextInt();
        System.out.println("Digite um limite superior");
        int superior = sc.nextInt();
        System.out.println("Os numeros pares entre "+ inferior + " e "+ superior);
        for (int i = inferior ; i<=superior ; i++){
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
