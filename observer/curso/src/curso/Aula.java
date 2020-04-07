package curso;

public class Aula {
    private String titulo;
    private String conteudo;

    public Aula(String titulo, String conteudo) {
        this.titulo = titulo;
        this.conteudo = conteudo;
    }

    public String getAula() {
        return new StringBuilder().append(titulo).append(System.lineSeparator()).append(conteudo).toString();
    }
}
