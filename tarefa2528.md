## Tarefa 005 - 08/02/2022 - Grafo de Causa e Efeito / Tabela de Decisão.

1.Considere o seguinte cenário: Uma corretora de seguros concede desconto sobre o prêmio anual de seguro de automóvel, aos seus segurados conforme as regras a seguir:
|Sexo|Idade (anos)|Estado Civil|Desconto (%)|
|---|---|---|---|
|Masculino|< 25|Solteiro|0|
|Masculino|< 25|Casado|5|
|Masculino|> 25|Solteiro|10|
|Masculino|> 25|Casado|15|
|Feminino|< 25|Solteira|5|
|Feminino|< 25|Casada|10|
|Feminino|> 25|Solteira|15|
|Feminino|> 25|Casada|20|

2. Solicita-se:
   1. Geração do grafo de causa e efeito para representar este cenário.
      >![Image](https://github.com/Dener-arx/ts-2021-2/blob/main/images/Grafo%20Causa%20e%20Efeito.png)
   2. Geração da tabela de decisão para representar o cenário.
      >![Image](https://github.com/Dener-arx/ts-2021-2/blob/main/images/Tabela%20de%20Decis%C3%A3o.png)
   3. Geração do conjunto de casos de teste suficientes para cobrir todos os cenários, constantes do grafo e da tabela de decisão.
      1. Editar este arquivo e adicionar a tabela com os casos de teste, conforme exemplos disponibilizados em tarefas anteriores.        
       
      **Casos de Teste**

         |  CT  |          Valor de Entrada                                |  Resultado Esperado  |
         |--|---|---|---|
         | CT01 | Sexo = Feminino, Idade < 25, Estado Civil = Solteiro(a)  | R$ 1.900,00          |
         | CT01 | Sexo = Feminino, Idade < 25, Estado Civil = Casado(a)    | R$ 1.900,00          |
         | CT01 | Sexo = Feminino, Idade = 25, Estado Civil = Solteiro(a)  | R$ 1.900,00          |
         | CT01 | Sexo = Feminino, Idade = 25, Estado Civil = Casado(a)    | R$ 1.900,00          |
         | CT01 | Sexo = Feminino, Idade > 25, Estado Civil = Solteiro(a)    | R$ 1.900,00          |
         | CT01 | Sexo = Feminino, Idade > 25, Estado Civil = Casado(a)    | R$ 1.900,00          |
         
         
   4. Em relação aos casos de teste, considere o valor do seguro de R$ 2.000,00 (Dois mil reais). Desta forma, o valor esperado, do resultado do caso de teste, deve ser o valor líquido a ser pago. Ou seja, o prêmio deduzido do valor correspondente ao percentual do desconto obtido pelo cliente.
INSTRUÇÕES:
1. Tipo: Tarefa Individual;
2. Local de Entrega: Repositório pessoal, no github. O arquivo a ser entregue é este mesmo, editado com a inclusão dos dados solicitados.
3. Data da Entrega: 14/02/2022, as 23h59min.
4. Critério de Aceitação: Arquivo entregue com os dados solicitados.
