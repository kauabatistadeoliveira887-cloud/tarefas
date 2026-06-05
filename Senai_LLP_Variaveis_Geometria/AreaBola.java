import java.util.Scanner;

public class AreaBola {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o raio da bola: ");
        double raio = sc.nextDouble();

        double area = 4 * Math.PI * raio * raio;

        System.out.println("A área da bola é: " + area);

        sc.close();
    }
}