import java.util.Scanner;

public class ImparPar {
    public static void main(String[] args) {
        //puxa o scanner
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        // numero q preisa para o calculo
        int numero = scan.nextInt();

        if(numero == 0) {
            System.out.println("Zero");
        }
        // se numero dividido por  2 resta zero ele é par 
        else if (numero % 2 == 0  ) {
            System.out.println("par");
        }
        else {
            System.out.println("impar");
        }
    }
}
