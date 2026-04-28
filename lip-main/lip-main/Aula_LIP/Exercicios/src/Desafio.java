import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         System.out.println("Digite a quantidade de Jogos ");
        int x = scan.nextInt();
 
        System.out.println("Quantidade de Jogos "+ x);
        for(int y = 0; y < x; y++) {
             
            System.out.print("Jogo" + (y + 1 ) + ":");
            
            for (int linha = 0;  linha < 6; linha++  ) {

                    int numero =  (int) (Math.random() * 61);

                    System.out.print (numero+ " ");
                   
            } 
            
            System.out.println();
            
        }
       
    }
}