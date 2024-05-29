package aparelho;

import service.AparelhoTelefonico;
import service.NavegadorInternet;
import service.ReprodutorMusical;

public class Iphone {

    public static void main(String[] args) {
        
    ReprodutorMusical musica = new ReprodutorMusical();
    AparelhoTelefonico telefonar = new AparelhoTelefonico();
    NavegadorInternet navegar = new NavegadorInternet();

    int quantidadeCorreiosVoz = 5;
    
    musica.tocar();
    musica.pausar();
    navegar.exibirPagina("wwww.google.com.br");
    navegar.atualizarPagina();
    navegar.adicionarNovaAba();
    telefonar.atender();
    telefonar.ligar("997968900");
    telefonar.iniciarCorreioVoz(quantidadeCorreiosVoz);
    
    }

}
