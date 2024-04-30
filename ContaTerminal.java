import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        Conta conta = new Conta();
        conta.setConta(scanner.nextInt());
        conta.setAgencia(scanner.nextLine());
        conta.setNome(scanner.nextLine());
        conta.setSaldo(scanner.nextDouble());

        scanner.close();
    }
}
