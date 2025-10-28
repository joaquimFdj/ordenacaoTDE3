public class GnomeSort {

    public static int gnomeSort(int[] arr, int tamanho) {
        int numIter = 0;
        int numTrocas = 0;
        int[] temp_arr = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            temp_arr[i] = arr[i];
        }
        arr = temp_arr;

        int indexador = 0;
        while (indexador < tamanho) {
            numIter++;
            if (indexador <= 0 || arr[indexador - 1] <= arr[indexador]) {
                indexador++;
            } else {
                    int temp = arr[indexador - 1];
                    arr[indexador - 1] = arr[indexador];
                    arr[indexador] = temp;
                    numTrocas++;

                    indexador--;
            }
 
        }

        System.out.println("Gnome Sort realizou ordenacao:");
        for (int valor : arr) {
            System.out.print(valor + " ");
        }
        System.out.println("Em " + numIter + " passadas\n");
        System.out.println("Em " + numTrocas + " trocas\n");

        return numIter;
    }
    
}