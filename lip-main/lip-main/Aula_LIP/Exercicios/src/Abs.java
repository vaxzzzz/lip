import java.util.Scanner;

public class Abs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Tentem adivinhar o número");
        int numeroAdivinha = scan.nextInt();

     
        int numero =  (int) (Math.random() * 11);

        if (numeroAdivinha == numero) {
            System.out.println("Acertou miseravi. Era: " + numero);
        } else {
            System.out.println("Errou newba era: "+ numero);
        }

    }
}
