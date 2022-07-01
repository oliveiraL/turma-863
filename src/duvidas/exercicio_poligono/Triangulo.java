package duvidas.exercicio_poligono;

public class Triangulo implements Poligono {

    private final double base;
    private final double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public Double calculaArea() {
        return (base * altura) / 2;
    }

    @Override
    public boolean validarLados() {
        return false;
    }

}
