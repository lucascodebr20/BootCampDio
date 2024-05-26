import java.util.ArrayList;

public class ForEcach {
    
    public static void main(String[] args) {
        
        try {
            
            String[] numerosTelefonicos = new String[] {
                "1234567890", 
                "9876543210", 
                "555notanum", 
                "8001234567", 
                "12345abcde", 
                "4445556666", 
                "12ab345678", 
                "7778889999",
                "9990001234", 
                "phone12345"  
            };

            ArrayList<String> numerosErrados = new ArrayList<>();
            ArrayList<String> numerosCorretos = new ArrayList<>();   
            
            for (String numero : numerosTelefonicos) {
                try {
                    int numeroConvertido = Integer.parseInt(numero);
                    numerosCorretos.add(numeroConvertido);
                } catch (NumberFormatException e) {
                    numerosErrados.add(numero);
                }
            }

            System.out.println(numerosErrados); // Teste para ver a coleta

        } catch (Exception e) {

        }
    }
}
