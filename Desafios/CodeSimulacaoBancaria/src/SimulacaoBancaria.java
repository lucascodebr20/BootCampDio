import java.util.InputMismatchException;
import java.util.Scanner;

public class SimulacaoBancaria {

  public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

        int idade = scanner.nextInt();

        if (idade >= 18) {
          System.out.println("Voce esta elegivel para criar uma conta bancaria.");
        } else {
          System.out.println("Voce nao esta elegivel para criar uma conta bancaria.");
        }
      
        catch (InputMismatchException e) {
          System.out.println("Use apenas numeros");
        } finally {
          scanner.close();
        }
      }
    }
    
}
