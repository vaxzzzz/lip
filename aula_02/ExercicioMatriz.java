public class ExercicioMatriz {
    public static void main(String[] args) {
        int[][] tabela = new int [3][3];

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                tabela [i][j] = (int) (Math.random() * 10);
            }
        }

        //EX1

        for(int i = 0; i < 3; i++){
            System.out.print("| ");
            for(int j = 0; j < 3; j++){
                    System.out.print( tabela[i][j] +" | ");
            }
            System.out.println("");
        }

        System.out.println("");

        //EX2
        for(int i = 0; i < 3; i++){
            System.out.print("| ");
            for(int j = 0; j < 3; j++){
                if (j == i){
                    System.out.print( tabela[i][j] +" | ");
                } else{
                    System.out.print("  | ");
                }
            }
            System.out.println("");
        }

        //EX3
        
        //1*5*9 + 2*6*7 + 3*4*8 - (7*5*3 + 8*6*1 + 9*4*2)
        int calculo = 
        (((tabela[0][0] * tabela[1][1] * tabela[2][2]) + 
        (tabela[0][1] * tabela[1][2] * tabela[2][0]) +
        (tabela[0][2] * tabela[1][0] * tabela[2][1])) 
        -
        ((tabela[2][0] * tabela[1][1] * tabela[0][2]) + 
        (tabela[2][1] * tabela[1][2] * tabela[0][0]) +
        (tabela[2][2] * tabela[1][0] * tabela[0][1])));
        
        System.out.println("");
        System.out.println("O cálculo do determinante da matriz é ígual á " + calculo);
    }
}