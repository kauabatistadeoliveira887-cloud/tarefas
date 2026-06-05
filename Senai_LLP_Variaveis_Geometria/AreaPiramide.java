import java.util.Scanner;

public class AreaPiramide {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a área da base: ");
        double base = sc.nextDouble();

        System.out.print("Digite a área lateral: ");
        double lateral = sc.nextDouble();

        double areaTotal = base + lateral;

        System.out.println("A área da pirâmide é: " + areaTotal);

        sc.close();
    }
}