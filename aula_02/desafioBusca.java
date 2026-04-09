import java.util.Scanner;

public class desafioBusca {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] array = new int[10];
        int numeroSorteado = scan.nextInt();
        for (int i = 0; i < array.length; i++) {
            int numeroAleatorio = (int) (Math.random() * 100);
            array[i] = numeroAleatorio;
            System.out.println("o numero aleatorio é: " + array[i]);
            if (numeroSorteado == array[i]) {
                System.out.println("Encontrado !!");
                return;
            }
        }
          System.out.println("Não encontrado");
    }
}
