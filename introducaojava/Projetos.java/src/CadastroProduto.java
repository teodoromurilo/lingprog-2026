import java.util.Scanner;
public class CadastroProduto {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String nome_produto ;
        double preco_produto ;
        String produto_maiscaro = "";
        double preco_maiscaro = -1;
        while (true){
            System.out.println("Digite o nome do produto");
            nome_produto  = sc.nextLine();
            System.out.println("Digite o preço do produto");
            preco_produto = sc.nextDouble();
            sc.nextLine();
            if (preco_produto > preco_maiscaro){
                preco_maiscaro = preco_produto ;
                produto_maiscaro = nome_produto;
            }
            System.out.println("Deseja continuar (Sim / Não )");
            String continuar = sc.nextLine();
            if (continuar.equals("Não")){
                break;
            }
        }
        System.out.println("O produto mais caro é: " + produto_maiscaro + " (R$ " + preco_maiscaro + ")");
        sc.close();

    }
}
