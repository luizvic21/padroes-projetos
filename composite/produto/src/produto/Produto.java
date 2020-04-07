package produto;

public class Produto {

    private String nome;
    private int quantidade;
    private Categoria categoria;

    public Produto(String nome, int quantidade, Categoria categoria) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.categoria = categoria;
        categoria.adicionarProduto(this);
    }
}
