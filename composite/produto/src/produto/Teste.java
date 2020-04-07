package produto;

public class Teste {

    public static void main(String[] args) {
        Categoria geral = new Categoria("Geral");

        Categoria eletrodomesticos = new Categoria("Eletrodomésticos");
        geral.adicionar(eletrodomesticos);

        Categoria eletroeletronicos = new Categoria("Eletroeletronicos");
        geral.adicionar(eletroeletronicos);

        Categoria geladeiras_e_freezers = new Categoria("Geladeiras e Freezers");
        eletrodomesticos.adicionar(geladeiras_e_freezers);

        Categoria geladeiras = new Categoria("Geladeiras");
        geladeiras_e_freezers.adicionar(geladeiras);

        Categoria inox = new Categoria("Inox");
        geladeiras.adicionar(inox);

        Categoria branca = new Categoria("Branca");
        geladeiras.adicionar(branca);

        new Produto("Brastemp BT3456", 10, inox);
        new Produto("Eletrolux EL1234", 10, branca);
        new Produto("TV Sansung UX1234", 10, eletroeletronicos);

        System.out.println(geral.relatorio());

        System.out.println(geladeiras.relatorio());
    }
}
