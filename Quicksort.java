public class Quicksort {

    public static void quicksort(int[] array, int inicio, int fim) {
        if (inicio < fim) {
            int pivoIndex = particionar(array, inicio, fim);
            quicksort(array, inicio, pivoIndex - 1);
            quicksort(array, pivoIndex + 1, fim);
        }
    }

    public static int particionar(int[] array, int inicio, int fim) {
        int pivo = array[fim];
        int i = inicio - 1;

        for (int j = inicio; j < fim; j++) {
            if (array[j] <= pivo) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        int temp = array[i + 1];
        array[i + 1] = array[fim];
        array[fim] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        int[] valores = {5, 3, 8, 1, 2};

        quicksort(valores, 0, valores.length - 1);

        for (int i = 0; i < valores.length; i++) {
            System.out.print(valores[i] + " ");
        }
    }
}
