package duvidas.generico;

import exercicios.exercicio_01.*;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        CadastroGeral<Pessoa> geral = new CadastroGeral();
        CadastroGeral<Animal> animais = new CadastroGeral();
        CadastroGeral<Integer> numeros = new CadastroGeral();
        CadastroGeral<String> textos = new CadastroGeral();
        CadastroGeral<List<String>> listas = new CadastroGeral();

        CadastroGeral<Informacoes> informacoes = new CadastroGeral();


        Cliente cliente = new Cliente("Lucio",
                Date.valueOf(LocalDate.of(1995,
                        1, 1)),
                1
        );

        Funcionario funcionario = new Funcionario(
                "funcionario",
                Date.valueOf(LocalDate.of(1995,
                        1, 1)),
                1000F
        );

        Pessoa pessoa = new Funcionario(
                "funcionario 2",
                Date.valueOf(LocalDate.of(1995,
                        1, 1)),
                1000F
        );

        Cachorro cachorro = new Cachorro();

        Gerente gerente = new Gerente("gerente",
                Date.valueOf(LocalDate.of(1995,
                        1, 1)),
                2000F,
                "TI");

        informacoes.cadastro(cliente);
        informacoes.cadastro(funcionario);
        informacoes.cadastro(pessoa);
        informacoes.cadastro(gerente);
        informacoes.cadastro(cachorro);
        textos.cadastro("");

        informacoes.imprime();
    }
}
