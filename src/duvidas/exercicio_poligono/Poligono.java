package duvidas.exercicio_poligono;

/**
 *
 */
public interface Poligono extends Comparable<Poligono> {

    /**
     * Calcula a area de um poligono
     *
     * @return a área deste poligono
     */
    Double calculaArea();

    boolean validarLados();

    /**
     * Compara a área de dois poligonos
     *
     * @param o que sera comparado
     * @return se o primeiro valor for < que o segundo ele retorna -1
     * se o primeiro valor for > que o segundo ele retorna 1
     * se o valor for igual retorna 0
     */
    @Override
    default int compareTo(Poligono o) {
        // se o primeiro valor for < que o segundo ele retorna -1
        if (this.calculaArea() < o.calculaArea()) {
            return -1;
        }
        // se o primeiro valor for > que o segundo ele retorna 1
        if (this.calculaArea() > o.calculaArea()) {
            return 1;
        }
        // se o valor for igual retorna 0
        return 0;
    }
}
