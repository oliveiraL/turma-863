package duvidas.exercicio_poligono;

public class Quadrado extends Retangulo {

    public Quadrado(Double altura, Double largura) {
        super(altura, largura);
        if ((altura > largura) || (altura < largura)) {
            throw new RuntimeException("Informe os lados iguais, dados informados: altura: " + altura + ", largura:" + largura);
        }
    }
}
