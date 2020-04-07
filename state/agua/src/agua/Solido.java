package agua;

public class Solido implements Estado {

    @Override
    public String estado() {
        return "Sólido";
    }

    @Override
    public Estado fusao() {
        return new Liquido();
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
        throw new RuntimeException("Não é possivel fazer liquefação");
    }

    @Override
    public Estado sublimacao() {
        return new Gasoso();
    }
}
