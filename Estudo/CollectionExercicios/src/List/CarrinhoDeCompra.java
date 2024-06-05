package List;

import java.util.ArrayList;
import java.util.List;


public class CarrinhoDeCompra {

    private final List<Produto> carrinhoCompra;

    public CarrinhoDeCompra() {
        this.carrinhoCompra = new ArrayList<>();
    }

    public static void main(String[] args) {

        CarrinhoDeCompra carrinho1 = new CarrinhoDeCompra();

        carrinho1.adicionarItem ("Camiseta A",1,50.00);
        carrinho1.adicionarItem ("Camiseta B",2,49.50);
        carrinho1.adicionarItem ("Camiseta A",1,50.00);
        carrinho1.adicionarItem ("Camiseta A",1,50.00);
        carrinho1.removerItem("Camiseta B");
        carrinho1.imprimirPedido();
        carrinho1.somarPedido();

    }

    public void adicionarItem (String nome, int quantidade, double preco) {
        carrinhoCompra.add(new Produto(nome, quantidade, preco));
    };

    public void removerItem(String nome) {
        carrinhoCompra.removeIf(produto -> produto.getNome().equals(nome));
    };

    public void somarPedido() {
        double total = 0;
        for (Produto produto : carrinhoCompra) {
            total += produto.getPreco() * produto.getQuantidade();
        }

        System.out.println("Total do Pedido: R$ " + total);
    }

    public void imprimirPedido() {
        System.out.println("Pedido:");
        for (Produto produto : carrinhoCompra) {
            System.out.println(produto);
        }
    };
    
}