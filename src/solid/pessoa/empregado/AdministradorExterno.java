package solid.pessoa.empregado;

public class AdministradorExterno extends Administrador {

    public Double creditoEmpresarial;

    public AdministradorExterno(String nome,
                                String endereco,
                                String telefone,
                                String codigoSetor,
                                Double salario,
                                Double ajudaCusto,
                                Double creditoEmpresarial
    ) {
        super(nome, endereco, telefone, codigoSetor, salario, ajudaCusto);
        this.creditoEmpresarial = creditoEmpresarial;
    }

    public Double getCreditoEmpresarial() {
        return creditoEmpresarial;
    }

    public void setCreditoEmpresarial(Double creditoEmpresarial) {
        this.creditoEmpresarial = creditoEmpresarial;
    }
}
