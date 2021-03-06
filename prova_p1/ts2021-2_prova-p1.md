<div align=center>
  <img src="brasaooficialcolorido.png">
</div>

#### <p style="text-align: center;">Universidade Federal de Goiás</p>
#### <p style="text-align: center;">Instituto de Informática</p>
#### <p style="text-align: center;">Bacharelado em Engenharia de Software</p>
#### <p style="text-align: center;">Teste de Software - 2021/2</p>
#### <p style="text-align: center;">Gilmar Ferreira Arantes</p>
####  <p style="text-align: center;"> Prova P1 - 16/02/2022</p>

**Matrícula:** 201802760 </br>
**Nome:** Dener Pereira Barbosa </br>

#### 1. Quanto ao objetivo do Teste de Software, responda as duas questões seguintes:
   ##### 1.1 (**0,5 ponto**) Qual o objetivo primário da atividade de teste de software?

    O objetivo primário da atividade de teste de software é encontrar defeitos no software.

   #### 1.2 (**0,5 ponto**) O que acontece, quando não se atinge este objetivo primário?

    Caso um teste de software não revele nenhum defeito ou erro, podemos considerar dois cenários. 
    1 - O teste não foi realizado corretamente.
    2 - O software não tem nenhum defeito. 
    Entretanto, considerando a baixa possibilidade de um software sem nenhum defeito, especialmente para softwares grandes,
    podemos somente dizer que ele não tem defeitos que interferem em seu funcionamento.
    
#### 2. (**1,0 ponto**) Explique o que é o teste exaustivo e porque sua execução não é possível.

    Um teste exaustivo considera testar todas as possibilidades de entradas do software.
    Somente é possível a execução de testes exaustivos para casos com um número pequeno de entradas,
    pois quando se tem um número muito grande de entradas, um teste exaustivo pode tomar muito tempo, 
    algumas vezes até o ponto de não ser possível realizá-lo em tempo viável. 

#### 3. (**1,0 ponto**) Cite pelo menos duas limitações da Técnica de Teste Funcional e duas da Técnica de Teste Estrutural.

    Teste Funcional - Não se tem conhecimento da estrutura interna do software, somente sabendo as entradas e inferindo as saídas.
    Teste Estrutural - 

#### 4. (**1,0 ponto**) Descreva pelo menos um dos quatro níveis de teste constantes da literatura especializada.

    O teste de aceitação é elaborado de acordo com a especificação dos requisitos do software, e é relevante
    para verificar se o software está de acordo com o desejado pelo cliente.

#### 5. (**1.0 ponto**)Descreva qual o propósito do critério de teste funcional Particionamento por Classes de Equivlência.

    Ao se definir as classes de Equivalência é possível separar as possíveis entradas de um software em Válidas
    ou Inválidas, facilitando a formulação de casos de teste.

#### 6. (**1.00 ponto**) Existe algum tipo de hierarquia em relação aos critérios de teste estrutural, todos os nós, todos os arcos e todos os caminhos? Se sim, explique-a, considerando a perspectiva dos níveis de cobertura desejados.

    Para os critérios de teste estrutural 'todos os nós', 'todos os arcos' e 'todos os caminhos' existe uma
    hierarquia quanto ao grau de cobertura dos mesmos.
    
    A cobertura de casos de teste é dada por níveis, onde quanto maior o nível, maior será a abrangência do teste.
    Nível 1 - Todos os nós - Especifica que os testes devem passar por todos os nós no Grafo de Fluxo de Controle.  
    Nível 2 - Todos os arcos - Especifica que os testes devem passar por todas as Arestas no GFC.
    Nível 3 - Todos os caminhos - Especifica que os testes devem passar por todas as possíveis combinações de arestas no GFC.
       
#### 7. Considere a especificação, a seguir, de um hipotético programa que objtiva a classificação de um triângulo, a partir dos valores informados para os seus três lados.

a) Dado um triângulo cujos segmentos medem A, B e C, que são números inteiros positivos na faixa de 0 a 100. Esse triângulo somente existirá se: (A + B < C) ou (A + C < B) ou (B + C < A).
   
b) Quanto às medidas dos seus lados o triângulo, poderá ser classicado em:
         • Isósceles = quando possui dois lados com a mesma medida;
         • Escaleno = quando todos os seus lados têm medidas diferentes;
         • Equilátero = quando todos os lados tem a mesma medida;
         • Acutângulo = quando o quadrado de um dos seus lados é menor que a soma do quadrado dois outros dois. (A<sup>2</sup> < B<sup>2</sup> + C<sup>2</sup>).
         • Retângulo: quando o quadrado de um dos seus lados é igual à soma do quadrado dois outros dois. (A<sup>2</sup> = B<sup>2</sup> + C<sup>2</sup>).
         • Obtusângulo: quando o quadrado de um dos seus lados é maior que a soma do quadrado dois outros dois. A<sup>2</sup> > B<sup>2</sup> + C<sup>2</sup>.

##### 7.1 (**2.0 pontos**) Definir uma tabela de decisão para o teste tanto da existência do triângulo, quanto para a definição do seu tipo. Consulte exemplo de tabela de decisão na tarefa 005.

<div align=center>
  <img src="Tabela de Decisao.png">
  
  Eu utilizei as condições originais(erradas) de existência de um triângulo, onde um triângulo somente irá existir caso todas elas sejam falsas, e portanto 
  eu omiti os casos onde qualquer uma delas fosse verdadeira. 
  As partes vermelhas são impossibilidades. 

  
</div>

##### 7.2 (**2.0 pontos**) Criar os conjunto de casos de teste necessários para a cobertura das combinações constantes da tabela de decisão, seguindo o seguinte padrão:
|CT |Lado A|Lado B|Lado C|Resultado|
|---|---|---|---|---|
|CT01| 1  | 2  | 4  | Não Existe |
|CT02| 2  | 9  | 4  | Não Existe |
|CT03| 8  | 2  | 3  | Não Existe |
|CT04| 5  | 5  | 5  | Equilátero |
|CT05| 5  | 5  | 3  | Isósceles  |
|CT06| 8  | 4  | 8  | Isósceles  |
|CT07| 6  | 6  | 2  | Isósceles  |
|CT08| 3  | 4  | 5  | Escaleno   |


INSTRUÇÕES:
1. Tipo: Prova individual;
2. Local de Entrega: Plataforma Turing
3. Forma de Entrega: Entregar este arquivo, editado com suas respostas, no formato .md, nominado da seguinte forma: ts2021-2_prova-p1_mat.md, onde mat deverá ser substituído pelo número da sua matrícula.
4. **Entrega diferente da especificada não será avaliada.**
5. Data da Entrega: 22/02/2022, as 23h59min.
6. Critério de Aceitação: arquivo entregue, conforme solicitado.
