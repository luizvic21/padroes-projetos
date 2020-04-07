package pedido.estado;

public class Fechado implements Estado {

    @Override
    public void verificar() {
        throw new RuntimeException("pedido fechado");
    }

    @Override
    public Estado abrir() {
        return new Aberto();
    }

    @Override
    public Estado fechar() {
        return this;
    }
}
