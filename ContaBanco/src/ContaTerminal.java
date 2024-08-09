import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception{
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero da sua conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o número da sua agência no formato XXX-X: ");
        String numeroAgencia = scanner.nextLine();

        System.out.println("Digite o seu nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o saldo da sua conta: ");
        double saldoConta = scanner.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua conta é %d, agência %s. %n",nomeCliente,numeroConta, numeroAgencia);
        System.out.printf("O seu saldo de %.2f já esta disponivel para saque %n",saldoConta); 

        scanner.close();
    }
}
