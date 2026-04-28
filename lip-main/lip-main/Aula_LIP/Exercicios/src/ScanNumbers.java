import java.util.Scanner;

public class ScanNumbers {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu primeiro nome: ");
        String primeironome = scan.next();

        System.out.println("Digite a idade: ");
        int idade = scan.nextInt();

        System.out.println("Digite sua altura: ");
        Double altura = scan.nextDouble();




        System.out.println("Seu nome é" + primeironome + " e Sua idade é "+ idade + " e sua altura é " + altura + " metros");



        scan.close();
    }
}
