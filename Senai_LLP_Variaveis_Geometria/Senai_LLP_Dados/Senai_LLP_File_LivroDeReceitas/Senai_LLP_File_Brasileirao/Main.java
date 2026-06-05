import java.io.File;
import java.util.*;

class Time {
    String nome;
    int pontos;
    int golsFeitos;
    int golsSofridos;

    public Time(String nome) {
        this.nome = nome;
    }

    public int getSaldo() {
        return golsFeitos - golsSofridos;
    }
}

public class Main {

    public static void main(String[] args) {

        Map<String, Time> times = new HashMap<>();

        try {
            Scanner arquivo = new Scanner(new File("jogos.txt"));

            while (arquivo.hasNextLine()) {

                String linha = arquivo.nextLine();
                String[] dados = linha.split(",");

                String timeA = dados[1];
                String timeB = dados[2];
                String resultado = dados[3];

                String[] gols = resultado.split("x");

                int golsA = Integer.parseInt(gols[0]);
                int golsB = Integer.parseInt(gols[1]);

                times.putIfAbsent(timeA, new Time(timeA));
                times.putIfAbsent(timeB, new Time(timeB));

                Time a = times.get(timeA);
                Time b = times.get(timeB);

                a.golsFeitos += golsA;
                a.golsSofridos += golsB;

                b.golsFeitos += golsB;
                b.golsSofridos += golsA;

                if (golsA > golsB) {
                    a.pontos += 3;
                } else if (golsB > golsA) {
                    b.pontos += 3;
                } else {
                    a.pontos += 1;
                    b.pontos += 1;
                }
            }

            arquivo.close();

            List<Time> tabela = new ArrayList<>(times.values());

            tabela.sort((t1, t2) -> {
                if (t2.pontos != t1.pontos) {
                    return t2.pontos - t1.pontos;
                }
                return t2.getSaldo() - t1.getSaldo();
            });

            System.out.println("+----+----------------------+--------+--------+");
            System.out.println("| #  | Time                 | Pontos | Saldo  |");
            System.out.println("+----+----------------------+--------+--------+");

            int posicao = 1;

            for (Time t : tabela) {
                System.out.printf(
                    "| %-2d | %-20s | %-6d | %-6d |\n",
                    posicao++,
                    t.nome,
                    t.pontos,
                    t.getSaldo()
                );
            }

            System.out.println("+----+----------------------+--------+--------+");

        } catch (Exception e) {
            System.out.println("Erro ao ler arquivo: " + e.getMessage());
        }
    }
}