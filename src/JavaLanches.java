import java.util.Scanner;

public class JavaLanches {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("---Cardapio JavaLanches---");
        System.out.println("---Faça o seu pedido---");
        System.out.println("--101- Cachorro Quente (R$: 10,00)");
        System.out.println("--102- X- Burguer (R$: 15,00)");
        System.out.println("--103- X- Salada (R$: 12,00)");
        System.out.println("--- Outras opções invalidas---");
        int codigo = sc.nextInt();
        float total = 0;
        switch (codigo){
            case 101:
                total = 10 ;
                System.out.println("Você escolheu Cachorro Quente");
                break;
            case 102:
                total = 15;
                System.out.println("Você escolheu X-Burguer");
                break;
            case 103:
                total = 12;
                System.out.println("Você escolheu X-Salada");
                break;
            default:
                System.out.println("Opção invalida");
                break;
        }
        System.out.println("--Informe a sua idade para desconto especial-- ");
        int idade = sc.nextInt();
        if (idade <12){
            float desconto = total * 0.50f;
            total = total- desconto;
            System.out.println("Desconto de 50% (Menu Kids)");
        } else if (idade>12 && idade <60) {
            System.out.println("Sem desconto , preço normal");
        }else {
            float desconto = total * 0.30f;
            total = total - desconto ;
            System.out.println("Desconto de 30% (Melhor idade )");
        }
        System.out.println("O valor a ser pago é de R$:"+ total);
    }
}
