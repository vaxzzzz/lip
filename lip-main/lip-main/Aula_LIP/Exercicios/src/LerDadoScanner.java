import java.util.Scanner;

public class LerDadoScanner {
    public static void main(String[] args) {
        //Classe Scanner Criada
        Scanner scan = new Scanner(System.in);
        //Pedindo para o user digitar
        System.out.print("Digite seu nome: ");
        //Cria a variavel com o scanner
        String nome = scan.nextLine();
        //print o nome do scan e textos
        System.out.println("Olá " + nome +" Seja Bem Vindo!");

        scan.close();
    }
}