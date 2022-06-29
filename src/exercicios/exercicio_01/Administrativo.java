package exercicios.exercicio_01;

import java.util.Date;

public class Administrativo extends Assistente{

    public Administrativo(String nome, Date nascimento, Float salario, String matricula, String turno) {
        super(nome, nascimento, salario, matricula);
        this.turno = turno;
    }

    private String turno;

    @Override
    public String imprimeDados() {
        return super.imprimeDados()+
                "Turno: "+turno;
    }
}
