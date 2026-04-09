import java.util.Scanner;

public class atividade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetorNumeros = new int[10];
        
        // carrega o vetor com os números digitados
        for (int i = 0; i < 10; i++){
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vetorNumeros[i] = scan.nextInt();
        }

        // apresenta o vetor desordenado
        for (int i = 0; i < 10; i++){
            System.out.print(" | " + vetorNumeros[i]);            
        }
        System.out.println();

        // ordenação do vetor com algoritmo Bubble Sort
        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 9; j++){
                if (vetorNumeros[j] > vetorNumeros[j+1]){
                    int aux = vetorNumeros[j];
                    vetorNumeros[j] = vetorNumeros[j+1];
                    vetorNumeros[j+1] = aux;
                }
            }
        }

        // apresenta o vetor ordenado
        for (int i = 0; i < 10; i++){
            System.out.print(" | " + vetorNumeros[i]);            
        }
        System.out.println();

        scan.close();
    }
}

