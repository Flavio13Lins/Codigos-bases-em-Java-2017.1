/*
a) Os modificadores de acesso definem a visibilidade externa de um atributo ou de um método. Ou seja, eles definem os objetos
externos que podem visualizar e alterar os atributos e os que podem invocar algum método do objeto.

b) Dependendo dos modificadores de acesso (private, por exemplo), alguns atributos podem ficar completamente inacessíveis.
Então, para permitir o acesso a esses atributos de uma maneira controlada, a prática mais comum é criar dois tipos de métodos, um
que retorna o valor (getter) e outro que modifica/seta o valor (setter).

c) O construtor da classe é um bloco declarado com o mesmo nome que a classe e é semelhante a uma rotina de inicialização que é 
chamada sempre que um novo objeto é criado. O construtor não é um método pois só é chamado uma vez para cada objeto e não 
retorna nada. Entretanto, o construtor pode receber argumentos e pode haver mais de um construtor por classe (desde que cada um
receba parâmetros diferentes). O construtor dá a possibilidade/obriga o usuário a passar argumentos para o objeto durante o 
processo de criação do mesmo.

d) Através do mecanismo de sobrecarga, dois ou mais métodos de uma classe podem ter o mesmo nome, desde que suas assinaturas
sejam diferentes. Tal situação não gera conflito, pois o compilador é capaz de detectar qual método deve ser escolhido a partir da 
análise dos tipos dos parâmetros do método. 

O mecanismo de redefinição de métodos é utilizado para redefinir/sobrescrever métodos nas classes derivadas de forma que eles 
possam ter um comportamento diferente da sua classe ancestral. É imprescindível que o método reescrito tenha exatamente a mesma 
assinatura do método definido na superclasse. Esse mecanismo de redefinição é muito diferente do mecanismo de sobrecarga de 
métodos, onde as listas de argumentos são diferentes.
*/