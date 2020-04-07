package agua;

public interface Estado {

    String estado();
    Estado fusao();
    Estado vaporizacao();
    Estado solidificacao();
    Estado liquefacao();
    Estado sublimacao();
}
