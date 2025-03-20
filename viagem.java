import java.util.Scanner;

public class viagem {
public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
    Float alemanha, portugal, italia, turista;
    System.out.println("Insira o valor das três viagens:");
    alemanha = scanner.nextFloat();
    portugal = scanner.nextFloat();
    italia = scanner.nextFloat();
    System.out.println("Quantos turistas são?");
    turista = scanner.nextFloat();
    System.out.println("Com " + (turista) + " turistas, a viagem sairá por: " + (turista *(alemanha + portugal + italia)) + ".");
}
}