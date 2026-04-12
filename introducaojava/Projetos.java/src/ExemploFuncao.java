import java.util.Scanner;

public class ExemploFuncao {

    public static double calcularretangulo(double base, double altura) {
        return base * altura;
    }
    public static boolean ehPar(int num) {
        return num % 2 == 0;
    }
    public static float converterTemperatura(int celcius) {
        return (float) celcius*1.8f*32;
    }
    public static String avaliacao(float media) {
        if (media >= 6) {
            return "Aprovado";
        } else if (media >= 4) {
            return "Recupeação";
        } else {
            return "Reprovado";
        }
    }
    public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            System.out.println("Digite o valor da base : ");
            double base = sc.nextDouble();
            System.out.println("Digite o valor da altura: ");
            double altura = sc.nextDouble();
        System.out.println("A area do retangulo é "+calcularretangulo(base,altura));
        System.out.println("Vamos verificar se a base é par ");
        if (ehPar((int)base)){
            System.out.println("Base é par ");
        }else System.out.println("Base é impar ");
        System.out.println("Imforme a temperatura para calculo");
        float celcius = sc.nextFloat();
        System.out.println("A temperatura em fahrenheit é de "+ converterTemperatura((int)celcius)+(1.8f*32));
        System.out.println("Calcule a média das notas da turma e diga se o aluno foi aprovado  ");
        int nota1 = sc.nextInt();
        int nota2 = sc.nextInt();
        int nota3 = sc.nextInt();
        int media = (nota1+nota2+nota3)/3;
        System.out.println("A media das notas é de "+ media +","+ avaliacao(media));
    }
}
