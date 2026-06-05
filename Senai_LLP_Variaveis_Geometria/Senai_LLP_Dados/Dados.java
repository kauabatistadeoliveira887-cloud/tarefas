import java.util.Scanner;

public class Dados {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantidade de dados: ");
        int quantidade = sc.nextInt();

        for (int i = 1; i <= quantidade; i++) {

            int valor = (int)(Math.random() * 6) + 1;

            System.out.println("\nDado " + i + ":");
            desenharDado(valor);
        }

        sc.close();
    }

    public static void desenharDado(int valor) {

        System.out.println("+-----+");

        switch (valor) {
            case 1:
                System.out.println("|     |");
                System.out.println("|  *  |");
                System.out.println("|     |");
                break;

            case 2:
                System.out.println("|*    |");
                System.out.println("|     |");
                System.out.println("|    *|");
                break;

            case 3:
                System.out.println("|*    |");
                System.out.println("|  *  |");
                System.out.println("|    *|");
                break;

            case 4:
                System.out.println("|*   *|");
                System.out.println("|     |");
                System.out.println("|*   *|");
                break;

            case 5:
                System.out.println("|*   *|");
                System.out.println("|  *  |");
                System.out.println("|*   *|");
                break;

            case 6:
                System.out.println("|*   *|");
                System.out.println("|*   *|");
                System.out.println("|*   *|");
                break;
        }

        System.out.println("+-----+");
    }
}