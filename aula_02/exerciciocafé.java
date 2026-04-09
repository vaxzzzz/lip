import java.util.Scanner;

public class exerciciocafé {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int opcao;

        // constantes do menu
        final int OP_CAPU = 1;
        final int OP_CAFE_LEITE = 2;
        final int OP_AGUA = 3;
        final int OP_SAIR = 0;

        // recursos da máquina
        double agua = 2000;
        double leite = 1000;
        double cafe = 500;

        // preços
        final double PRECO_CAPU = 3.00;
        final double PRECO_CAFE_LEITE = 2.50;
        final double PRECO_AGUA = 1.00;

        // consumo de cada bebida
        final double AGUA_CAPU = 200;
        final double LEITE_CAPU = 100;
        final double CAFE_CAPU = 50;

        final double AGUA_CAFE_LEITE = 150;
        final double LEITE_CAFE_LEITE = 150;
        final double CAFE_CAFE_LEITE = 50;

        final double AGUA_SO = 300;

        // loop principal
        do {

            System.out.println("\n===== MÁQUINA DE CAFÉ =====");
            System.out.println("1 - Capuccino");
            System.out.println("2 - Café com leite");
            System.out.println("3 - Água");
            System.out.println("0 - Sair");
            System.out.println("===========================");
            System.out.print("Escolha: ");

            opcao = scan.nextInt();

            if (opcao == OP_CAPU) {

                if (agua >= AGUA_CAPU && leite >= LEITE_CAPU && cafe >= CAFE_CAPU) {
                    agua -= AGUA_CAPU;
                    leite -= LEITE_CAPU;
                    cafe -= CAFE_CAPU;

                    System.out.println("Capuccino servido!");
                    System.out.println("Valor: R$ " + PRECO_CAPU);
                } else {
                    System.out.println("Recursos insuficientes para Capuccino!");
                }

            } else if (opcao == OP_CAFE_LEITE) {

                if (agua >= AGUA_CAFE_LEITE && leite >= LEITE_CAFE_LEITE && cafe >= CAFE_CAFE_LEITE) {
                    agua -= AGUA_CAFE_LEITE;
                    leite -= LEITE_CAFE_LEITE;
                    cafe -= CAFE_CAFE_LEITE;

                    System.out.println("Café com leite servido!");
                    System.out.println("Valor: R$ " + PRECO_CAFE_LEITE);
                } else {
                    System.out.println("Recursos insuficientes para Café com leite!");
                }

            } else if (opcao == OP_AGUA) {

                if (agua >= AGUA_SO) {
                    agua -= AGUA_SO;

                    System.out.println("Água servida!");
                    System.out.println("Valor: R$ " + PRECO_AGUA);
                } else {
                    System.out.println("Sem água suficiente!");
                }

            } else if (opcao == OP_SAIR) {
                System.out.println("Encerrando...");
            } else {
                System.out.println("Opção inválida!");
            }

            // mostra recursos restantes (extra pra controle)
            System.out.println("\n--- Recursos restantes ---");
            System.out.println("Água: " + agua);
            System.out.println("Leite: " + leite);
            System.out.println("Café: " + cafe);

        } while (opcao != OP_SAIR);

        scan.close();
    }
}