package exercicios.exercicio_01;

import java.util.Date;

public class Cliente extends Pessoa {

    public Cliente(String nome, Date nascimento, Integer codigo) {
        super(nome, nascimento);
        this.codigo = codigo;
    }

    private Integer codigo;

    @Override
    public String imprimeDados() {
        return "Nome: "+nome+"\n"+
                "Nascimento: "+nascimento+"\n"+
                "Código: "+codigo+"\n";
    }

    public Integer getCodigo() {
        return codigo;
    }

    @Override
    public String getNome() {
        return null;
    }

    @Override
    public Integer getIdade() {
        return null;
    }
}
