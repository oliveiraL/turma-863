package exercicios.exercicio_01;

import java.util.Date;

public abstract class Pessoa {

    public Pessoa(String nome, Date nascimento) {
        this.nome = nome;
        this.nascimento = nascimento;
    }

    protected String nome;
    protected Date nascimento;

    public abstract String imprimeDados();
}
