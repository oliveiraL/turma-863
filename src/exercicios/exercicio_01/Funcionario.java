package exercicios.exercicio_01;

import java.util.Date;

public class Funcionario extends Pessoa{

    public Funcionario(String nome, Date nascimento, Float salario) {
        super(nome, nascimento);
        this.salario = salario;
    }

    protected Float salario;

    @Override
    public String imprimeDados() {
        return "Nome: "+nome+"\n"+
                "Nascimento: "+nascimento+"\n"+
                "Salario: "+salario+"\n";
    }

    public Float calculaImposto(){
        return salario * 0.03F;
    }
}
