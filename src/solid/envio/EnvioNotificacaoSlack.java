package solid.envio;

import solid.pessoa.empregado.Empregado;

public class EnvioNotificacaoSlack implements EnviaNotificacao {

    @Override
    public void envio(Empregado empregado) {
        System.out.println("Envio de Slack, Para " + empregado.getNome() + " salario:" + empregado.getSalarioBase());
    }
}
