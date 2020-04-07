package curso;

interface Observable {
    void adicionar(Observer observer);
    void remover(Observer observer);
    void notificar();

    String mensagem();
}

