package solid.salario;

import solid.pessoa.empregado.Empregado;

public class CalculadoraSalarioFuncionario implements CalculadoraSalario {

    private Double impostoGestor = 0.3;

    private Double impostoEstagiario = 0.1;

    private Double impostoADMIN = 0.2;

    private Double impostoAnalista = 0.15;

    public CalculadoraSalarioFuncionario(Double impostoGestor, Double impostoEstagiario, Double impostoADMIN, Double impostoAnalista) {
        this.impostoGestor = impostoGestor;
        this.impostoEstagiario = impostoEstagiario;
        this.impostoADMIN = impostoADMIN;
        this.impostoAnalista = impostoAnalista;
    }

    public CalculadoraSalarioFuncionario() {
    }

    /**
     * Metódo responsável por calcular o salario de um funcionario
     * para cada classe de funcionario temos um percentual que será deduzido de acordo com os impostos do cargo
     *
     * @param funcionario funcionario o qual iremos calcular o salario resultante
     * @return o valor final do salario do funcionario
     */
    public Double calcula(Empregado funcionario) {
        return switch (funcionario.getCargo()) {
            case ESTAGIARIO -> calculateEstagiarioSalario(funcionario);
            case ANALISTA -> calculateAnalistaSalario(funcionario);
            case GERENTE -> calculateGerenteSalario(funcionario);
            case ADMINISTRADOR -> calculateAdministradorSalario(funcionario);
            default -> throw new IllegalStateException("Unexpected value: " + funcionario.getCargo());
        };
    }

    private Double calculateEstagiarioSalario(Empregado funcionario) {
        return funcionario.getSalarioBase() * (1 - getImpostoEstagiario());
    }

    private Double calculateAnalistaSalario(Empregado funcionario) {
        return funcionario.getSalarioBase() * (1 - getImpostoAnalista());
    }

    private Double calculateGerenteSalario(Empregado funcionario) {
        return funcionario.getSalarioBase() * (1 - getImpostoGestor());
    }

    private Double calculateAdministradorSalario(Empregado funcionario) {
        if (funcionario.getSalarioBase() > 3000) {
            return funcionario.getSalarioBase() * 0.8;
        }
        return funcionario.getSalarioBase() * 0.75;
    }

    public Double getImpostoGestor() {
        return impostoGestor;
    }

    public void setImpostoGestor(Double impostoGestor) {
        this.impostoGestor = impostoGestor;
    }

    public Double getImpostoEstagiario() {
        return impostoEstagiario;
    }

    public void setImpostoEstagiario(Double impostoEstagiario) {
        this.impostoEstagiario = impostoEstagiario;
    }

    public Double getImpostoADMIN() {
        return impostoADMIN;
    }

    public void setImpostoADMIN(Double impostoADMIN) {
        this.impostoADMIN = impostoADMIN;
    }

    public Double getImpostoAnalista() {
        return impostoAnalista;
    }

    public void setImpostoAnalista(Double impostoAnalista) {
        this.impostoAnalista = impostoAnalista;
    }
}
