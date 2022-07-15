package solid.pessoa.empregado;

/*
    SRP principio da responsabilidade unica
*/
public class Analista extends Empregado {

    public Analista(String nome, String endereco, String telefone, String codigoSetor, Double salario) {
        super(nome, endereco, telefone, codigoSetor, salario);
    }

    @Override
    public Cargo getCargo() {
        return Cargo.ANALISTA;
    }

}
