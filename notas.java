import java.util.Scanner;

public class notas {
public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
    Float nota1, nota2, nota3, nota4;
    System.out.println("Qual a nota do primeiro bimestre?");
    nota1 = scanner.nextFloat();
    System.out.println("Qual a nota do segundo bimestre?");
      nota2 = scanner.nextFloat();
     System.out.println("Qual a nota do terceiro bimestre?");
       nota3 = scanner.nextFloat();
    System.out.println("Qual a nota do quarto bimestre?");
      nota4 = scanner.nextFloat();
      System.out.println("a média será: " + ((nota1 + nota2 + nota3 + nota4)/4) + " pontos.");
}
}
