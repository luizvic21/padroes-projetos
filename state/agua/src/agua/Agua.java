package agua;

public class Agua {

    private Estado estado;

    public Agua(Estado estado) {
        this.estado = estado;
    }

    public void fusao(){
        this.estado = this.estado.fusao();
    }
    public void vaporizacao(){
        this.estado = this.estado.vaporizacao();
    }
    public void solidificacao(){
        this.estado = this.estado.solidificacao();
    }
    public void liquefacao(){
        this.estado = this.estado.liquefacao();
    }
    public void sublimacao(){
        this.estado = this.estado.sublimacao();
    }

    public String getEstado() {
        return this.estado.estado();
    }

}
