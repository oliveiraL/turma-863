package exercicios.exercicio_01;

import java.util.Date;

public class Gerente extends Funcionario {

    private String area;

    public Gerente(String nome, Date nascimento,
                   Float salario, String area) {
        super(nome, nascimento, salario);
        this.area = area;
    }

    @Override
    public String imprimeDados() {
        return super.imprimeDados()+
                "Area: "+area;
    }

    @Override
    public Float calculaImposto() {
        return salario * 0.05F;
    }

    @Override
    public Integer getIdade() {
        return 1;
    }
}
