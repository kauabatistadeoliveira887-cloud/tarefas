import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class LivroDeReceitas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Receita: ");
        String receita = sc.nextLine();

        ArrayList<String> ingredientes = new ArrayList<>();
        ArrayList<String> quantidades = new ArrayList<>();
        ArrayList<String> passos = new ArrayList<>();

        while (true) {
            System.out.print("Ingrediente: ");
            String ingrediente = sc.nextLine();

            if (ingrediente.isEmpty()) {
                break;
            }

            System.out.print("Quantidade: ");
            String quantidade = sc.nextLine();

            ingredientes.add(ingrediente);
            quantidades.add(quantidade);
        }

        int contador = 1;

        while (true) {
            System.out.print("Passo " + contador + ": ");
            String passo = sc.nextLine();

            if (passo.isEmpty()) {
                break;
            }

            passos.add(passo);
            contador++;
        }

        System.out.println("\n=== RECEITA ===");
        System.out.println(receita);

        System.out.println("\nIngredientes:");
        for (int i = 0; i < ingredientes.size(); i++) {
            System.out.println((i + 1) + ". " +
                    ingredientes.get(i) +
                    " - " +
                    quantidades.get(i));
        }

        System.out.println("\nModo de preparo:");
        for (int i = 0; i < passos.size(); i++) {
            System.out.println((i + 1) + ". " + passos.get(i));
        }

        try {
            String nomeArquivo = receita.replace(" ", "_") + ".txt";

            PrintWriter arquivo =
                    new PrintWriter(new FileWriter(nomeArquivo));

            arquivo.println(receita);
            arquivo.println();

            arquivo.println("Ingredientes:");
            for (int i = 0; i < ingredientes.size(); i++) {
                arquivo.println((i + 1) + ". " +
                        ingredientes.get(i) +
                        " - " +
                        quantidades.get(i));
            }

            arquivo.println();

            arquivo.println("Modo de preparo:");
            for (int i = 0; i < passos.size(); i++) {
                arquivo.println((i + 1) + ". " + passos.get(i));
            }

            arquivo.close();

            System.out.println("\nArquivo salvo com sucesso!");

        } catch (Exception e) {
            System.out.println("Erro ao salvar arquivo.");
        }

        sc.close();
    }
}
