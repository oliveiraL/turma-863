package duvidas.exercicio_poligono;

public class Retangulo implements Poligono {

    private Double altura;
    private Double largura;

    public Retangulo(Double altura, Double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    @Override
    public Double calculaArea() {
        return this.altura * this.largura;
    }

    @Override
    public boolean validarLados() {
        return false;
    }

}
