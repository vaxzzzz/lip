import java.util.Scanner;

public class NotaPonderada {
    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     double calculo;
     System.out.println("Digite a primeira nota: ");
     double nota1 = scan.nextDouble();
      System.out.println("Digite a segunda nota: ");
     double nota2 = scan.nextDouble();
      System.out.println("Digite a terceira nota: ");
     double nota3 = scan.nextDouble();

     calculo = (nota1 + (nota2 * 3) + (nota3 * 5)) / 9;

    System.out.println("Calculo: " + calculo);

    System.out.println("Cara digita também o seu número de faltas: ");
    int faltas = scan.nextInt();
    System.out.println("Digite o tanto de aulas da unidade curricular");
    int aulas = scan.nextInt();


    if (aulas > faltas * 0.25 &&  calculo > 50) {
        System.out.println("Aprovado");
    } else {
        System.out.println("Reprovado");
    }
    }
}
