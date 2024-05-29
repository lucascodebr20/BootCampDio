package service;

public class ReprodutorMusical {

    public void tocar() {       
        System.out.println("Reproduzindo musica...");
    }

    public void pausar() {
        System.out.println("Musica pausada.");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Musica selecionada: " + musica);
    }
    
}
