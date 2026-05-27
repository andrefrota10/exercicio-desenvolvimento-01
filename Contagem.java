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
