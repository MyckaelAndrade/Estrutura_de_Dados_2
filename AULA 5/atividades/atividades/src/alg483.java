public class alg483 {
    public static void main(String[] args) {
        int[] vetor1 = {1, 2, 3};
        int[] vetor2 = {4, 5, 6};
        int quantidadeElementos = 3;

        int produtoInterno = calcularProdutoInterno(vetor1, vetor2, quantidadeElementos);

        System.out.println("Produto Interno: " + produtoInterno);
    }

    public static int calcularProdutoInterno(int[] vetor1, int[] vetor2, int quantidadeElementos) {
        if (vetor1.length != quantidadeElementos || vetor2.length != quantidadeElementos) {
            throw new IllegalArgumentException("Os vetores devem ter a mesma quantidade de elementos.");
        }

        int produtoInterno = 0;

        for (int i = 0; i < quantidadeElementos; i++) {
            produtoInterno += vetor1[i] * vetor2[i];
        }

        return produtoInterno;
    }
}
