package solid.pessoa.fornecedor;

import solid.pessoa.Pessoa;

public class Fornecedor extends Pessoa {

    private Double valorCredito;

    private Double valorDivida;

    public Fornecedor(String nome, Double valorCredito, Double valorDivida) {
        super(nome);
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }

    public Fornecedor(String nome, String endereco, Double valorCredito, Double valorDivida) {
        super(nome, endereco);
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }

    public Fornecedor(String nome, String endereco, String telefone, Double valorCredito, Double valorDivida) {
        super(nome, endereco, telefone);
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }

    public Double getSaldo() {
        return this.valorCredito - this.valorDivida;
    }
}
