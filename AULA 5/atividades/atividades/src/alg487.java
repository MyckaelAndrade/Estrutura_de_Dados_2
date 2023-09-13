public class alg487 {
    public static void main(String[] args) {
        int tamanho = 5;
        int[] vetor = {1, 2, 3, 4, 5};

        System.out.println("Vetor original:");
        imprimirVetor(vetor);

        inverte(vetor, tamanho);

        System.out.println("Vetor invertido:");
        imprimirVetor(vetor);
    }

    public static void inverte(int[] vetor, int tamanho) {
        for (int i = 0; i < tamanho / 2; i++) {
            int temp = vetor[i];
            vetor[i] = vetor[tamanho - 1 - i];
            vetor[tamanho - 1 - i] = temp;
        }
    }

    public static void imprimirVetor(int[] vetor) {
        for (int elemento : vetor) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }
}
