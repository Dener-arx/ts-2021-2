
## Tarefa 003 - 21/12/2021 - Definição de Classes de Equivalência.

**DEFINIÇÃO**:
1. Definir um conjunto de classes de Equivalência e um conjunto de casos de testes derivados, para testar a seguinte função de avaliação universitária.
2. A função avalicao, recebe como parâmtros os seguintes dados:
   2.1. **nota1** (numérico de ponto flutuante com duas casas decimais);
   2.2. **nota2**  (numérico de ponto flutuante com duas casas decimais);
   2.3. **cargaHoraria** (numérico inteiro, positivo);
   2.4. **faltas** (numérico inteiro, positivo).
3. A forma de calcular a avaliação é a seguinte:
  3.1. Se a quantidade de faltas for superior a 25% da carga horária, o aluno estará reprovado por falta. Neste caso a função retorna a seguinte mensagem **Reprovado por Falta**;
  3.2. Estando o aluno reprovado por falta, não haverá a necessidade de se avaliar as notas;
  3.2. Se a média entre nota1 e nota2 for menor que 3.0, o aluno estará reprovado por média.  Neste caso a função retorna a seguinte mensagem **Reprovado por Média**;
  3.3. Se a média entre nota1 e nota2 for >= 3.0 e < 6.0, o aluno estará em recuperação.  Neste caso a função retorna a seguinte mensagem **Recuperação**;
  3.4 Em qualquer outra situação o aluno estará  aprovado. Então a função retornará a mensagem: **Aprovado**.
4. O Conjunto de classes de Equivalência deverá ser definido seguindo o seguinte padrão:

**Resposta:**
**Antes da definição das classes de equivalência vamos assumir que a informação de valores para todas as quatro variáveis, é obrigatória. Ou seja, nenhuma destas variáveis pode ter seu conteúdo não informado, quando isso ocorrer deve apresenntar a mensagem "Valores Inválidos".**

a) Primeiramente pensemos em termos da quantidade de parâmetros de entrada. Seja **QP** a quantidade de parâmetros, que é igual a 4, conforme especificado. Desta forma teremos:

|id|descrição|V/I|E/S|
|--|--|--|---|
|CE01|QP < 4|I|E|
|CE02|QP = 4|V|E|
|CE03|QP > 4|I|E|

b) Analisando particularmente a varíavel de entrada **nota1**, a primeira consideração é se o valor para a variável foi informado ou não. Sendo assim, teremos:
|id|descrição|V/I|E/S|
|--|--|--|---|
|CE04|valor informado para nota1|V|E|
|CE05|valor não informado para nota1|I|E|

b1) A segunda consideração a respeito de **nota1**, diz respeito aos valores possíveis para esta variável. Sendo assim, assumimos que ela pode assumir valores no intervalo entre 0.00 e 10.00, que é o valor esperado para uma nota em avaliação escolar. Desta forma teremos:
|id|descrição|V/I|E/S|
|--|--|--|---|
|CE06|nota1 < 0.00|I|E|
|CE07|0.00 <= nota1 <= 10.00|V|E|
|CE08|nota1 > 10.00|I|E|

b2) Considerando que está especificado que a quantidade de casas decimais para a variável **nota1** é igual a duas. Chamaremos de **qcdn1** (_quantidade de casas decimais da variável nota1_) esta quantidade de casas decimais, então teremos:
|id|descrição|V/I|E/S|
|--|--|--|---|
|CE09|qcdn1 < 2|I|E|
|CE10|qcdn1 = 2|V|E|
|CE11|qcdn1 > 2|I|E|

b3) Considerando o tipo de dado da variável **nota1**, assumimos que este tipo seja **double**, então definimos **tdn1** _(tipo de dado da variável nota1)_ para representar este valor, desta forma teremos:
|id|descrição|V/I|E/S|
|--|--|--|---|
|CE12|tdn1 <> double|I|E|
|CE13|tdn1 = double|V|E|

Todas as definições de classes de equivalência, referentes à variável de entrada **nota1** se repetem para as demais. Desta forma teremos:

c) Quanto ao valor da variável **nota2**, temos:
|id|descrição|V/I|E/S|
|--|--|--|---|
|CE14|valor informado para nota2|V|E|
|CE15|valor não informado para nota2|I|E|


c1) Intervalo de valores da variável **nota2**:
|id|descrição|V/I|E/S|
|--|--|--|---|
|CE16|nota2 < 0.00|I|E|
|CE17|0.00 <= nota2 <= 10.00|V|E|
|CE18|nota2 > 10.00|I|E|

c2) **qcdn2** _(quantidade de casas decimais da variável **nota2**)_:
|id|descrição|V/I|E/S|
|--|--|--|---|
|CE19|qcdn2 < 2|I|E|
|CE20|qcdn2 = 2|V|E|
|CE21|qcdn2 > 2|I|E|

c3) **double** é o tipo de dado da variável **nota2**, então **tdn2** _(tipo de dado da variável nota2)_ será:
|id|descrição|V/I|E/S|
|--|--|--|---|
|CE22|tdn2 <> double|I|E|
|CE23|tdn2 = double|V|E|

d) c) Quanto ao valor da variável **cargaHoraria**, temos:
|id|descrição|V/I|E/S|
|--|--|--|---|
|CE24|valor informado para cargaHoraria|V|E|
|CE25|valor não informado para cargaHoraria|I|E|

d1) Definição de valores da variável **cargaHoraria**, que nominaremos a seguir de **(ch)**. Convencionamos o conjunto de valores **ch** para esta variável, que é dado por **ch = {32, 64, 96 e 128}**. chamaremos de **vch**, o valor informado para esta variável, desta forma teremos:
|id|descrição|V/I|E/S|
|--|--|--|---|
|CE26|vch não pertence a ch|I|E|
|CE27|vch pertence a ch|V|E|

d2) Assumimos que o tipo de dado da variável **vch** é **int**, então teremos:
|id|descrição|V/I|E/S|
|--|--|--|---|
|CE28|vch <> int|I|E|
|CE29|vch = int|V|E|

e) d) c) Quanto ao valor da variável **faltas**, temos:
|id|descrição|V/I|E/S|
|--|--|--|---|
|CE30|valor informado para faltas|V|E|
|CE31|valor não informado para faltas|I|E|

e1) Em relação à quantidade de faltas, definimos **qtf** para representar o valor desta variável, então teremos:
|id|descrição|V/I|E/S|
|--|--|--|---|
|CE32|qtf < 0|I|E|
|CE33|qtf <= 25% de vch|V|E|
|CE34|qtf > 25% de vch|V|E|
|CE35|qtf > vch|I|E|

e2) Em Assumimos que o tipo de dado da variável **faltas** é **int**, então teremos:
|id|descrição|V/I|E/S|
|--|--|--|---|
|CE36|qtf <> int|I|E|
|CE37|qtf = int|V|E|

Em Relação às variáveis de entrada, as classes de equivalência são essas. No entando é conveniente definirmos classes de equivalência para os possíveis valores de saída. Neste caso teremos as seguintes classes:
|id|descrição|V/I|E/S|
|--|--|--|---|
|CE38|"Valores Inválidos"|V|S|
|CE39|"Reprovado por Falta"|V|S|
|CE40|"Reprovado por Média"|V|S|
|CE41|"Recuperação"|V|S|
|CE42|"Aprovado"|V|S|

**OBS**: Embora esta expressão "Valores Inválidos" não conste da especificação, por falha desta, a CE38 foi criada, pois para cada caso de teste que tiver um valor inválido para alguma váriável, deverá ter esta expressão como saída.

5. Conjunto de casos de testes, suficientes para exercitar todas as classes de equivalência. Para a criação dos casos de teste vamos considerar a ordem de entradas, na mesma ordem em que são apresentadas na especificação, ou seja: **nota1**, **nota2**, **cargaHoraria** e **faltas**.

1. Os primeiros casos de teste vão objetivar validar a entrada de três parâmetros. Serão quatro casos de testes, em cada um deles a informação de uma das variáveis será omitida.

|CT|Valor de Entrada|Resultado Esperado|Classe Equivalência|
|--|--|--|--|
|CT01|,7.00,32,8|"Valores Inválidos"|CE01,CE05,CE14,CE17,CE20,CE23,CE24,CE27,CE29,CE30,CE33,CE37,CE38|
|CT02|7.00,,32,8|"Valores Inválidos"|CE01,CE04,CE07,CE10,CE13,CE15,CE24,CE27,CE29,CE30,CE33,CE37,CE38|
|CT03|7.00,4.00,,8|"Valores Inválidos"|CE01,CE04,CE07,CE10,CE13,CE14,CE17,CE20,CE23,CE25,CE30,CE34,CE37,CE38|
|CT04|7.00,4.00,32,|"Valores Inválidos"|CE01,CE04,CE07,CE10,CE13,CE14,CE17,CE20,CE23,CE24,CE27,CE29,CE31,CE38|

2. O próximo caso de teste, validará o cenário em que mais de quatro parâmetros são informados.

|CT|Valor de Entrada|Resultado Esperado|Classe Equivalência|
|--|--|--|--|
|CT05|4.00,7.00,32,8,15|"Valores Inválidos"|CE03,CE04,CE07,CE10,CE13,CE14,CE17,CE20,CE23,CE24,CE27,CE29,CE30,CE33,CE37,CE38|

3. Os próximos quatro casos de testes validarão os cenários em que cada uma das variáveis receberá um valor negativo.

|CT|Valor de Entrada|Resultado Esperado|Classe Equivalência|
|--|--|--|--|
|CT06|-4.00,7.00,32,8|"Valores Inválidos"|CE02,CE04,CE06,CE10,CE13,CE14,CE17,CE20,CE23,CE24,CE27,CE29,CE30,CE33,CE37,CE38|
|CT07|4.00,-7.00,32,8|"Valores Inválidos"|CE02,CE04,CE07,CE10,CE13,CE14,CE16,CE20,CE23,CE24,CE27,CE29,CE30,CE33,CE37,CE38|
|CT08|4.00,7.00,-32,8|"Valores Inválidos"|CE02,CE04,CE07,CE10,CE13,CE14,CE17,CE20,CE23,CE24,CE26,CE29,CE30,CE33,CE37,CE38|
|CT09|4.00,7.00,32,-8|"Valores Inválidos"|CE02,CE04,CE07,CE10,CE13,CE14,CE17,CE20,CE23,CE24,CE27,CE29,CE30,CE32,CE37,CE38|

4. Os próximos quatro casos de testes validarão os cenários em que cada uma das variáveis receberá um valor diferente diferente do seu tipo de dado.

|CT|Valor de Entrada|Resultado Esperado|Classe Equivalência|
|--|--|--|--|
|CT10|4,7.00,32,8|"Valores Inválidos"|CE02,CE04,CE07,CE09,CE12,CE14,CE17,CE20,CE23,CE24,CE27,CE29,CE30,CE33,CE37,CE38|
|CT11|4.00,7,32,8|"Valores Inválidos"|CE02,CE04,CE07,CE10,CE13,CE14,CE17,CE19,CE22,CE24,CE27,CE29,CE30,CE33,CE37,CE38|
|CT12|4.00,7.00,32.00,8|"Valores Inválidos"|CE02,CE04,CE07,CE10,CE13,CE14,CE17,CE20,CE23,CE24,CE26,CE28,CE30,CE33,CE37,CE38|
|CT13|4.00,7.00,32,8.00|"Valores Inválidos"|CE02,CE04,CE07,CE10,CE13,CE14,CE17,CE20,CE23,CE24,CE27,CE29,CE30,CE33,CE36,CE38|

4. Os próximos quatro casos de testes validarão os cenários em que cada uma das variáveis receberá um valor acima do limite definido como superior.

|CT|Valor de Entrada|Resultado Esperado|Classe Equivalência|
|--|--|--|--|
|CT14|11.00,7.00,32,8|"Valores Inválidos"|CE02,CE04,CE08,CE10,CE13,CE14,CE17,CE20,CE23,CE24,CE27,CE29,CE30,CE33,CE37,CE38|
|CT15|4.00,15.00,32,8|"Valores Inválidos"|CE02,CE04,CE07,CE10,CE13,CE14,CE18,CE20,CE23,CE24,CE27,CE29,CE30,CE33,CE37,CE38|
|CT16|4.00,7.00,250,8|"Valores Inválidos"|CE02,CE04,CE07,CE10,CE13,CE14,CE17,CE20,CE23,CE24,CE26,CE28,CE30,CE33,CE37,CE38|
|CT17|4.00,7.00,32,35|"Valores Inválidos"|CE02,CE04,CE07,CE10,CE13,CE14,CE17,CE20,CE23,CE24,CE27,CE29,CE30,CE34,CE35,CE36,CE38|

5. Os próximos dois casos de teste validarão os cenários em que as variáveis nota1 e nota2, receberão valores com menos de duas casas decimais.

|CT|Valor de Entrada|Resultado Esperado|Classe Equivalência|
|--|--|--|--|
|CT18|4.0,7.00,32,8|"Valores Inválidos"|CE02,CE04,CE07,CE09,CE13,CE14,CE17,CE20,CE23,CE24,CE27,CE29,CE30,CE33,CE37,CE38|
|CT19|4.00,7.0,32,8|"Valores Inválidos"|CE02,CE04,CE07,CE10,CE13,CE14,CE17,CE19,CE23,CE24,CE27,CE29,CE30,CE33,CE37,CE38|

6. Os próximos dois casos de teste validarão os cenários em que as variáveis nota1 e nota2, receberão valores com mais de duas casas decimais.

|CT|Valor de Entrada|Resultado Esperado|Classe Equivalência|
|--|--|--|--|
|CT20|4.000,7.00,32,8|"Valores Inválidos"|CE02,CE04,CE07,CE11,CE13,CE14,CE17,CE20,CE23,CE24,CE27,CE29,CE30,CE33,CE37,CE38|
|CT21|4.00,7.000,32,8|"Valores Inválidos"|CE02,CE04,CE07,CE10,CE13,CE14,CE17,CE21,CE23,CE24,CE27,CE29,CE30,CE33,CE37,CE38|

7. O próximo caso de teste validará o cenário em que o aluno é reprovado por faltas.
|CT|Valor de Entrada|Resultado Esperado|Classe Equivalência|
|--|--|--|--|
|CT22|4.00,7.00,32,10|"Reprovado por Faltas"|CE02,CE04,CE07,CE11,CE13,CE14,CE17,CE20,CE23,CE24,CE27,CE29,CE30,CE34,CE37,CE39|

8. O próximo caso de teste validará o cenário em que o aluno é reprovado por média.

|CT|Valor de Entrada|Resultado Esperado|Classe Equivalência|
|--|--|--|--|
|CT23|2.00,1.00,32,8|"Reprovado por Media"|CE02,CE04,CE07,CE11,CE13,CE14,CE17,CE20,CE23,CE24,CE27,CE29,CE30,CE33,CE37,CE40|

9. O próximo caso de teste validará o cenário em que o aluno estará em recuperação.

|CT|Valor de Entrada|Resultado Esperado|Classe Equivalência|
|--|--|--|--|
|CT24|4.00,5.00,32,8|"Recuperação"|CE02,CE04,CE07,CE11,CE13,CE14,CE17,CE20,CE23,CE24,CE27,CE29,CE30,CE33,CE37,CE41|

10. O próximo caso de teste validará o cenário em que o aluno estará aprovado.

|CT|Valor de Entrada|Resultado Esperado|Classe Equivalência|
|--|--|--|--|
|CT24|6.00,8.00,32,8|"Aprovado"|CE02,CE04,CE07,CE11,CE13,CE14,CE17,CE20,CE23,CE24,CE27,CE29,CE30,CE33,CE37,CE42|

11. Para analisar a cobertura de quantos e quais casos de testes exercitam cada classe de equivalência, consultem o arquivo ctxce.ods.
