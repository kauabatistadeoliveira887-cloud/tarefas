import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o raio do círculo: ");
        double raio = sc.nextDouble();

        double area = Math.PI * raio * raio;

        System.out.println("A área do círculo é: " + area);

        sc.close();
    }
}