import java.util.Scanner;

public class calculos {
public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
    Float numero1, numero2;
    System.out.println("Insira dois números:");
    numero1 = scanner.nextFloat();
    numero2 = scanner.nextFloat();
    System.out.println("Soma: " + (numero1 + numero2) + ".\nSubtração: " + (numero1 - numero2) + ".\nMultiplicação: " + (numero1 * numero2) + ".");
}
}