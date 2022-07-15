package solid.envio;

import solid.pessoa.empregado.Empregado;

public class EnvioNotificacaoEmail implements EnviaNotificacao {

    @Override
    public void envio(Empregado empregado) {
        System.out.println("Enviando email....");
        System.out.println("Envio de Email, Para " + empregado.getNome() + " salario:" + empregado.getSalarioBase());
    }
}
