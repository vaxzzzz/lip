public class BubbleSort {
    public static void main(String[] args) {

        int[] numeros = {6, 3, 2, 9, };

        for (int i = 1; i < numeros.length; i++) {

            int valorAtual = numeros[i];
            int j = i - 1;

            while (j >= 0 && numeros[j] > valorAtual) {
                numeros[j + 1] = numeros[j];
                j--;
            }

            numeros[j + 1] = valorAtual;
        }

        
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
    }
}