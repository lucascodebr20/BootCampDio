
import java.util.InputMismatchException;
import java.util.Scanner;

class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String message) {
        super(message);
    }
}

public class contador {
    
       public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Digite um numero: ");
            int primeiroParametro = scanner.nextInt();
            System.out.println("Digite um valor maior que o primeiro numero: ");
            int segundoParametro = scanner.nextInt();
            
            int numeroValidado;
            
            if (segundoParametro > primeiroParametro) {
                numeroValidado = segundoParametro - primeiroParametro;
            } else {
                throw new ParametrosInvalidosException("O segundo número deve ser maior que o primeiro.");
            }

            Contador(numeroValidado);

        } catch (ParametrosInvalidosException  e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException  e) {
            System.out.println("Digite apenas numeros inteiros");
        }
    }

    static void Contador (int numerodeLoop) {

        for (int i = 1; i <= numerodeLoop; i++) {
            System.out.println("Imprimindo o número " + i );
        }
    }
}
