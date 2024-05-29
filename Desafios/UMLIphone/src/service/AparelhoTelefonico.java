package service;

public class AparelhoTelefonico {

    public void ligar(String numero) {       
        verificarNumeroDiscado(numero);
    }

    public void atender() {
        System.out.println("Ligacao Atendida");
    }

    public void iniciarCorreioVoz(int quantidadeCorreiosVoz) {
        verificarCorreioVoz(quantidadeCorreiosVoz);
    }

    private void verificarNumeroDiscado(String numero) {
        if (numero.length() == 8 || numero.length() == 9 ) {
            System.out.println("Ligando para o numero digitado");
        } else {
            System.out.println("Numero Incorreto");
        }
    }

    private void verificarCorreioVoz (int quantidadeCorreiosVoz) {
            if (quantidadeCorreiosVoz > 0) {
                System.out.println("Ouvindo Correio de voz ! ");
            } else {
                System.out.println("Você nao possui mensagens no correio de voz...");
            }   
    }
}
