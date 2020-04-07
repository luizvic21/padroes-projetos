package agua;

public class Liquido implements Estado {

    @Override
    public String estado() {
        return "Líquido";
    }

    @Override
    public Estado fusao() {
        throw new RuntimeException("Não é possivel fazer fusão");
    }

    @Override
    public Estado vaporizacao() {
        return new Gasoso();
    }

    @Override
    public Estado solidificacao() {
        return new Solido();
    }

    @Override
    public Estado liquefacao() {
        throw new RuntimeException("Não é possivel fazer liquefacao");
    }

    @Override
    public Estado sublimacao() {
        throw new RuntimeException("Não é possivel fazer sublimação");
    }
}
