package pedido;

public class Item {
    private int quantidade;
    private Produto produto;

    public Item(int quantidade, Produto produto) {
        this.quantidade = quantidade;
        this.produto = produto;
    }

    public Item(Produto produto) {
        this(1, produto);
    }

    public float subTotal() {
        return produto.getPreco() * quantidade;
    }
}
