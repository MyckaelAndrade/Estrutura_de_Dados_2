public class alg497 {
    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int chave = 7;
        int tamanho = vetor.length;

        int posicao = buscaBinaria(vetor, chave, tamanho);

        if (posicao != -1) {
            System.out.println("A chave " + chave + " está na posição " + posicao + " do vetor.");
        } else {
            System.out.println("A chave " + chave + " não foi encontrada no vetor.");
        }
    }

    public static int buscaBinaria(int[] vetor, int chave, int tamanho) {
        int esquerda = 0;
        int direita = tamanho - 1;

        while (esquerda <= direita) {
            int meio = (esquerda + direita) / 2;

            if (vetor[meio] == chave) {
                return meio; // A chave foi encontrada na posição "meio".
            } else if (vetor[meio] < chave) {
                esquerda = meio + 1; // Procura na metade direita do vetor.
            } else {
                direita = meio - 1; // Procura na metade esquerda do vetor.
            }
        }

        return -1; // A chave não foi encontrada no vetor.
    }
}
