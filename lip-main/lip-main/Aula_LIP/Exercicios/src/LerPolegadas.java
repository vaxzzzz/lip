import java.util.Scanner;

public class LerPolegadas {
    public static void main(String[] args) {
        //cria variavel da conta
        double conversao;

        System.out.println("Digite as polegadas! ");
        //puxa o scanner na classe 
        Scanner scan = new Scanner(System.in);
        //cria a variavel com o scanner
        double polegadas = scan.nextDouble();
        //conta de conversao
        conversao = polegadas * 2.54;

        System.out.println("A conversao é "+conversao);

    }
}
