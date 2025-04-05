
import java.util.Scanner;

public class ContaTerminal{
    int numero;
    String agencia;
    String nomeCliente;

    public static void main(String[] args) {
        double saldo = 237.48;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor digite o numero da sua conta");
        int numero = scanner.nextInt();

        System.out.println("Por Favor digite o numero de sua agência");
        String agencia = scanner.next();

        System.out.println("Por Favor digite o seu nome");
        String nomeCliente = scanner.next();

        System.out.println("Seu saldo é: "+saldo);

        System.out.println("Olá "+nomeCliente+ ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já esta disponível para saque");
    }
}