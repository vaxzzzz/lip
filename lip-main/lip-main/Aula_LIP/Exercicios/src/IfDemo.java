public class IfDemo {
    public static void main(String[] args) {
        int a = 4;
        int b = 56;
        int c;

        // Comparação entre A e B
        if (a < b)
            System.out.println("A é menor q B");

        // Comparação entre A e B
        else if (a == b)
            System.out.println("A é igual a B");
        // System.out.println(); O "ln" serve para pular linha.

        c = a - b;
        System.out.println("o valor de c é " + c);

        if (c >= 0)
            System.out.println("C é Positivo");
        else if (c < 0)
            System.out.println("C é Negativo");

    }

}