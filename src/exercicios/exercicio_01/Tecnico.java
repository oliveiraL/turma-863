package exercicios.exercicio_01;

import java.util.Date;

public class Tecnico extends Assistente{

    private Float bonus;

    public Tecnico(String nome, Date nascimento, Float salario, String matricula, Float bonus) {
        super(nome, nascimento, salario, matricula);
        this.bonus = bonus;
    }

    @Override
    public String imprimeDados() {
        return super.imprimeDados()+
                "Bonus: "+bonus;
    }
}
