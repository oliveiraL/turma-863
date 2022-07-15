package solid.pessoa.empregado;

public class Gerente extends Empregado {

    public Gerente(String nome, String endereco, String telefone, String codigoSetor, Double salario) {
        super(nome, endereco, telefone, codigoSetor, salario);
    }

    @Override
    public Cargo getCargo() {
        return Cargo.GERENTE;
    }

    public void enviaNotificacao() {
        System.out.println("Envio de sms");
    }

}
