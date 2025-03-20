import java.util.Scanner;

public class Gasolina {
public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
    Float valor, litro;
    System.out.println("Quanto custa o valor do litro da gasolina?");
    valor = scanner.nextFloat();
    System.out.println("quantos litros foi vendido ao cliente?");
    litro = scanner.nextFloat();
    System.out.println("O valor total gasto é de: " + (valor * litro) + ".");
}
}