import java.util.Scanner;

public class VerificarIdade {

    public static void main (String[] args) {

       try (Scanner scanner = new Scanner (System.in)) {

        System.out.println("Qual a sua idade ?");
        int idade = scanner.nextInt();

        if (idade >= 18) {
            System.out.println("Você é maior de idade");
        } else {
            System.out.println("Você é menor de idade");
        }

        }
       
    }
}
