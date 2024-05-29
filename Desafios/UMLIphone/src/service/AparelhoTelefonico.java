package service;

public class AparelhoTelefonico {

    public void ligar(String numero) {       
        verificarNumeroDiscado(numero);
    }

    public void atender() {
        System.out.println("Música pausada.");
    }

    public void iniciarCorreioVoz() {

    }

    private void verificarNumeroDiscado(String numero) {
        if (numero.length() == 8 || numero.length() == 9 ) {
            System.out.println("Ligando para o numero digitado");
        } else {
            System.out.println("Numero Incorreto, digite sem o DD");
        }
    }
    
}
