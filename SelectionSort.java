public class SelectionSort {

    public static int selectionSort(int[] vetor, int tamanho) {
        int numIteracoes = 0;
        int numTrocas = 0;
        int[] temp_arr = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            temp_arr[i] = vetor[i];
        }
        vetor = temp_arr;
        // O LAÇO EXTERNO i PERCORRE CADA POSICAO ONDE DEVE FICAR O MENOR VALOR RESTANTE
        // O LAÇO INTERNO j PROCURA O MENOR ELEMENTO ENTRE OS QUE AINDA NAO FORAM COLOCADOS
        // minIndex VAI GUARDANDO A POSICAO DO MENOR ELEMENTO SENDO ENCONTRADO PRA POR EM CADA i, EM ORDEM

        for (int i = 0; i < tamanho - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < tamanho; j++) {
                if (vetor[j] < vetor[minIndex]) {
                    minIndex = j;
                }
                numIteracoes ++;
            }

            // SO TROCA SE NECESSARIO - SE O MENOR NAO ESTIVER JA NA POSICAO CORRETA = MAIS INTELIGENTE
            if (minIndex != i) {
                int temp = vetor[i];
                vetor[i] = vetor[minIndex];
                vetor[minIndex] = temp;
                numTrocas ++;
            }

        }

        System.out.println("Selection Sort realizou ordenacao:");
        for (int valor : vetor) {
            System.out.print(valor + " ");
        }
        System.out.println("Em " + numIteracoes + " passadas\n");
        System.out.println("Em " + numTrocas + " trocas\n");

        return numIteracoes;
    }

}