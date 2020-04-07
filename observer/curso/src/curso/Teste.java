package curso;

public class Teste {

    public static void main(String[] args) {
        Curso semanaOmniStack = new Curso("Semana OmniStack 11");

        Aluno victor = new Aluno("victor.l21@aluno.ifsc.edu.br");
        Aluno exemplo = new Aluno("exemplo@mail.edu.br");

        semanaOmniStack.adicionar(victor);

        semanaOmniStack.adicionar(exemplo);

        semanaOmniStack.enviarNovaAula("Conhecendo a Semana OnmiStack", "Introção a Semana Onmistack, hoje vamos mostrar o que será ensinado na semana");
    }
}
