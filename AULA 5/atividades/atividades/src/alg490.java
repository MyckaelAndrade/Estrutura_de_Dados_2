public class alg490 {
    public static void main(String[] args) {
        int tamanho = 8;
        char[] vetor = {'a', 'b', 'c', 'a', 'd', 'e', 'a', 'f'};
        char caractereSubstituto = 'a';

        int totalSubstituido = substituirCaractere(vetor, tamanho, caractereSubstituto);

        System.out.println("Total de caracteres substituídos: " + totalSubstituido);
        System.out.println("Vetor modificado:");
        imprimirVetor(vetor);
    }

    public static int substituirCaractere(char[] vetor, int tamanho, char caractereSubstituto) {
        int totalSubstituido = 0;

        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] == caractereSubstituto) {
                vetor[i] = '*';
                totalSubstituido++;
            }
        }

        return totalSubstituido;
    }

    public static void imprimirVetor(char[] vetor) {
        for (char caractere : vetor) {
            System.out.print(caractere + " ");
        }
        System.out.println();
    }
}
