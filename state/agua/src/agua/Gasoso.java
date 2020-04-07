package agua;

public class Gasoso implements Estado {

    @Override
    public String estado() {
        return "Gasoso";
    }

    @Override
    public Estado fusao() {
        throw new RuntimeException("Não é possivel fazer fusão");
    }

    @Override
    public Estado vaporizacao() {
        throw new RuntimeException("Não é possivel fazer vaporização");
    }

    @Override
    public Estado solidificacao() {
        throw new RuntimeException("Não é possivel fazer solidificação");
    }

    @Override
    public Estado liquefacao() {
        return new Liquido();
    }

    @Override
    public Estado sublimacao() {
        return new Solido();
    }
}
