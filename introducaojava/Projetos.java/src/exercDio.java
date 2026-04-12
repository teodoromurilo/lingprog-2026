
import java.util.Scanner;

public class exercDio {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome da 1 pessoa ");
        String nome1 = sc.nextLine();
        System.out.println("Digite a idade da 1 pessoa ");
        double idade1 = sc.nextDouble();
        System.out.println("Digite o nome da 2 pessoa ");
        String nome2 = sc.next();
        System.out.println("Digite a idade da 2 pessoa ");
        double idade2 = sc.nextDouble();
        double diferenca = idade1 - idade2;
        System.out.printf("A primeira idade é de %s , a segunda é %s , sendo assi ma diferença é de %s \n", idade1, idade2, diferenca);
        sc.close();

    }
}
