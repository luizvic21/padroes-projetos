package decorator;

import formas.Forma;

public class Preenchimento implements Decorador {

    private final Forma forma;

    public Preenchimento(Forma forma) {
        this.forma = forma;
    }

    @Override
    public String desenhar() {
        return new StringBuilder().append(forma.desenhar()).append(" com preenchimento").toString();
    }
}
