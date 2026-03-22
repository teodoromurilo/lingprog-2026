import java.util.Scanner;

public class BuscadorPesquisa {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] nome = new String[10];

        System.out.println("==Preencha o vetor com 10 nomes ==");
        for (int i =0; i<10; i++){
            System.out.println("Nomes digitados " +(i+1) + ":");
            nome[i] = sc.nextLine();
        }
        System.out.println("\nLista de nomes cadastrada ");
        for (int i =0 ; i<10; i++){
            System.out.println((i+1) + "-" + nome[i]);
        }
        System.out.println("Qual nome deseja buscar ?");
        String nomebusca = sc.nextLine();
        boolean encontrado = false;
        int pos = -1;
        for (int i =0 ; i<10;i++) {
            if (nome[i].equalsIgnoreCase(nomebusca)) {
                encontrado = true;
                pos = i;
                break;
            }
        }
        if (encontrado) {
            System.out.println("O nome '" + nomebusca + "' está na lista na posição " + pos + ".");
        } else {
            System.out.println("O nome '" + nomebusca + "' NÃO está na lista.");
        }

        sc.close();
    }
}
