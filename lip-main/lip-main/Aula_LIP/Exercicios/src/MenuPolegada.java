import java.util.Scanner;

public class MenuPolegada {
    public static void main(String[] args) {
        double conta;
        Scanner scan = new Scanner(System.in);
        System.out.println("==========================================================");
        System.out.println("1 para Polegadas -> Centimetros");
        System.out.println("2 para Centimetros -> Polegadas");
        System.out.println("==========================================================");
        System.out.println("Escolha uma Opção");
        int numero = scan.nextInt() ;

        if (numero == 1) {
            System.out.println("Transformando polegadas para centimetros");
            double polegada = scan.nextDouble();
            conta = polegada * 2.54;
            System.out.println("Centimetros: " +conta);

        } else if (numero == 2) {
            System.out.println("Transformando Centimetros para Polegadas");
            double centimetros = scan.nextDouble();
            conta = centimetros / 2.54;
            System.out.printf("Polegadas: %.6f%n", conta);
        }

        
    }
}
