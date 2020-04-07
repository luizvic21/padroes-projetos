import decorator.Borda;
import decorator.Cor;
import decorator.Decorador;
import decorator.Preenchimento;
import formas.*;

public class Teste {

    public static void main(String[] args) {

        // 1 - Desenhar um ciculo
        Forma circulo = new Circulo(10);
        System.out.println(circulo.desenhar());

        // 2 - Aplicar largura da linha de borda
        Decorador borda = new Borda(0.2, circulo);
        System.out.println(borda.desenhar());

        // 3 - Aplicar cor na linha de borda
        Decorador corBorda = new Cor("verde", borda);
        System.out.println(corBorda.desenhar());

        // 4 - Aplicar cor no preenchimento
        Decorador corPreenchimento = new Preenchimento(circulo);
        Decorador azul = new Cor("azul", circulo);
        System.out.println(azul.desenhar());
    }
}
