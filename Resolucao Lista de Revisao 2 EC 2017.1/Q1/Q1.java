/*
a) Está relacionada à facilidade em escrever programas. A redigibilidade de programas pode conflitar, em alguns casos, com a legibilidade.
C permite a redação de comandos complexos, mas que suas funcionalidades podem não ser identificadas de maneira muito clara. As linguagens
de programação (LPs) com tipos de dados limitados requerem o uso de estruturas complexas, o que acaba dificultando a redação de programas.
A falta de declaração recursiva e de ponteiro em Visual Basic acaba limitando o seu uso para implementar programas com uso de estruturas de
árvores, listas e etc. Outro ponto na falta de redigibilidade no Visual Basic está relacionado na declaração de variáveis, onde não é 
possível declarar várias variáveis de mesmo tipo especificando o tipo somente uma vez. Por exemplo, Dim i, j , soma as integer (Nesta 
declaração somente a variável soma é do tipo integer, as demais i e j são variant, o que além de falta de redigibilidade também temos falta
de legibilidade podendo ocasionar algum efeito colateral, onde i e j podem assumir qualquer tipo de valor).

b) Essa propriedade se relaciona com os mecanismos fornecidos pela linguagem para incentivar a construção de programas confiáveis. Linguagens
de programação que possuem mecanismos de tratamento de exceções, verificação de tipos e abstrações para que o usuário não manipule diretamente 
endereços de memória através de ponteiros são, geralmente, mais confiáveis. 

A linguagem Java, por exemplo, permite tratar inúmeras exceções sem preocupar o programador com o fato de que a aplicação pode ser finalizada
inesperadamente. Isto a torna uma linguagem confiável, visto que o programador sabe que se algo estiver fora dos padrões ao menos a própria 
linguagem efetuará o tratamento, sendo mais simples ainda a manutenção desses códigos.

c) É altamente desejável que programas escritos em uma linguagem se comportem da mesma maneira independentes da ferramenta utilizada para 
traduzi-los para a linguagem de máquina ou da arquitetura computacional (hardware ou sistema operacional) sobre a qual estão sendo executados.

Dessa maneira, um mesmo programa ou biblioteca pode ser utilizado em vários ambientes e diferentes situações sem que seja necessário despender
tempo de programação para reescrevê-lo ou adaptá-lo ao novo ambiente de tradução ou execução. Contudo, essa postura pode impor algumas 
restrições à implementação das linguagens, em particular na busca por eficiência na execução dos programas. Como, por exemplo, a linguagem Java
é executada por modo híbrido, uma vez que é compilada e depois interpretada pela máquina virtual Java, isso possibilita portabilidade para 
execução em SO. Um contra exemplo é a linguagem PROLOG que pode se comportar diferente dependendo do interpretador.

d) Diz respeito à capacidade da LP permitir ao programador combinar seus conceitos básicos sem que se produza efeitos anômalos nessa
combinação. Assim uma LP é tão mais ortogonal quanto menor for o número de exceções aos seus padrões regulares. LPs ortogonais são 
interessantes porque o programador pode prever, com segurança, o comportamento de uma determinada combinação de conceitos. Isso pode ser 
feito sem que se tenha de implementar um teste para a averiguação do uso combinado de dois ou mais conceitos, ou mesmo buscar na 
especificação da LP se existe alguma restrição àquela combinação. A falta de ortogonalidade diminuiu o aprendizado da LP e pode estimular 
a ocorrência de erros de programação. Por exemplo, a desnecessidade de declaração de variáveis no Visual Basic (default tipo variant), não 
permite a declaração de várias variáveis de um mesmo tipo na mesma linha (default por referência).

C possui dois tipos de dados estruturados, arrays e registros (structs), sendo que registros podem ser retornos de funções, arrays não. 
Parâmetros são passados por valor, a menos que sejam arrays, que, obrigatoriamente, são passados por referência.

e) Simetria está relacionada a simplicidade da linguagem. Para entender simetria, basta entender o conceito de ortogonalidade. Quanto mais
ortogonal, mais simples e simétrica será a linguagem. Quanto mais exceções, mais complexa, menos ortogonal e, consequentemente, menos 
simétrica será a linguagem. Um exemplo de falta de simetria é o operador + utilizado para todos os tipos numéricos em Java. Ao somar dois
shorts ele promove para um inteiro e gera uma exceção, onde devemos utilizar o cast para evitar um erro de compilação.
*/