public class BucketSort {

    public static int bucketSort(int[] arr, int tamanho) {
        int numIter = 0;
        int numTrocas = 0;
        int[] temp_arr = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            temp_arr[i] = arr[i];
        }
        arr = temp_arr;

        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < tamanho; i++) {
            numIter++;
            if (arr[i] < min) {min = arr[i];}
            if (arr[i] > max) {max = arr[i];}
        }

        int numBuckets = tamanho;
        int range;
        if (max - min == 0) {range = max - min + 1;}
        else {range = max - min;}

        // cada "balde" e um array dentro do array "buckets"
        int[][] buckets = new int[numBuckets][tamanho];
        // array de inteiros representando cada balde para guardar 
        // quantidade de valores armazenados em cada balde:
        int[] bucketSizes = new int[numBuckets];

        for (int i = 0; i < tamanho; i++) {
            numIter++;
            // cada elemento arr[i] vai pra um balde proporcional ao seu valor
            // segundo a formula definida abaixo
            int bucketIndex = ((arr[i] - min) * numBuckets) / range;
            if (bucketIndex >= numBuckets) {bucketIndex = numBuckets -1;}
            buckets[bucketIndex][bucketSizes[bucketIndex]] = arr[i];
            bucketSizes[bucketIndex]++;
            numTrocas++;
        }

        //  ordenar cada balde separadamente com Insertion Sort:
        for (int i = 0; i < numBuckets; i++) {
            // usa o vetor de "quants em cada balde" pra descobrir o 
            // tamanho do vetor:
            int size = bucketSizes[i];
            // vamos olhar cada valor no vetor, comecando pelo indice 1
            for (int j = 1; j < size; j++) {
                numIter++;
                int chave = buckets[i][j];
                int k = j - 1;
                // enquanto tem elementos maiores que o valor a esquerda dele,
                // eles vao sendo movidos 1 valor pra esquerda (valor do valor esta guardado
                // na variavel chave)
                // o k vai ir sendo decrementado, se movendo de 1 em 1
                while (k >= 0 && buckets[i][k] > chave) {
                    numIter++;
                    buckets[i][k + 1] = buckets[i][k];
                    numTrocas++;
                    k--;
                }
                // ultimo k é a posicao do elemento menor/igual a chave;
                // por isso reinsere a chave no k + 1
                buckets[i][k + 1] = chave;
            }
        }

        // colocar de volta no array original:
        int index = 0;
        for (int i = 0; i < numBuckets; i++) {
            for (int j = 0; j < bucketSizes[i]; j++) {
                numIter++;
                arr[index] = buckets[i][j];
                index = index + 1;
                numTrocas++;
            }
        }

        System.out.println("Bucket Sort realizou ordenacao:");
        for (int valor : arr) {
            System.out.print(valor + " ");
        }
        System.out.println("Em " + numIter + " passadas\n");
        System.out.println("Em " + numTrocas + " trocas\n");

        return numIter;
    }

}