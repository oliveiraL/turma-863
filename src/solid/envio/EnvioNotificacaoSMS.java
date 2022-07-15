package solid.envio;

import solid.pessoa.empregado.Empregado;

/**
 * Essa classe tem a responsabilidade de realizar um envio de SMS para o empregado passado atraves do parametro da função
 * envio.
 */
public class EnvioNotificacaoSMS implements EnviaNotificacao {

    @Override
    public void envio(Empregado empregado) {
        System.out.println("Envio de SMS, Para " + empregado.getNome() + " salario:" + empregado.getSalarioBase());
    }
}
