package solid.pessoa.empregado;

import solid.pessoa.Pessoa;

/**
 * Classe de pessoa que possui um codigo e um salario
 */
public abstract class Empregado extends Pessoa {

    private String codigoSetor;

    private Double salarioBase;

    public Empregado(String nome,
                     String endereco,
                     String telefone,
                     String codigoSetor,
                     Double salario
    ) {
        super(nome, endereco, telefone);
        this.codigoSetor = codigoSetor;
        this.salarioBase = salario;
    }

    public abstract Cargo getCargo();

    public String getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(String codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

}


