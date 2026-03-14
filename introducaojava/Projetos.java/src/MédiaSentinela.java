import java.util.Scanner;
public class MédiaSentinela {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int idade ;
        int quantidade = 0;
        double somaidades = 0, totalidade = 0;
        boolean continuar = true;
        System.out.println("===Calculo da média das idades=== ");
        System.out.println("Digite as idades dos alunos ( Numero negativo para parar !!!)");
        while (continuar){
            System.out.println("Idade do aluno");
            idade = sc.nextInt();
            if (idade<0){
                continuar = false;

            }else {
                somaidades+= idade;
                quantidade++;
                totalidade++;
            }
        }
        double media = somaidades/quantidade;
        if (quantidade>0){
            System.out.println("===Resultado===");
            System.out.println("Total de alunos " + quantidade);
            System.out.println("Media de idades " + media);
        }else {
            System.out.println("Nenhuma idade válida foi digitada ");
        }
        sc.close();
    }
}
