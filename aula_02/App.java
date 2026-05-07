import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);
        
        final int TAMANHO = 100;        
        int[] numeros = new int[TAMANHO];
        
        for (int i = 0; i < TAMANHO; i++){
            numeros[i] = (int)(Math.random() * 1000.0);
        }

        System.out.print("Digite um número inteiro entre 0 e 999: ");
        int palpite = scan.nextInt();

        // Ordena o vetor com algoritmo Bubble Sort
        for (int i = 0; i < TAMANHO; i++){
            for (int j = 0; j < TAMANHO - 1; j++){
                if (numeros[j] > numeros[j+1]){
                    int aux = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = aux;
                }
            }
        }

        for (int i = 0; i < TAMANHO; i ++){
            System.out.println(numeros[i]);
        }

        // Busca com algoritmo Busca Binária
        int esquerda = 0;
        int direita = TAMANHO - 1;
        int meio = (direita + esquerda) / 2;

        while(true){
            if (numeros[meio] == palpite){
                System.out.println("Encontrado!");
                break;
            }
            if (direita <= esquerda){
                System.out.println("Não encontrado!");
                break;
            }
            if (palpite > numeros[meio]){
                esquerda = meio + 1;                
            }
            else{
                direita = meio - 1;
            }
            meio = (direita + esquerda) / 2;
        }
        scan.close();
    }
}
