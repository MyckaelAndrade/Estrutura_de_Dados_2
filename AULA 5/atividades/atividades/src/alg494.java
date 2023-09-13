public class alg494 {
    public static void main(String[] args) {
        int[] vetor = {1, 3, 5, 7, 9};
        int elementoA = 5;
        int elementoB = 8;

        System.out.println("Vetor original:");
        imprimirVetor(vetor);

        // Troca o elemento 'elementoA' pelo elemento 'elementoB' no vetor.
        trocaElementos(vetor, elementoA, elementoB);

        System.out.println("\nVetor após a troca:");
        imprimirVetor(vetor);
    }

    public static void trocaElementos(int[] vetor, int elementoA, int elementoB) {
        int indiceA = -1;
        int indiceB = -1;

        // Encontra os índices dos elementos no vetor.
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == elementoA) {
                indiceA = i;
            } else if (vetor[i] == elementoB) {
                indiceB = i;
            }
        }

        // Verifica se ambos os elementos foram encontrados no vetor.
        if (indiceA != -1 && indiceB != -1) {
            // Troca os elementos nos índices correspondentes.
            int temp = vetor[indiceA];
            vetor[indiceA] = vetor[indiceB];
            vetor[indiceB] = temp;
        } else {
            System.out.println("Um ou ambos os elementos não foram encontrados no vetor.");
        }
    }

    public static void imprimirVetor(int[] vetor) {
        for (int elemento : vetor) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }
}
