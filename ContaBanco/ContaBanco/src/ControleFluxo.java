import java.text.DecimalFormat;
import java.util.Scanner;

public class ControleFluxo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double saldo = 25.52;
        double saque;
        double novoSaldo;
        String querNegativar;
        String aceitouNegativar = "sim";

        System.out.println("Informe o valor do saque. ");
        saque = sc.nextDouble();

        if (saque <= saldo) {

            novoSaldo = saldo - saque;
            saldo = novoSaldo;
            System.out.println("seu saldo é " + new DecimalFormat("#,##0.00").format(saldo));

        } else if (saque > saldo) {

            Scanner sc1 = new Scanner(System.in);
            System.out.println("Você ficará com o saldo negativo, quer continuar? ");
            querNegativar = sc1.nextLine();

            if (querNegativar.equals(aceitouNegativar)) {
                novoSaldo = saldo - saque;
                saldo = novoSaldo;
                sc1.close();
                System.out.println("seu saldo é " + new DecimalFormat("#,##0.00").format(saldo));
            } else {
                System.out.println("Não foi negativado, saque não realizado!");
            }

        } else {
            System.out.println("Saldo indisponível");
        }

        sc.close();
    }
}