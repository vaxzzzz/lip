import java.util.Scanner;

public class ForAninhado {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o eixo Y");
        int y = scan.nextInt();
        System.out.println("Digite o eixo X");
        int x = scan.nextInt();

        for(int linha = 0; linha < y; linha++) {
            for(int coluna = 0; coluna < x; coluna++) {

                if(linha == 0 || linha == y - 1 || coluna == 0 || coluna == x - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}