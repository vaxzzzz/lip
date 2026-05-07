public class ExemploForEach {

    public static void main(String[] args) {

        int[] meuArrayInt = new int[5];
        boolean[] meuArrayBool = new boolean[5];
        String[] meuArrayStr = new String[5];

        // int[] meuArrayInt = {10, 20, 30, 40, 50};
        // boolean[] meuArrayBool = {true, true, false, true, false};
        // String[] meuArrayStr = {"André", "Roberto", "Silva", "José", "Maria"};

        for (int i : meuArrayInt)
            System.out.print(i + "\t");

        System.out.println();

        for (boolean b : meuArrayBool)
            System.out.print(b + "\t");

        System.out.println();

        for (String s : meuArrayStr)
            System.out.print(s + "\t");
    }
}