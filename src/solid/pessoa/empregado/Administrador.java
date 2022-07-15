package solid.pessoa.empregado;

import static solid.pessoa.empregado.Cargo.ADMINISTRADOR;

public class Administrador extends Empregado {

    public Double ajudaCusto;

    public Administrador(String nome,
                         String endereco,
                         String telefone,
                         String codigoSetor,
                         Double salario,
                         Double ajudaCusto
    ) {
        super(nome, endereco, telefone, codigoSetor, salario);
        this.ajudaCusto = ajudaCusto;
    }

    @Override
    public Cargo getCargo() {
        return ADMINISTRADOR;
    }

    public Double getAjudaCusto() {
        return ajudaCusto;
    }

    public void setAjudaCusto(Double ajudaCusto) {
        this.ajudaCusto = ajudaCusto;
    }
}
