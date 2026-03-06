import java.util.Scanner;

public class CalculadoraSwitch {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um numero");
        float n1 = sc.nextFloat();
        System.out.println("Informe o segundo numero");
        float n2 = sc.nextFloat();
        System.out.println("informe um operador + , - , * ou /");
        String operador = sc.next();
        float resultado = 0 ;
        switch (operador) {
            case "+":
                resultado = n1 + n2;
                break;
            case "-":
                resultado = n1 - n2;
                break;
            case "*":
                resultado = n1 * n2;
                break;
            case "/":
                resultado = n1 / n2;
                break;
            default:
                System.out.println("Operador Invalido");
        }
        System.out.println("O resultado é :"+ resultado);
    }
}
