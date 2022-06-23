package duvidas;



public class Main {
    public static void main(String[] args) {

        Carro carro = new Carro();

        System.out.println(carro.territorio);
        System.out.println(carro.isLigado());
        carro.ligar();
        System.out.println(carro.isLigado());

        Barco barco = new Barco();
        System.out.println("BARCO");
        System.out.println(barco.isLigado());


        System.out.println(
        );
        System.out.println();
        System.out.println();

        Veiculo veiculo = carro;
        System.out.println(veiculo.getTerritorio());
        veiculo = barco;
        System.out.println(veiculo.getTerritorio());
    }
}
