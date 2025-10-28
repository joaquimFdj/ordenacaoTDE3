public class CocktailSort {

    public static int cocktailSort(int[] arr, int tamanho) {
        int numIter = 0;
        int numTrocas = 0;
        int[] temp_arr = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            temp_arr[i] = arr[i];
        }
        arr = temp_arr;

        boolean trocou = true;
        int inicio = 0;
        int fim = tamanho - 1;
        int temp;
        while (trocou) {

            trocou = false;
            for (int i = inicio; i < fim; i++) {
                numIter++;
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    trocou = true;
                    numTrocas++;
                }
            }
            fim--;

            if (!trocou) {
                break;
            }

            trocou = false;
            for (int j = fim; j > inicio; j--) {
                numIter++;
                if (arr[j] < arr[j - 1]) { 
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    trocou = true;
                    numTrocas++;
                }
            }
            inicio++;

        }

        System.out.println("Cocktail Sort realizou ordenacao:");
        for (int valor : arr) {
            System.out.print(valor + " ");
        }
        System.out.println("Em " + numIter + " passadas\n");
        System.out.println("Em " + numTrocas + " trocas\n");

        return numIter;
    }

}