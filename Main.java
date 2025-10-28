public class Main {

    public static final int TAMANHO_VETORES = 20;

    public static void main(String[] args) {

        int[] vetorTeste1 = {12, 18, 9, 25, 17, 31, 22, 27, 16, 13, 19, 23, 20, 30, 14, 11, 15, 24, 26, 28};
        int[] vetorTeste2 =  {5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32};
        int[] vetorTeste3 = {99, 85, 73, 60, 50, 40, 35, 30, 25, 20, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6};

        System.out.println("####### INICIANDO TESTES #########\n");

        System.out.println("Testes com vetor 1:");
        BubbleSort.bubbleSortParada(vetorTeste1, TAMANHO_VETORES);
        SelectionSort.selectionSort(vetorTeste1, TAMANHO_VETORES);
        CocktailSort.cocktailSort(vetorTeste1, TAMANHO_VETORES);
        CombSort.combSort(vetorTeste1, TAMANHO_VETORES);
        GnomeSort.gnomeSort(vetorTeste1, TAMANHO_VETORES);
        BucketSort.bucketSort(vetorTeste1, TAMANHO_VETORES);
        System.out.println("\n\n");

        System.out.println("Testes com vetor 2:");
        BubbleSort.bubbleSortParada(vetorTeste2, TAMANHO_VETORES);
        SelectionSort.selectionSort(vetorTeste2, TAMANHO_VETORES);
        CocktailSort.cocktailSort(vetorTeste2, TAMANHO_VETORES);
        CombSort.combSort(vetorTeste2, TAMANHO_VETORES);
        GnomeSort.gnomeSort(vetorTeste2, TAMANHO_VETORES);
        BucketSort.bucketSort(vetorTeste2, TAMANHO_VETORES);
        System.out.println("\n\n");

        System.out.println("Testes com vetor 3:");
        BubbleSort.bubbleSortParada(vetorTeste3, TAMANHO_VETORES);
        SelectionSort.selectionSort(vetorTeste3, TAMANHO_VETORES);
        CocktailSort.cocktailSort(vetorTeste3, TAMANHO_VETORES);
        CombSort.combSort(vetorTeste3, TAMANHO_VETORES);
        GnomeSort.gnomeSort(vetorTeste3, TAMANHO_VETORES);
        BucketSort.bucketSort(vetorTeste3, TAMANHO_VETORES);
        System.out.println("\n\n");

    }

}