package produto;

import java.util.ArrayList;
import java.util.List;

public class Categoria {

    private List<Categoria> subCategorias;
    private List<Produto> produtos;
    private String descricao;

    public Categoria(String descricao) {
        this.descricao = descricao;
        subCategorias = new ArrayList<>();
        produtos = new ArrayList<>();
    }

    public void adicionar(Categoria categoria) {
        subCategorias.add(categoria);
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public int totalProdutos() {
        return produtos.size() + subCategorias.stream().mapToInt(Categoria::totalProdutos).sum();
    }

    public String relatorio() {
        StringBuilder relatorio = new StringBuilder().append(totalProdutos()).append(" - ").append(this.descricao).append(System.lineSeparator());
        subCategorias.forEach(categoria -> relatorio.append(categoria.relatorio()));
        return relatorio.toString();
    }
}
