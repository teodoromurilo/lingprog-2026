import java.util.Scanner;
public class LoginSenha {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome , senha ;
        boolean valido = false;
        System.out.println("=====Sistema de Login=====");
        while (!valido){
            System.out.println("Digite seu Nome");
            nome = sc.nextLine();
            System.out.println("Digite a sua senha ");
            senha = sc.nextLine();
            if (nome.equalsIgnoreCase(senha)){
                System.out.println("Erro !!!! Senha não pode ser igual o nome !!!!");
                System.out.println("Tente novamente . \n ");

            }else {
                valido= true;
                System.out.println("Login ok!!! Bem vindo !!!"+ nome +"!!");
            }
        }
           sc.close();
    }
}
