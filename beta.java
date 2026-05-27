public class Primo {

    public static boolean ehPrimo(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(ehPrimo(7)); 
    }
}


public class Somatorio {

    public static int somatorio(int[] numeros) {
        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            soma = soma + numeros[i];
        }

        return soma;
    }

    public static void main(String[] args) {
        int[] valores = {1, 2, 3, 4};
        System.out.println(somatorio(valores)); 
    }
}


public class Fibonacci {

    public static int fibonacci(int n) {
        int a = 0;
        int b = 1;

        if (n == 0) return 0;
        if (n == 1) return 1;

        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }

        return b;
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(7)); 
    }
}


public class MDC {

    public static int mdc(int a, int b) {
        while (b != 0) {
            int resto = a % b;
            a = b;
            b = resto;
        }

        return a;
    }

    public static void main(String[] args) {
        System.out.println(mdc(12, 18)); 
    }
}


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


public class Contagem {

    public static int contagem(int[] numeros, int N) {
        int primeiro = numeros[0];
        int contador = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] >= primeiro && numeros[i] <= N) {
                contador++;
            }
        }

        return contador;
    }

    public static void main(String[] args) {
        int[] valores = {3, 5, 7, 2, 9, 4};
        System.out.println(contagem(valores, 7));
    }
} 