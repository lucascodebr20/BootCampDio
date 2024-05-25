
import java.util.Scanner;


public class ForSimples {

    public static void main(String[] args) {

        
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Digite um numero:");
            int numeroCadastrado = scanner.nextInt();
            System.out.println("");

            for (int i = 1; i <= numeroCadastrado; numeroCadastrado--) {

                    if (numeroCadastrado % 2 == 0) {
                        
                    } else {
                        System.out.println("O " + numeroCadastrado + " é impar !");
                    }
             }   
        }
    }

}
