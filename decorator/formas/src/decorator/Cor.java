package decorator;

import formas.Forma;

public class Cor implements Decorador {

    private final String cor;
    private final Forma forma;

    public Cor(String cor, Forma forma) {
        this.cor = cor;
        this.forma = forma;
    }

    @Override
    public String desenhar() {
        return new StringBuilder().append(forma.desenhar()).append("na cor ").append(cor).toString();
    }
}
