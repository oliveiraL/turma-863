package duvidas;

/**
 *
 * Se NãoEstiverligo Então
 *  Liga
 * Senão continua....
 *
 *
 *
 */


public abstract class Veiculo {

    public Veiculo(){
        this.ligado = false;
    }

    public Veiculo(Boolean ligado) {
        this.ligado = ligado;
    }

    public Veiculo(String territorio) {
        this.territorio = territorio;
    }

    public Veiculo(String territorio, Boolean ligado) {
        this.territorio = territorio;
        this.ligado = ligado;
    }


    protected String territorio;
    private Boolean ligado;

    public Boolean isLigado(){
        return ligado;
    }

    public String getTerritorio(){
        return territorio;
    }

    public void ligar(){
        if(!this.ligado){
            this.ligado = true;
        }
    }

}
