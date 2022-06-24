package exercicios.exercicio_01;

import java.util.ArrayList;
import java.util.List;

public class CadastroPessoas {

    private List<Pessoa> pessoas = new ArrayList<>();


    public void cadastraPessoa(Pessoa pessoa){
        pessoas.add(pessoa);
    }
    public void imprimeCadastro(){

        for (Pessoa pessoa: pessoas){
            System.out.println(pessoa.getClass());
            System.out.println(pessoa.imprimeDados());
        }
    }

}
