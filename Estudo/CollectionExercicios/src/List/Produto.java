package List;

public class Produto {
    private String nome;
    private int quantidade;
    private double preco;

    public Produto (String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    };

    public String getNome() {
        return nome;
    };

    public void setNome(String nome){
        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser vazio");
        }
        this.nome = nome; 
    };

    public int getQuantidade() {
        return quantidade;
    };

    public void setQuantidade(int quantidade) {
        if (preco < 0 ) {
            throw new IllegalArgumentException("Quantidade não poder ser menor que zero");
        }
        this.quantidade = quantidade; 
    };

    public double getPreco() {
        return preco;
    };

    public void setPreco(double preco) {
        if (preco < 0 ) {
            throw new IllegalArgumentException("Preço não pode ser negativo");
        }
        this.preco = preco; 
    };

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    };
    
}
