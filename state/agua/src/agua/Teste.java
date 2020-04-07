package agua;

public class Teste {

    public static void main(String[] args) {
        Agua agua = new Agua(new Solido());

        System.out.println(agua.getEstado());
        agua.fusao();
        System.out.println(agua.getEstado());
        agua.vaporizacao();
        System.out.println(agua.getEstado());
        agua.liquefacao();
        System.out.println(agua.getEstado());
        agua.solidificacao();
        System.out.println(agua.getEstado());
        agua.sublimacao();
        System.out.println(agua.getEstado());
    }
}
