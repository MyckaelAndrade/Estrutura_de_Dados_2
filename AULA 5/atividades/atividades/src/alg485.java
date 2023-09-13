public class alg485 {
    public static void main(String[] args) {
        int tamanho = 5;
        int[] vetorInteiros = {3, 1, 2, 0, 4};
        char[] vetorCaracteres = {'A', 'B', 'C', 'D', 'E'};

        imprimirCaracteresRepetidos(vetorInteiros, vetorCaracteres, tamanho);
    }

    public static void imprimirCaracteresRepetidos(int[] vetorInteiros, char[] vetorCaracteres, int tamanho) {
        if (vetorInteiros.length != tamanho || vetorCaracteres.length != tamanho) {
            throw new IllegalArgumentException("Os vetores devem ter o mesmo tamanho.");
        }

        for (int i = 0; i < tamanho; i++) {
            int vezes = vetorInteiros[i];
            char caractere = vetorCaracteres[i];

            for (int j = 0; j < vezes; j++) {
                System.out.print(caractere + " ");
            }
        }

        System.out.println(); // Pula para a próxima linha após imprimir os caracteres.
    }
}

