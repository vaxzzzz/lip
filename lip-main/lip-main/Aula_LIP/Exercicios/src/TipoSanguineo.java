import java.util.Scanner;

public class TipoSanguineo {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu tipo sanguíneo");

        String tipo = scan.next();
        System.out.println("Agora Digite o se é + ou - :");
        String rh = scan.next();

        if (tipo.equals("A")  && rh.equals("+")) {
            System.out.println("Sangue é A+");
        }
        else if (tipo.equals("B") && rh.equals("+")) {
            System.out.println("B+");
        }

    }
}
