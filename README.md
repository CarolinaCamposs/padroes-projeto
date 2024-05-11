Implementações de Padrões de Projeto
Este repositório contém implementações de diversos padrões de projeto em Java, criadas com o objetivo de auxiliar no estudo da disciplina de Padrões de Projeto.

Estrutura do Repositório
O repositório está organizado da seguinte forma:

padroesestruturais: Este diretório contém implementações de padrões de projeto estruturais.
padroescriacionais: Este diretório contém implementações de padrões de projeto criacionais.
padroescomportamentais: Este diretório contém implementações de padrões de projeto comportamentais.

Cada diretório contém implementações de padrões específicos, conforme descrito abaixo:

Padrões Estruturais
  Adapter: Implementação do padrão Adapter, que permite a interface de uma classe existente ser usada como uma interface esperada por outra classe.
  Bridge: Implementação do padrão Bridge, que separa uma abstração de sua implementação, permitindo que ambas possam variar independentemente.
  Composite: Implementação do padrão Composite, que permite tratar objetos individuais e composições de objetos de maneira uniforme.
  Decorator: Implementação do padrão Decorator, que permite adicionar funcionalidades a objetos existentes de forma dinâmica.
  Facade: Implementação do padrão Facade, que fornece uma interface unificada para um conjunto de interfaces em um subsistema.
  Flyweight: Implementação do padrão Flyweight, que permite compartilhar eficientemente objetos que são usados com frequência.
  Proxy: Implementação do padrão Proxy, que controla o acesso a um objeto, fornecendo uma substituição ou placeholder para outro objeto.
Padrões Criacionais
  Abstract Factory: Implementação do padrão Abstract Factory, que fornece uma interface para criar famílias de objetos relacionados ou dependentes sem especificar suas classes concretas.
  Builder: Implementação do padrão Builder, que separa a construção de um objeto complexo de sua representação, permitindo a mesma construção para criar diferentes representações.
  Factory Method: Implementação do padrão Factory Method, que define uma interface para criar um objeto, mas permite às subclasses decidirem qual classe instanciar.
  Prototype: Implementação do padrão Prototype, que cria novos objetos a partir de um modelo inicial, permitindo a cópia de objetos existentes sem fazer com que o código dependa de suas classes.
  Singleton: Implementação do padrão Singleton, que garante que uma classe tenha apenas uma instância e fornece um ponto de acesso global para essa instância.
Padrões Comportamentais
  Chain of Responsibility: Implementação do padrão Chain of Responsibility, que permite passar solicitações ao longo de uma cadeia de manipuladores.
  Command: Implementação do padrão Command, que encapsula uma solicitação como um objeto, permitindo parametrizar clientes com operações, enfileirar solicitações, ou registrar solicitações em log.
  Interpreter: Implementação do padrão Interpreter, que define uma representação gramatical para um idioma e fornece um interpretador para interpretar sentenças nesse idioma.
  Iterator: Implementação do padrão Iterator, que fornece uma maneira de acessar os elementos de um objeto agregado sequencialmente, sem expor sua representação subjacente.
  Mediator: Implementação do padrão Mediator, que define um objeto que encapsula como um conjunto de objetos interage, promovendo o baixo acoplamento entre esses objetos.
  Memento: Implementação do padrão Memento, que permite capturar e restaurar o estado interno de um objeto, sem violar o encapsulamento.
  Observer: Implementação do padrão Observer, que define uma dependência um para muitos entre objetos, de modo que quando um objeto muda de estado, todos os seus dependentes são notificados e atualizados automaticamente.
  State: Implementação do padrão State, que permite que um objeto altere seu comportamento quando seu estado interno muda.
  Strategy: Implementação do padrão Strategy, que define uma família de algoritmos, encapsula cada um deles e os torna intercambiáveis.
  Template Method: Implementação do padrão Template Method, que define o esqueleto de um algoritmo em uma operação, deixando alguns passos a serem preenchidos por subclasses.
  Visitor: Implementação do padrão Visitor, que permite adicionar novas operações a uma estrutura de objetos sem modificar os objetos em si.
  
Como Utilizar
Cada implementação de padrão de projeto está contida em um pacote Java correspondente ao padrão. Dentro de cada pacote, você encontrará as classes e interfaces relacionadas ao padrão, juntamente com exemplos de uso.

Para executar os exemplos, basta importar o projeto em sua IDE Java preferida e executar os testes unitários localizados nos pacotes de teste correspondentes.
