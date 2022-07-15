package solid.pessoa.empregado;

import static solid.pessoa.empregado.Cargo.OPERARIO;

public class Operario extends Empregado {

    public Operario(String nome, String endereco, String telefone, String codigoSetor, Double salario) {
        super(nome, endereco, telefone, codigoSetor, salario);
    }

    @Override
    public Cargo getCargo() {
        return OPERARIO;
    }
}
