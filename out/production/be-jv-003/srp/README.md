Os principios SOLID são os seguintes:

S.O.L.I.D. são princípios de design que nos ajudam a desacoplar classes e aumentar a coesão entre elas, 
de forma que passamos a organizar e estruturar melhor nosso projeto e principalmente criar estruturas de códigos de fácil compreensão, 
tornando o código mais eficiente e tolerante a mudanças.

*SRP* - Princípio da Responsabilidade Única (Single Responsability Principle), 
“Uma classe deve ter apenas uma única razão para mudar.”
esse princípio segue a lei de Conway: “Organizações que desenvolvem sistemas de software tendem a produzir sistemas 
que são cópias das estruturas de comunicação dessas organizações”, assim cada módulo possui uma única razão para mudar.

*OCP* - Princípio do Aberto/Fechado (Open Closed Principle), esse princípio surgiu a partir de uma publicação de 
Bertrand Meyer no ano de 1988, no qual ele diz que os sistemas de software devem ser facéis de mudar, 
apenas pela adição de um novo código e não pela alteração do código existente.

*LSP* - Princípio de substituição de Liskov (Liskov Substitution Principle), trata da definição de subtipos, 
em uma publicação de Barbara Liskov em 1988, onde ela diz que se duas classes possuem o mesmo tipo, 
ou seja herdam a mesma classe, uma classe pode ser substituida pela outra.

*ISP* - Princípio da Segregação de Interface (Interface Segregation Principle), 
basicamente nos diz que não devemos depender de coisas que não iremos utilizar.

*DIP* - Princípio da inversão de dependência (Dependency Inversion Principle), Segundo Robert C. Martin (2019), 
o código que implementa uma política de alto nível não deve depender do código que implementa detalhes de nível mais baixo. 
São detalhes que devem depender das politícas.


## Princípio da Responsabilidade Única (Single Responsability Principle)

“Uma classe deve ter apenas uma única razão para mudar.”
Princípio descrito no trabalho de Tom DeMarco e Meilir Page-Jones.

Chamado de coesão, uma classe não deve assumir responsabilidades que não são suas.

Uma vez sendo ignorado este princípio, passamos a ter problemas, como dificuldades de manutenção e de reuso.

## Princípio do Aberto/Fechado (Open Closed Principle)
“As oportunidades multiplicam-se à medida que são agarradas.” Sun Tzu

O princípio surgiu em 1988 por Bertrand Meyer, em sua publicação Object-Oriented Software Construction, dizendo que:

“Um artefato de software deve ser aberto para extensão, mas fechado para modificação”

“… aberto para extensão”

Para que a aplicação evolua as classes devem ser passíveis de extensão, de forma que novas classes possam estender seu comportamento.
Ou adicionar um novo comportamento aquela classe.

“… fechado para modificação”

Em vista da manutenção do código, pensaremos em um bom design de código onde para uma nova funcionalidade,
a quantidade de alteração de código deverá ser mínima, onde 0 seria o ideal e não teríamos alterações em uma classe
já existente e sim estender uma classe já existente.
### Exemplo

![](../../../../../../Users/Caue_/Downloads/Pessoa.drawio.png)

Agora os nossos funcionários devem ser capazes de enviar notificações quando solicitado
Para cada classe de funcionario deve existir um metodo de notificação diferente
SMS, EMAIL, SLACK, WHATSAPP e DISCORD

Mudanças de requisitos

1. Estagiario deve enviar notificação via Email
2. Analista deve enviar notificação via Slack
3. Secretaria envia informações via SMS
4. RH envia notificação via WhatsApp 