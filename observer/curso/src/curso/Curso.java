package curso;

import java.util.ArrayList;
import java.util.List;

public class Curso implements Observable {

    private String nome;
    private List<Observer> alunos;
    private Aula aula;

    public Curso(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList<>();
    }

    @Override
    public void adicionar(Observer observer) {
        alunos.add(observer);
    }

    @Override
    public void remover(Observer observer) {
        alunos.remove(observer);
    }

    @Override
    public void notificar() {
        alunos.forEach(aluno -> aluno.update(this));
    }

    @Override
    public String mensagem() {
        return aula.getAula();
    }

    public void enviarNovaAula(String titulo, String conteudo ) {
        aula = new Aula(titulo, conteudo);
        notificar();
    }
}
