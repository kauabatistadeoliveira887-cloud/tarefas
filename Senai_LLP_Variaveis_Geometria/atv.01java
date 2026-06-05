public class Atividade001 {

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Informe um texto como argumento.");
            return;
        }

        String texto = String.join(" ", args);

        int quantidadePalavras = args.length;
        int quantidadeVogais = 0;
        int palavrasPares = 0;
        int palavrasImpares = 0;

        for (char c : texto.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                quantidadeVogais++;
            }
        }

        for (String palavra : args) {
            int tamanho = palavra.length();

            if (tamanho % 2 == 0) {
                palavrasPares++;
            } else {
                palavrasImpares++;
            }
        }

        System.out.println("Texto: " + texto);
        System.out.println("Quantidade de palavras: " + quantidadePalavras);
        System.out.println("Quantidade de vogais: " + quantidadeVogais);
        System.out.println("Palavras com quantidade de letras pares: " + palavrasPares);
        System.out.println("Palavras com quantidade de letras impares: " + palavrasImpares);
    }
}