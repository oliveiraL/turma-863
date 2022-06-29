package exercicios.exercicio_01;

import java.util.ArrayList;
import java.util.List;

public class CadastroInformacoes {

    private List<Informacoes> informacoes = new ArrayList<>();

    public void cadastro(Informacoes info){
        informacoes.add(info);
    }

    public void listarInformacoes(){
        for (Informacoes info: informacoes){
            System.out.println(info.imprimeDados());
        }
    }


}
