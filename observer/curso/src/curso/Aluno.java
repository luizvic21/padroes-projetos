package curso;

public class Aluno implements Observer {

    private String email;

    public Aluno(String email) {
        this.email = email;
    }

    @Override
    public void update(Observable observable) {
        System.out.println("E-mail: " + email);
        System.out.println();
        System.out.println(observable.mensagem());
    }
}
