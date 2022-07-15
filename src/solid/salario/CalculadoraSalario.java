package solid.salario;

import solid.pessoa.empregado.Empregado;

/**
 * Responsabilidade de calcular o salario de um funcionario.
 */
@FunctionalInterface
public interface CalculadoraSalario {

    Double calcula(Empregado empregado);
}
