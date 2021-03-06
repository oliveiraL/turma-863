package exercicios.exercicio_01;

import duvidas.generico.CadastroGeral;

import java.sql.Date;
import java.time.LocalDate;

public class TestaCadastro {
    public static void main(String[] args) {


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

        Gerente gerente = new Gerente("gerente",
                Date.valueOf(LocalDate.of(1995,
                        1, 1)),
                2000F,
                "TI");

        Cachorro cachorro = new Cachorro();

        CadastroPessoas cadastroPessoas = new CadastroPessoas();
        cadastroPessoas.cadastraPessoa(cliente);
        cadastroPessoas.cadastraPessoa(funcionario);
        cadastroPessoas.cadastraPessoa(pessoa);
        cadastroPessoas.cadastraPessoa(gerente);

        cadastroPessoas.imprimeCadastro();




        CadastroInformacoes cadastroInformacoes = new CadastroInformacoes();
        cadastroInformacoes.cadastro(pessoa);
        cadastroInformacoes.cadastro(gerente);
        cadastroInformacoes.cadastro(funcionario);
        cadastroInformacoes.cadastro(cliente);
        cadastroInformacoes.cadastro(cachorro);
        cadastroInformacoes.listarInformacoes();
    }
}
