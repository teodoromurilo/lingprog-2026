import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o seu nome :");
        String name = sc.nextLine();
        System.out.println("Informe o valor da Leitura anterior  :");
        int leitura_anterior = sc.nextInt();
        System.out.println("Informe o valor da Leitura atual  :");
        int leitura_atual = sc.nextInt();
        float valorkwh = 0.60f;
        String mensagem ="";
        // Calcular o consumo do mês //
        int consumo_mes = (leitura_atual - leitura_anterior);
        float valor_bruto = consumo_mes * valorkwh;
        // Aplicar bandeira tarifaria //
        String bandeira = "";
        float adicional = 0 ;
        if (consumo_mes > 0 && consumo_mes <= 100f) {
            bandeira = "verde";
            adicional = 0 ;
        } else if (consumo_mes > 100f && consumo_mes <= 200f) {
            bandeira = "amarela ";
            adicional = 2 ;
        } else if (consumo_mes > 201f && consumo_mes <= 300f) {
            bandeira = "vermelha";
            adicional = 5;
        } else if (consumo_mes > 300f) {
            bandeira = "preta";
            adicional = 10;
        } else
            mensagem = "Valores invalidos";
        {
            float valor_final = valor_bruto + adicional;
            System.out.println("\n--- RESUMO DA CONTA ---");
            System.out.println("Cliente: " + name);
            System.out.println("Consumo total: " + consumo_mes + " kWh");
            System.out.println("Bandeira tarifária: " + bandeira);
            System.out.printf("Valor final a pagar: R$ %.2f \n", valor_final);

            sc.close();

        }

    }

}