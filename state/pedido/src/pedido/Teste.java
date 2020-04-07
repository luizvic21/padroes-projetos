package pedido;

public class Teste {

    public static void main(String[] args) {
        Produto cerveja = new Produto("Cerveja", 10);
        Produto carne = new Produto("Carne", 30);
        Produto batataFrita =  new Produto("bata frita", 18);

        Cliente ze = new Cliente("ze");

        Pedido pedido = new Pedido(ze);

        Item item1 = new Item(2, cerveja);
        Item item2 = new Item(carne);
        Item item3 = new Item(batataFrita);

        pedido.adicionar(item1);
        pedido.adicionar(item2);

        pedido.fechar();
        pedido.reabrir();

        pedido.adicionar(item3);

        System.out.println(pedido.total());
    }
}
