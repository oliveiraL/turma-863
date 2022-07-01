package duvidas.exercicio_poligono;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String... args) {

        //Variável de controle para o loop while
        //enquanto o usuario quiser calcular áreas
        // esta variável ficará como true
        boolean calcularArea = true;

        //Lista do tipo poligono podemos adicionar
        // qualquer tipo de poligono nesta lista
        List<Poligono> poligonos = new ArrayList<>();

        //Loop de controle para execução do nosso código
        while (calcularArea) {
            System.out.println("Calcular Area");
            Scanner sc = new Scanner(System.in);
            System.out.println("Informe o tipo de poligono");
            System.out.println("1 - quadrado");
            System.out.println("2 - retangulo");
            System.out.println("3 - triangulo");

            //Recebe o valor do tipo do poligono
            int entrada = sc.nextInt();

            //switch, poderia ser ifs ou também poderia ser o enhaced switch
            //recebe o valor da entrada recebido na linha 33
            switch (entrada) {
                // caso o valor da variável entrada seja 1
                case 1:
                    System.out.println("quadrado");
                    System.out.println("Lado:");
                    var lado = sc.nextDouble();
                    Quadrado quadrado = new Quadrado(lado, lado);
                    System.out.println("A área do quadrado é: " + quadrado.calculaArea() + "m");
                    poligonos.add(quadrado);
                    break;
                // caso o valor da variável entrada seja 2
                case 2:
                    System.out.println("Retangulo");
                    System.out.println("Altura:");
                    var altura = sc.nextDouble();
                    System.out.println("Largura:");
                    double largura = sc.nextDouble();
                    //instancio a classe retangulo
                    Retangulo retangulo = new Retangulo(altura, largura);
                    System.out.println("A área do retangulo é: " + retangulo.calculaArea() + "m");
                    poligonos.add(retangulo);
                    break;
                case 3:
                    // caso o valor da variável entrada seja 3
                    System.out.println("triangulo");
                    System.out.println("Altura:");
                    var alturaTriangulo = sc.nextDouble();
                    System.out.println("Largura:");
                    double larguraTriangulo = sc.nextDouble();
                    //instancio a classe retangulo
                    Triangulo triangulo = new Triangulo(2, 3);
                    System.out.println("A área do triangulo é: " + triangulo.calculaArea() + "m");
                    poligonos.add(triangulo);
                    break;
                default:
                    // caso o valor da variável entrada seja diferente dos valores informados acima
                    System.out.println("Opção inválida - não foi implementado ainda");
            }

            System.out.println("Deseja calcular uma nova área de um poligono?");
            System.out.println("0 - Não, 1 - Sim");
            //recebe entrada do usuário se deseja continuar com a execução ou não
            int continuar = sc.nextInt();
            //se for 0 iremos interromper o loop
            if (continuar == 0) {
                // seta a variavel com false interrompendo o laço while
                calcularArea = false;
            }
        }

        /**
         * Ordernar de acordo com a implementação de CompareTo
         * Para o caso de Retangulos ele irá ordenar de acordo com a sua área
         */
        Collections.sort(poligonos);

        //Faço um for, outro tipo de loop na lista poligonos
        //para cada objeto dentro da lista imprimo o valor do metodo calculaArea
        for (Poligono p : poligonos) {
            System.out.println("Area " + p.calculaArea());
        }
    }

}
