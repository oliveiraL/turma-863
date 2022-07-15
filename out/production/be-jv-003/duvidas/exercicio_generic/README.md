Qual o problema dela?

Coesão!

Tente generalizar esse exemplo de código. Códigos como esse são bastante comuns: é normal olhar para uma característica do objeto e, de acordo com ela,
tomar alguma decisão. Repare que existem apenas 3 cargos diferentes (desenvolvedor, DBA e tester) com regras similares. Mas em um sistema real, essa
quantidade seria grande. Ou seja, essa classe tem tudo para ser uma daquelas
classes gigantescas, cheias de if e else, com que estamos acostumados. Ela não
tem nada de coesa.

Imagine só essa classe com 15, 20, 30 cargos diferentes. A sequência de
ifs seria um pesadelo. Além disso, cada cargo teria sua implementação de
cálculo diferente, ou seja, mais algumas dezenas de métodos privados. Agora
tente complicar um pouco essas regras de cálculo. Um caos.
Classes não coesas ainda têm outro problema: a chance de terem defeitos
é enorme. Talvez nesse exemplo seja difícil de entender o argumento, mas
como essas muitas regras estão uma perto da outra, é fácil fazer com que uma
regra influencie a outra, ou que um defeito em uma seja propagado para a
outra. Entender e manter esse arquivo não é uma tarefa fácil ou divertida de
ser feita.

Agora imagine que exista a necessidade de se reutilizar o método
dezOuVintePorcento() em algum outro ponto do sistema. Levar a classe
CalculadoraDeSalario inteira para outro sistema, ou mesmo fazer outra
classe depender dela só para reutilizar esse comportamento, é um pecado.
Reutilizar código está difícil também.
A pergunta é: como resolver esses problemas?

Repare, toda classe que é não coesa não para de crescer
nunca


A classe CalculadoraDeSalario, em particular, cresce indefinidamente por dois motivos: sempre que um cargo novo surgir ou sempre que
uma regra de cálculo nova surgir. Vamos começar resolvendo o segundo
problema, já que ele é mais fácil.
Observe cada método privado. Apesar de terem implementações diferentes, eles possuem o mesmo “esqueleto” (ou seja, forma, abstração). Ambos
recebem um funcionário e nos devolvem um double com o salário calculado. A ideia, portanto, será colocar cada uma dessas regras em classes diferentes, todas implementando a mesma interface.