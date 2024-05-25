import java.util.Scanner;

public class ValidarLogin {

        public static void main(String[] args) {
        
            try (Scanner scanner = new Scanner(System.in)) {
            boolean validador = false;

            while (validador == true) {

                System.out.println("Digite o seu login:");
                String login = scanner.next();
                System.out.println("Digite a sua senha:");
                String senha = scanner.next();

                if ("admin".equals(login) && "senha123".equals(senha)) { 
                    validador = true;
                    System.out.println("Login Feito com Sucesso!");
                }

                System.out.println("Login ou Senha estão incorretos!");
            }
        }
    }

}