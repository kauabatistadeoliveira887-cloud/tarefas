import java.util.Scanner;

public class AreaCaixa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o comprimento: ");
        double comprimento = sc.nextDouble();

        System.out.print("Digite a largura: ");
        double largura = sc.nextDouble();

        System.out.print("Digite a altura: ");
        double altura = sc.nextDouble();

        double area = 2 * (comprimento * largura +
                           comprimento * altura +
                           largura * altura);

        System.out.println("A área da caixa é: " + area);

        sc.close();
    }
}