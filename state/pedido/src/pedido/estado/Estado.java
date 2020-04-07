package pedido.estado;

public interface Estado {

    void verificar();

    Estado abrir();

    Estado fechar();
}
