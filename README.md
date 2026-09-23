# Padroes_Padaria

## Antonio Mario Jesus Vidal Leite e Lucas Matheus Elias Silva Teixeira dos Santos

prompt 1:

Vamos resolver agora a outra atividade, e quero que você aja da mesma forma que resolvemos a primeira, a questao é sobre o padrao decorator em uma padaria em java. vou te mandar os arquivos para voce analisar, vou te dizer o que temos que fazer: criar um novo bolo: Acrescente um novo tipo de bolo: bolo de morango (em inglês, strawberry cake), que
custa o dobro de um bolo padrão. e Criar uma classe decorator pros bolos

resposta 1:

Olá! Bacana, o padrão Decorator encaixa perfeitamente nesse cenário da padaria, pois permite que a gente "enrole" o bolo com novas características sem precisar alterar as classes originais.
A sua primeira missão é montar a "espinha dorsal" do padrão. O conceito chave do Decorator é que um decorador precisa ser do mesmo tipo do objeto original e, ao mesmo tempo, guardar uma referência para ele. Isso é o que permite empilharmos várias decorações umas sobre as outras.
Aqui está o direcionamento para você codificar:
A Classe Decorator: Crie uma classe abstrata (você pode chamar de CakeDecorator) que herde de Cake. O grande segredo aqui é o construtor: faça essa classe receber um objeto Cake por parâmetro e guardá-lo como um atributo da classe. Em seguida, sobrescreva os métodos getCost() e getDescription() para que eles apenas repassem a chamada para o bolo que está guardado internamente (delegação).
O Bolo de Morango (StrawberryCake): Esse é um caso mais simples, pois ele atua como um bolo base, igualzinho ao de chocolate ou baunilha, então ele não é um decorador. Basta criar a classe herdando de Cake diretamente. Para a regra do preço, sobrescreva o método getCost() e defina a lógica matemática para que ele custe o dobro do bolo padrão.
Tente criar essa base no seu código. Assim que você estruturar essas duas classes, me mande um aviso.

prompt 2:

Criei os arquivos. Agora eu preciso criar as classes específicas das coberturas: Para bolos de várias camadas, adicione $5 e imprima "Multi-layered" na frente
do nome.
○ Para granulado, adicione $2 e imprima "with sprinkles" no final do nome.
○ Para um bolo com o dizer X, não adicione nada ao custo e imprima "with saying
'X''" no final do nome.

resposta 2:

Excelente! Agora que você tem a espinha dorsal com a classe CakeDecorator, criar as coberturas fica muito metódico e natural.
Cada uma dessas coberturas será uma classe separada que herda do seu CakeDecorator. O pulo do gato no padrão Decorator é usar o super. Em vez de reescrever o comportamento, você "amplia" o que já existe: você chama o método do pai (ex: super.getCost()) e soma a sua nova modificação por cima.
Aqui estão as diretrizes para você estruturar cada uma:

1. MultiLayered:
   No método de custo, retorne o valor do super + 5.
   Na descrição, concatene a string "Multi-layered " antes do texto que vier do super (afinal, o enunciado pede na frente do nome).
2. Sprinkles:
   Na mesma lógica, adicione 2 ao retorno do custo do super.
   Na descrição, concatene a string " with sprinkles" depois do texto original do bolo.
3. Saying:
   Esse tem um detalhe extra: como a mensagem é dinâmica, essa classe vai precisar ter um atributo próprio (por exemplo, String text).
   O construtor dela precisará receber dois parâmetros: o bolo que está sendo decorado e a string da mensagem.
   O custo não sofre alteração, então você nem precisa sobrescrever o método getCost() (ele vai naturalmente herdar o repasse do CakeDecorator).
   Na descrição, concatene o final exatamente como o texto pediu: " with saying '" + sua variavel + "'.
   Crie essas três classes na sua IDE. Quando terminar, vá para a classe Main e brinque de empilhar esses objetos (por exemplo, instanciando um Saying que recebe um Sprinkles, que por sua vez recebe um VanillaCake).
