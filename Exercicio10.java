package exercicio10;

import java.util.Scanner;

public class Exercicio10 {

    static int contarMovimentos(int discos) {
        if (discos == 0) {
            return 0;
        }

        return 2 * contarMovimentos(discos - 1) + 1;
    }

    static void hanoi(int n, char origem, char destino, char auxiliar) {
        if (n == 1) {
            System.out.println("Mover disco 1 de " + origem + " para " + destino);
        } else {
            hanoi(n - 1, origem, auxiliar, destino);

            System.out.println("Mover disco " + n + " de " + origem + " para " + destino);

            hanoi(n - 1, auxiliar, destino, origem);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] discos = new int[3];
        int total = 0;

        for (int i = 0; i < discos.length; i++) {
            do {
                System.out.print("Digite a quantidade de discos do jogo " + (i + 1) + " (1 a 10): ");
                discos[i] = sc.nextInt();
            } while (discos[i] < 1 || discos[i] > 10);
        }

        for (int i = 0; i < discos.length; i++) {
            System.out.println();
            System.out.println("Jogo " + (i + 1));

            hanoi(discos[i], 'A', 'C', 'B');

            int movimentos = contarMovimentos(discos[i]);

            System.out.println("Total de movimentos: " + movimentos);

            total += movimentos;
        }

        System.out.println();
        System.out.println("Total de movimentos dos 3 jogos: " + total);

        sc.close();
    }
}
