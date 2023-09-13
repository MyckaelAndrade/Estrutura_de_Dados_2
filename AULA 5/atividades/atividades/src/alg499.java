import java.util.Scanner;

public class alg499 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[5];
        int opcao;

        do {
            System.out.println("\nMenu de Operações em Vetor (Tamanho 5):");
            System.out.println("1. Preencher o vetor");
            System.out.println("2. Imprimir o vetor");
            System.out.println("3. Somar os elementos do vetor");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    preencherVetor(vetor, scanner);
                    break;
                case 2:
                    imprimirVetor(vetor);
                    break;
                case 3:
                    int soma = somarVetor(vetor);
                    System.out.println("A soma dos elementos do vetor é: " + soma);
                    break;
                case 4:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 4);
    }

    public static void preencherVetor(int[] vetor, Scanner scanner) {
        System.out.println("Preencha o vetor com 5 números inteiros:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o valor para a posição " + i + ": ");
            vetor[i] = scanner.nextInt();
        }
    }

    public static void imprimirVetor(int[] vetor) {
        System.out.println("Vetor:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Posição " + i + ": " + vetor[i]);
        }
    }

    public static int somarVetor(int[] vetor) {
        int soma = 0;
        for (int i = 0; i < 5; i++) {
            soma += vetor[i];
        }
        return soma;
    }
}

