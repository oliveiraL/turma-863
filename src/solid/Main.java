package solid;

import solid.envio.EnviaNotificacao;
import solid.envio.EnvioNotificacaoEmail;
import solid.envio.EnvioNotificacaoSMS;
import solid.envio.EnvioNotificacaoSlack;
import solid.pessoa.empregado.*;
import solid.salario.CalculadoraSalarioFuncionario;

import java.util.Scanner;

/**
 *
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Administrador");
        //Para administrador vamos ter o imposto de 0.2
        Administrador administrador = new Administrador("Spock",
                "Rua Feliz",
                "5555-5555",
                "1",
                2000d,
                0d);

        Administrador administradorExterno = new AdministradorExterno("Spock",
                "Rua Feliz",
                "5555-5555",
                "1",
                2000d,
                0d,
                100d);

        System.out.println("Analista");
        Analista funcionarioAtual = criaFuncionario();

        System.out.println("Estagiario");
        Estagiario estagiario = criaFuncionarioEstagiario();

        Gerente gerente = criaFuncionarioGerente();

        CalculadoraSalarioFuncionario calculadoraSalario = new CalculadoraSalarioFuncionario();
        boolean flag = true;
        while (flag) {
            Scanner sc = new Scanner(System.in);
            System.out.println("------ Bem vindo ao sistema de gestão ------");
            System.out.println("1 - Para secretaria");
            System.out.println("2 - Para RH");
            System.out.println("3 - Para Aluno");
            System.out.println("4 - Para Alterar valor do imposto do funcionario");

            Integer departamento = sc.nextInt();

            switch (departamento) {
                case 1:
                    System.out.println("Secretaria");
                    System.out.println(funcionarioAtual.getEndereco());
                    System.out.println("Cargo: " + funcionarioAtual.getCargo());
                    System.out.println("Salario base: " + funcionarioAtual.getSalarioBase());

                    //Aqui devemos enviar uma notificação para o email
                    EnviaNotificacao envioEmail = new EnvioNotificacaoEmail();
                    envioEmail.envio(funcionarioAtual);

                    System.out.println("Salario calculado: " + calculadoraSalario.calcula(funcionarioAtual));
                    break;
                case 2:
                    System.out.println("RH");
                    System.out.println(funcionarioAtual.getEndereco());
                    System.out.println(funcionarioAtual.getCargo());
                    System.out.println(funcionarioAtual.getSalarioBase());

                    //Devemos enviar uma notificação via SMS
                    EnviaNotificacao envioSms = new EnvioNotificacaoSMS();
                    envioSms.envio(funcionarioAtual);
                    break;
                case 3:
                    System.out.println("Funcionario");
                    System.out.println(funcionarioAtual.getEndereco());
                    System.out.println(funcionarioAtual.getCargo());
                    System.out.println(funcionarioAtual.getSalarioBase());

                    //Devemos enviar uma notificação por Slack
                    EnviaNotificacao envioSlack = new EnvioNotificacaoSlack();
                    envioSlack.envio(funcionarioAtual);
                    break;
                case 4:
                    System.out.println("Imposto Gestor");
                    calculadoraSalario.setImpostoGestor(sc.nextDouble());
                    System.out.println("Imposto Analista");
                    calculadoraSalario.setImpostoAnalista(sc.nextDouble());
                    System.out.println("Imposto Estagiario");
                    calculadoraSalario.setImpostoEstagiario(sc.nextDouble());
            }

            System.out.println("0 - para parar");
            System.out.println("1 - para continuar");

            Integer continua = sc.nextInt();
            if (continua == 0) {
                flag = false;
            }

        }

    }

    private static Analista criaFuncionario() {
        return new Analista(
                "Teste",
                "Rua Feliz",
                "5555-5555",
                "1",
                2000d);
    }

    private static Estagiario criaFuncionarioEstagiario() {
        return new Estagiario(
                "Paulo",
                "Rua Feliz",
                "5555-5555",
                "1",
                1000d
        );
    }

    private static Gerente criaFuncionarioGerente() {
        return new Gerente(
                "Joao",
                "Rua Feliz",
                "5555-5555",
                "1",
                5000d);
    }
}
