import java.util.ArrayList;

public class ForEcach {
    
    public static void main(String[] args) {
        
        try {
            
            String[] numerosTelefonicos = new String[] {
                "500", 
                "1000", 
                "not", 
                "8000", 
                "ade", 
                "4400", 
                "ab3", 
                "7700",
                "9900", 
                "ph"  
            };

            ArrayList<String> numerosErrados = new ArrayList<>();
            ArrayList<String> numerosCorretos = new ArrayList<>();
            
            for (String numero : numerosTelefonicos) {
                try {
                    Integer.valueOf(numero);
                    numerosCorretos.add(numero);
                } catch (NumberFormatException e) {
                    numerosErrados.add(numero);
                }
            }

            System.out.println("Numeros Errados: ");
            System.out.println(numerosErrados); // Teste para ver a coleta dos numeros
            System.out.println("");
            System.out.println("Numeros Corretos: ");
            System.out.println(numerosCorretos);
            System.out.println("");

        } catch (Exception e) {}
    }
}
