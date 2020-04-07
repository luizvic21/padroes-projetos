package decorator;

import formas.Forma;

public class Borda implements Decorador {

    private final double largura;
    private final Forma forma;

    public Borda(double largura, Forma forma) {
        this.largura = largura;
        this.forma = forma;
    }

    @Override
    public String desenhar() {
        return new StringBuilder().append(forma.desenhar()).append(" com borda").toString();
    }
}
