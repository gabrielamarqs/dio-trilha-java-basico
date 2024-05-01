package bancoTerminal;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        Conta conta = new Conta();

        System.out.println("Por favor, digite o seu nome !");
        conta.setNome(scanner.nextLine());
        System.out.println("Por favor, digite o número da Agência !");
        conta.setAgencia(scanner.nextLine());
        System.out.println("Por favor, digite o número da Conta !");
        conta.setConta(scanner.nextInt());
        System.out.println("Por favor, informe o saldo !");
        conta.setSaldo(scanner.nextDouble());

        System.out.println("Olá "+ conta.getNome() +", obrigado por criar uma conta em nosso banco, sua agência é "+conta.getAgencia()+", conta "+conta.getConta()+" e seu saldo "+conta.getSaldo()+" já está disponível para saque");

        scanner.close();
    }
}
