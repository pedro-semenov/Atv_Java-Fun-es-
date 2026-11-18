package exercicio02;

import java.util.Scanner;

public class Exercicio02 {

    static int inverterNumero(int numero) {
        int invertido = 0;

        while (numero > 0) {
            int digito = numero % 10;
            invertido = invertido * 10 + digito;
            numero = numero / 10;
        }

        return invertido;
    }

    static void exibirInvertidos(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i] + " ao contrário: " + inverterNumero(numeros[i]));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            do {
                System.out.print("Digite o número " + (i + 1) + ": ");
                numeros[i] = sc.nextInt();
            } while (numeros[i] < 0);
        }

        System.out.println();
        exibirInvertidos(numeros);

        sc.close();
    }
}
