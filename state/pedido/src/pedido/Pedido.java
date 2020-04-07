package pedido;

import pedido.estado.Aberto;
import pedido.estado.Estado;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private LocalDate data;
    private Cliente cliente;

    private List<Item> itens;

    private Estado estado;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.data = LocalDate.now();
        this.itens = new ArrayList<>();
        this.estado = new Aberto();
    }

    public void adicionar(Item item) {
        this.estado.verificar();
        itens.add(item);
    }

    public void remover(Item item) {
        this.estado.verificar();
        itens.remove(item);
    }

    public void fechar(){
        estado = estado.fechar();
    }

    public void reabrir(){
        this.estado = estado.abrir();
    }

    public float total() {
        float total = 0;
        for(Item item: itens){
            total= total + item.subTotal();
        }
        return  total;
    }
}
