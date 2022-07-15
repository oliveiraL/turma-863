package solid.pessoa.empregado;

public class Estagiario extends Empregado {

    public Estagiario(String nome, String endereco, String telefone, String codigoSetor, Double salario) {
        super(nome, endereco, telefone, codigoSetor, salario);
    }

    @Override
    public Cargo getCargo() {
        return Cargo.ESTAGIARIO;
    }
}
