package formas;

public class Circulo implements Forma {

    private final int raio;

    public Circulo(int raio) {
        this.raio = raio;
    }

    @Override
    public String desenhar() {
        return "Circulo desenhado";
    }


}
