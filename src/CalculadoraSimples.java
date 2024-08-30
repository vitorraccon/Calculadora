import java.util.Scanner;
public class CalculadoraSimples {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int n1 = in.nextInt();

        System.out.println("Digite o segundo número: ");
        int n2 = in.nextInt();

        int soma = n1+n2;
        int sub = n1-n2;
        int mult = n1*n2;
        int div = n1/n2;

        System.out.println("SOMA:" + soma);
        System.out.println("SUBTRAÇÃO:" + sub);
        System.out.println("MULTIPLICAÇÃO:" + mult);
        System.out.println("DIVISÃO:" + div);
    }
}
