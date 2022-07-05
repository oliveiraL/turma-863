package duvidas.generico;

import java.util.ArrayList;
import java.util.List;

public class CadastroGeral<T> {

    private List<T> listaGenerica =new ArrayList<>();

    public void cadastro(T obj){
        listaGenerica.add(obj);
    }

    public void imprime(){
        for (T obj: listaGenerica){
            System.out.println(obj);
        }
    }

}
