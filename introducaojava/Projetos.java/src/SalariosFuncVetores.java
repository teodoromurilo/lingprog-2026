import java.util.Scanner;

public class SalariosFuncVetores {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double[]salario = new double[5];
        double soma = 0;
        System.out.println("Informe o salario de 5 funcionarios ");
        for (int i = 0 ; i<5 ; i++){
            System.out.println("Salarios dos 5 funcionarios " + (i+1) + ":");
            salario[i] = sc.nextDouble();
            soma+= salario[i];
        }
        double media = soma/5 ;
        int iguais = 0;
        int acima =  0;
        int abaixo =0;
        for (int i =0 ; i<5; i++){
            if (salario[i]==media){
                iguais++;
            } else if (salario[i]>media) {
                acima++;
            }else {
                abaixo++;
            }
        }
        System.out.println("====Resultados====");
        System.out.println("\nSalarios na média salarial " + media);
        System.out.println("Funcionarios com salario igual a media "+ iguais);
        System.out.println("Funcionarios com o salario acima da media " + acima);
        System.out.println("Funcionarios com salario abaixo da media  " + abaixo);
        sc.close();
    }
}
