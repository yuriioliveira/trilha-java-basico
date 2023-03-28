import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner sc = new Scanner(System.in);

        System.out.print("Qual é o seu nome? ");
        nomeCliente = sc.nextLine();

        System.out.println("Por favor, informe a agência da sua conta. ");
        agencia = sc.nextLine();

        System.out.println("Por favor, informe o número da sua conta. ");
        numeroConta = sc.nextInt();

        System.out.println("Por favor, informe o saldo da sua conta. ");
        saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");

        sc.close();
    }
}
