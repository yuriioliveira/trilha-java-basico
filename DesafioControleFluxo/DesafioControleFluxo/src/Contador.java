import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();
        int contador = 1;

        try {
            contar(parametroUm, parametroDois, contador);
        } catch (ParametrosInvalidosException ex) {
            System.out.println(ex.getMessage());
        }

        terminal.close();
    }

    static void contar(int parametroUm, int parametroDois, int contador) throws ParametrosInvalidosException {
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        } else {
            for (int i = parametroUm; i < parametroDois; i++) {
                System.out.println("Imprimindo o número " + contador);
                contador++;
            }
        }

    }
}
