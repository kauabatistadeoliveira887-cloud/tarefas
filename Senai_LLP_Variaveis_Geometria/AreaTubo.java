import java.util.Scanner;

public class AreaTubo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o raio: ");
        double raio = sc.nextDouble();

        System.out.print("Digite a altura: ");
        double altura = sc.nextDouble();

        double area = 2 * Math.PI * raio * altura;

        System.out.println("A área do tubo é: " + area);

        sc.close();
    }
}