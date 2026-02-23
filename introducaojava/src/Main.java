//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // variavel do tipo String
        String nome = "Murilo";
        //variavel do tipo int
        int idade = 37;
        // variavel do tipo float
        float peso= 98.5f;
        float altura = 1.85f ;
        // calcular o imc
        float imc = peso/ (altura * altura);
        System.out.println(nome+ " seu IMC é c " +imc);
        if (imc < 18.5f) {
            System.out.println("Você esta abaixo do peso");
        }
    }
}