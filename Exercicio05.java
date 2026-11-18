package exercicio05;

import java.util.Scanner;

public class Exercicio05 {

    static int contarVogais(String texto) {
        int contador = 0;
        texto = texto.toLowerCase();

        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);

            if (letra == 'a' || letra == 'e' || letra == 'i' ||
                letra == 'o' || letra == 'u') {
                contador++;
            }
        }

        return contador;
    }

    static void exibirContagem(String[] frases) {
        for (int i = 0; i < frases.length; i++) {
            System.out.println(frases[i] + " tem " + contarVogais(frases[i]) + " vogais");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] frases = new String[3];

        for (int i = 0; i < frases.length; i++) {
            System.out.print("Digite a palavra ou frase " + (i + 1) + ": ");
            frases[i] = sc.nextLine();
        }

        System.out.println();
        exibirContagem(frases);

        sc.close();
    }
}
