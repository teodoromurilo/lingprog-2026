import java.util.Scanner;
public class ExemploFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Informe qtde de vezes o dado sera lançado");
        int qtd = sc.nextInt();
        System.out.println("Informe o numero que deve acertar ");
        int num = sc.nextInt();
        while (num <1 || num >6){
            System.out.println("Informe o numero que deve ser entre 1 e 6");
            num = sc.nextInt();
        }
        int contador = 0;
        for (int i = 1; i <= qtd; i++) {
            int aleatorio = (int) (Math.random()* 6 + 1 );
            System.out.println(i + "Dado lançado " + aleatorio);
            if (aleatorio == num){
                contador++;
            }
        }
        System.out.println( "Dado acertou " + contador);
        System.out.println("% de acerto " + ((float)contador / qtd) * 100);
    }
}