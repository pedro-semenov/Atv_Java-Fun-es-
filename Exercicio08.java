package exercicio08;

public class Exercicio08 {

    static boolean contem(int[] numeros, int valor) {
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == valor) {
                return true;
            }
        }

        return false;
    }

    static int[] sortear(int quantidade, int maximo) {
        int[] numeros = new int[quantidade];

        for (int i = 0; i < numeros.length; i++) {
            int numero;

            do {
                numero = (int) (Math.random() * maximo) + 1;
            } while (contem(numeros, numero));

            numeros[i] = numero;
        }

        return numeros;
    }

    static void exibir(int[] numeros) {
        System.out.print("Números sorteados:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(" " + numeros[i]);
        }

        System.out.println();
    }

    public static void main(String[] args) {
        int[] numeros = sortear(6, 60);

        exibir(numeros);
    }
}
