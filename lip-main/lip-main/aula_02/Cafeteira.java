import java.util.Scanner;

public class Cafeteira {
    public static void main(String[] args) {
        final int EXPRESSO = 1;
        final int CAPUCCINO = 2;
        final int PINGADO = 3;
        final int MAX_CAFE = 300; // gramas
        final int MAX_AGUA = 700; // ml
        final int MAX_LEITE = 500; // ml
        final double VALOR_EXPRESSO = 4.50;
        final double VALOR_CAPUCCINO = 7.50;
        final double VALOR_PINGADO = 3.00;

        int agua = MAX_AGUA;
        int cafe = MAX_CAFE;
        int leite = MAX_LEITE;

        Scanner scan = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("===============================");
            System.out.println("1. Expresso");
            System.out.println("2. Capuccino");
            System.out.println("3. Pingado");
            System.out.println("===============================");
            System.out.print("Digite uma opção: ");
            opcao = scan.nextInt();
            switch(opcao){
                case EXPRESSO:
                    if(agua >= 50 && cafe >= 30){
                        agua -= 50;
                        cafe -= 30;
                        System.out.println("Valor final R$ " + VALOR_EXPRESSO);
                        System.out.println("Aproveite sua bebida!");
                    }
                    else{
                        System.out.println("Falta de insumos!");
                    }
                break;
                case CAPUCCINO:
                    if(agua >= 150 && cafe >= 50 && leite >= 150){
                        agua -= 150;
                        cafe -= 50;
                        leite -= 150;
                        System.out.println("Valor final R$ " + VALOR_CAPUCCINO);
                        System.out.println("Aproveite sua bebida!");
                    }
                    else{
                        System.out.println("Falta de insumos!");
                    }
                break;
                case PINGADO:
                    if(agua >= 50 && cafe >= 10 && leite >= 150){
                        agua -= 50;
                        cafe -= 10;
                        leite -= 150;
                        System.out.println("Valor final R$ " + VALOR_PINGADO);
                        System.out.println("Aproveite sua bebida!");
                    }
                    else{
                        System.out.println("Falta de insumos!");
                    }
                break;
                default:
                    if (opcao != 0) System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
        scan.close();
    }
}
