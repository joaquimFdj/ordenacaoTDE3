public class BubbleSort {

    // recebera vetor e o tamanho do vetor.
    public static int bubbleSortInocent(int[] vetor, int tamanho) {
        int vizualizar_num_iteracoes = 0;
        int[] temp_arr = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            temp_arr[i] = vetor[i];
        }
        vetor = temp_arr;

        // apenas declara a variavel temporaria usada no processo de inverter um par (pra nao perder variavel):
        int temp = 0;
        // for para iterar um numero de vezes do tamanho do array
        // sem criterio de parada ele vai sempre fazer todas as iteracoes (tamanho do array)
        for (int i = 0; i < tamanho; i++) {
            vizualizar_num_iteracoes ++;
            // j TA SENDO DECLARADO COMO 1 APENAS PORQUE: VAMOS USAR ELE E UMA DO LADO DELE, NO CASO, 
            // VAMOS FAZER j - 1 PRA PEGAR A DO LADO (ao inves de j + 1, dai j teria que ser declarado 0).
            // DAI, NESSE LOOP FOR, QUEREMOS ITERAR, PORTANTO, AS VARIAVEIS NAS POSICOES j, j - 1, O NUMERO
            // DE VEZES QUE VAI ITERAR É O TAMANHO DO ARRAY, DEPOIS O TAMANHO DO ARRAY - 1, DEPOIS O TAMANHO DO ARRAY
            // - 2, DEPOIS O TAMANHO DO ARRAY - 3... POR QUE É BUBBLE SORT: O FINAL VAI FICANDO ORDENADO: O MAIOR 
            // "BORBULHA" ATE O FINAL. DAI TEMOS QUE OLHAR O SEGUNDO MAIOR, QUE DAI É ESSE QUE BORBULHA ATE O FINAL...
            // nota: se j começasse como 0, teria que ser 'enquanto j < (tamanho - i - 1), por que dai usa +1 pra pega a do lado do j'
            for (int j = 1; j < (tamanho - i); j++) {
                vizualizar_num_iteracoes ++;
                if (vetor[j - 1] > vetor[j]) {
                    // se é maior, inverte a ordem no vetor dos elementos desse par.
                    // note que unico if é suficiente, por que se nao for atendido, eh 
                    // por que o par ja esta ordenado.

                    temp = vetor[j - 1];
                    vetor[j - 1] = vetor[j];
                    vetor[j] = temp;
                    
                }

            }

        }

        System.out.println("Bubble sort inocent realizou ordenacao:");
        for (int valor : vetor) {
            System.out.print(valor + " ");
        }
        System.out.println("Em " + vizualizar_num_iteracoes + " passadas\n");
        
        return vizualizar_num_iteracoes;
    }

    public static int bubbleSortLessInocent(int[] vetor, int tamanho) {
        int vizualizar_num_iteracoes = 0;
        int[] temp_arr = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            temp_arr[i] = vetor[i];
        }
        vetor = temp_arr;

        int temp;
        // i < que tamanho do vetor - 1 porque na ultima passada o loop interno nao executa:
        // quando i = tamanho - 1, a diferenca é um; nao passa da verificacao no loop interno.
        // e pra ser assim mesmo, ja que no bubble sort, na passada tamanho - 1, o vetor sempre ja ta ordenado:
        // >>> NA PASSADA tamanho - 2, o ultimo par de elementos desordenaveis e comparado e ordenado.
        // coloca dai na condicao do loop externo (tamanho - 1) assim ele ja para nessa hora sem nem executar:
        // mais performatico.
        for (int i = 0; i < (tamanho - 1); i++) {
            vizualizar_num_iteracoes ++;
            for (int j = 1; j < (tamanho - i); j++) {
                vizualizar_num_iteracoes ++;
                if (vetor[j - 1] > vetor[j]) {
                    temp = vetor[j - 1];
                    vetor[j - 1] = vetor[j];
                    vetor[j] = temp;
                }
            }

        }

        System.out.println("Bubble sort less inocent realizou ordenacao:");
        for (int valor : vetor) {
            System.out.print(valor + " ");
        }
        System.out.println("Em " + vizualizar_num_iteracoes + " passadas\n");

        return vizualizar_num_iteracoes;
    }

    public static int bubbleSortParada(int[] arr, int tamanho) {
        int vizualizar_num_iteracoes = 0;
        int numTrocas = 0;
        int[] temp_arr = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            temp_arr[i] = arr[i];
        }
        arr = temp_arr;

        boolean trocou = true;
        int contador = 0;
        int temp = 0;
        while (trocou && contador < (tamanho - 1)) {
            vizualizar_num_iteracoes ++;
            trocou = false;
            for (int i = 1; i < (tamanho - contador); i++) {
                vizualizar_num_iteracoes ++;
                if (arr[i - 1] > arr[i]) {
                    trocou = true;
                    numTrocas++;
                    temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                }
            }

            contador ++;
        }

        System.out.println("Bubble sort com parada realizou ordenacao:");
        for (int valor : arr) {
            System.out.print(valor + " ");
        }
        System.out.println("Em " + vizualizar_num_iteracoes + " passadas\n");
        System.out.println("Em " + numTrocas + " trocas\n");

        return vizualizar_num_iteracoes;
    }

} 