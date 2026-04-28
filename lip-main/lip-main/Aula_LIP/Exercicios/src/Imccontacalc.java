import java.util.Scanner;

public class Imccontacalc {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Digita o valor");
        double imc;
        double kg = scan.nextDouble();
        double altura = scan.nextDouble();

         imc = kg / (altura * altura) ;


        if (imc > 25.0) {
            System.out.println("Sobrepeso " + imc);
        }
        else if (imc >= 18.5 || imc <= 24.9  )
            System.out.println("Peso normal " + imc);
        else {
            System.out.println("Abaixo "+ imc);
        }
    
    
    }
}
