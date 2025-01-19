import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Insira o numero da Conta: ");
    int numeroConta = scanner.nextInt();

    System.out.println("Insira o numero da agencia: ");
    String agencia = scanner.nextLine();

    System.out.println("Insira o nome do cliente:");
    String nomeClinete = scanner.nextLine();

    System.out.println("Insira o saldo inicial da conta: ");
    double saldoConta = scanner.nextDouble();

    System.out.println("Olá "+ nomeClinete + "obrigado por criar uma conta em nosso banco, sua agência é " + agencia +", conta" + numeroConta + " e seu saldo " + saldoConta + " já está disponível para saque");

scanner.close();

    }
}
