public class matriz {

    public static void main(String[] args) {

        int[][] tabela = new int[3][4];

        // preencher matriz
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 4; j++) {
                tabela[i][j] = (int)(Math.random() * 100);
            }
        }

        // mostrar matriz
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 4; j++) {
                System.out.print(tabela[i][j] + " | ");
            }

            System.out.println();
        }
    }
}