public class alg493 {
    public static void main(String[] args) {
        int[] vetorCrescente = {1, 2, 3, 4, 5};
        int[] vetorDecrescente = {5, 4, 3, 2, 1};
        int[] vetorDesordenado = {3, 1, 5, 4, 2};

        System.out.println("Vetor crescente: " + verificarOrdenacao(vetorCrescente));
        System.out.println("Vetor decrescente: " + verificarOrdenacao(vetorDecrescente));
        System.out.println("Vetor desordenado: " + verificarOrdenacao(vetorDesordenado));
    }

    public static String verificarOrdenacao(int[] vetor) {
        boolean crescente = true;
        boolean decrescente = true;

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > vetor[i - 1]) {
                decrescente = false;
            } else if (vetor[i] < vetor[i - 1]) {
                crescente = false;
            }
        }

        if (crescente) {
            return "Crescente";
        } else if (decrescente) {
            return "Decrescente";
        } else {
            return "Desordenado";
        }
    }
}
