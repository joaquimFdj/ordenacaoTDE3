public class CombSort {

    public static int combSort(int[] arr, int tamanho) {
        int numIter = 0;
        int numTrocas = 0;
        int[] temp_arr = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            temp_arr[i] = arr[i];
        }
        arr = temp_arr;

        int gap = tamanho;
        boolean trocou = true;

        // CONDICAO DO WHILE E OR PRA GARANTIR QUE:
        // CONTINUA ENQUANTO ESTA NA FASE COMB SORT
        // (enquanto gap > 1 precisa continuar rodando,
        // reduzindo o gap, fazendo Comb Sort, garantindo que passe
        // por todas as fases - gap grande, medio, pequeno, 1!)
        // E CONTINUE ENQUANTO AINDA A TROCAS ACONTECENDO (
        // fase Bubble Sort!)
        while (gap > 1 || trocou) {

            // A LINGUAGEM JAVA ELIMINA AQUI AUTOMATICAMENTE A PARTE DECIMAL;
            // ASSIM TEMOS SEMPRE UM INDICE NO ARRAY
            // NOTE QUE ELE ESTA SE SOBRESCREVENDO AO LONGO DAS ITERACOES, 
            // POR ISSO VAI DIMINUINDO ATE CHEGAR EM 1!
            gap = (gap * 10) / 13;

            // GAP PODE RESULTAR EM 0 POREM. NESSE CASO, PASSAMOS PARA 1
            if (gap < 1) {
                gap = 1;
            }

            // DIFERENTE DO BUBBLE SORT, O  MAIOR DE TODOS NAO BORBULHA A CADA PASSADA;
            // O QUE ACONTECE E QUE: QUANDO O GAP E GRANDE, NAS PRIMEIRAS PASSADAS,
            // ELE MOVE VALORES DESLOCADOS PRO COMECO DO ARRAY JA (ELIMINA OS QUE DEMORAM A 
            // CHEGAR NO COMECO NO BUBBLE SORT) - CONFORME O GAP DIMINUE ELE PASSA POR MAIS E
            // MAIS ELEMENTOS ATE, QUANDO O GAP E 1, ELE CONTINUA ATE trocado = false - fazendo
            // dai um Bubble Sort completo que garante que esta ordenado.
            trocou = false;
            for (int i = 0; i + gap < tamanho; i++) {
                numIter++;
                if (arr[i] > arr[i + gap]) {

                    int temp = arr[i];
                    arr[i] = arr[i + gap];
                    arr[i + gap] = temp;

                    numTrocas ++;
                    trocou = true;

                }
            }

        }

        System.out.println("Comb Sort realizou ordenacao:");
        for (int valor : arr) {
            System.out.print(valor + " ");
        }
        System.out.println("Em " + numIter + " passadas\n");
        System.out.println("Em " + numTrocas + " trocas\n");

        return numIter;
    }

}