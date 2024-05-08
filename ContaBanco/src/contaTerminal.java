import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("qual seu numero do banco?");
        numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("qual o numero da sua agencia?");
        agencia = scanner.nextLine();

        System.out.println("qual o seu nome?");
        nomeCliente = scanner.nextLine();

        System.out.println("qual o seu saldo do banco?");
        saldo = scanner.nextDouble();

        System.out.println("""
                ###############################################################
                obrigado por se cadastrar no nosso banco.
                
                sua conta é:
     
                nome: %s
                agencia: %s
                numero da conta: %s
                saldo: %f
                ################################################################
                """.formatted(nomeCliente,agencia,numero,saldo));
    }
}