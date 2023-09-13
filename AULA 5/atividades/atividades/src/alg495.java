import java.util.Arrays;

public class alg495 {
    public static void main(String[] args) {
        char[] vetor = {'d', 'b', 'a', 'c'};

        System.out.println("Vetor original:");
        imprimirVetor(vetor);

        ordenarVetor(vetor);

        System.out.println("Vetor ordenado:");
        imprimirVetor(vetor);
    }

    public static void ordenarVetor(char[] vetor) {
        Arrays.sort(vetor);
    }

    public static void imprimirVetor(char[] vetor) {
        for (char caractere : vetor) {
            System.out.print(caractere + " ");
        }
        System.out.println();
    }
}
