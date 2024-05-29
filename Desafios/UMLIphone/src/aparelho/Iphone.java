package aparelho;

import service.AparelhoTelefonico;
import service.NavegadorInternet;
import service.ReprodutorMusical;

public class Iphone {

    public static void main(String[] args) {
        
    ReprodutorMusical musica = new ReprodutorMusical();
    AparelhoTelefonico telefonar = new AparelhoTelefonico();
    NavegadorInternet navegar = new NavegadorInternet();
    
    musica.tocar();
    musica.pausar();
    navegar.adicionarNovaAba();
    telefonar.ligar("47968900");

    }

}
