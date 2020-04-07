package pedido.estado;

public class Aberto implements Estado {

    @Override
    public void verificar() {
    }

    @Override
    public Estado abrir() {
        return this;
    }

    @Override
    public Estado fechar() {
        return new Fechado();
    }
}
