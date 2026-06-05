import java.util.Scanner;

public class Retangulo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double base;
        double altura;
        double area;

        System.out.print("Digite a base: ");
        base = sc.nextDouble();

        System.out.print("Digite a altura: ");
        altura = sc.nextDouble();

        area = base * altura;

        System.out.println("Área do retângulo:" + area);

        sc.close();
    }

}