import java.util.Scanner ;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Imforme o seu nome");
        String nome = entrada.next();
        System.out.println("Imforme a sua idade");
        int idade = entrada.nextInt();
        System.out.println("Imforme o seu peso ");
        float peso = entrada.nextFloat();
        System.out.println("Imforme a sua altura");
        float altura = entrada.nextFloat();
        // calcular o imc
        float imc = peso / (altura * altura);
        String mensagem = "";
        if (imc < 18.5f) {
            System.out.println("Você esta abaixo do peso");
        } else if (imc >= 18.5f && imc <= 24.9f) {
            mensagem = "Peso normal ";
        } else if (imc >= 25 && imc <= 29.9f) {
            mensagem = "Sobre peso";
        } else if (imc > 30 && imc <= 34.9f) {
            mensagem = "Obesidade grau 1 ";
        } else if (imc >= 35 && imc <= 39.9f) {
            mensagem = "Obesidade grau 2 ";
        } else if (imc > 40) {
            mensagem = "Obesidade grau 3";
        } else
            mensagem = "Valores invalidos";
        {
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
            System.out.println("Peso: " + peso);
            System.out.println("Altura: " + altura);
            System.out.println("IMC: " + imc);
            System.out.println("Mensagem: " + mensagem);



        }
    }
}
