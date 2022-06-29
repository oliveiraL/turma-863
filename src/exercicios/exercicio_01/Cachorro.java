package exercicios.exercicio_01;

public class Cachorro extends Animal{
    @Override
    public String imprimeDados() {
        return "Nome: "+getNome();
    }

    @Override
    public String getNome() {
        return "Clara";
    }

    @Override
    public Integer getIdade() {
        return 7;
    }
}
