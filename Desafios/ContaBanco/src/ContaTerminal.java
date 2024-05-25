import java.util.Scanner;

public class ContaTerminal {

    public static void main (String [] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            
            System.out.println("Por favor, digite o número da sua Conta:");
            int numero = scanner.nextInt();

            System.out.println("Por favor, digite o número da sua Agência:");
            String agencia = scanner.next();

            scanner.nextLine();
            
            System.out.println("Por favor, digite seu nome completo");
            String nomeCliente = scanner.next();

            System.out.println("Por favor, digite o saldo da Conta:");
            double saldo = scanner.nextDouble();

            System.err.println("");

            System.out.println ("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco,");
            System.out.println ("sua agência é " + agencia + ", conta " + numero + ", saldo disponivel é de R$" + saldo + " e já está se encontra disponível para uso");               
        
    }
 }

}
