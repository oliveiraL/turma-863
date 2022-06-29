package exercicios.exercicio_01;

import java.util.Date;

public class Assistente extends Funcionario{

    private String matricula;

    public Assistente(String nome, Date nascimento, Float salario, String matricula) {
        super(nome, nascimento, salario);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    @Override
    public String imprimeDados() {
        return super.imprimeDados()+
                "Matricula: "+matricula;
    }
}
