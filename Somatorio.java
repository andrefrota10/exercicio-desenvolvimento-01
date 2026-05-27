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
