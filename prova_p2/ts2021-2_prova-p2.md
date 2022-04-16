<div align=center>
  <img src="brasaooficialcolorido.png">
</div>

#### <p style="text-align: center;">Universidade Federal de Goiás</p>
#### <p style="text-align: center;">Instituto de Informática</p>
#### <p style="text-align: center;">Bacharelado em Engenharia de Software</p>
#### <p style="text-align: center;">Teste de Software - 2021/2</p>
#### <p style="text-align: center;">Gilmar Ferreira Arantes</p>
####  <p style="text-align: center;"> Prova P2 - 12/04/2022</p>

Matrícula: 201802760

Nome: Dener Pereira Barbosa


### 1. Quanto ao Processo de Teste de Software, responda as duas questões seguintes:
   #### 1. (**0,5 ponto**) Defina os seguintes conceitos Processo de Teste de Software, Projeto de Teste de Software e Plano de Teste de Sofware.
   
   - **Processo de Teste de Software:** O processo de teste de software estabele em alto nivel como deve ser realizado todo o processo de teste de software, definindo etapas, atividades que compõem cada etapa, bem como artefatos que devem ser entregues ao final de cada atividade.
   - **Projeto de Teste de Software:** O projeto de teste estabece como os testes em sí devem ser realizados, definindo metodos e estrategias de teste, bem como resultados esperados e aceitaveis. 
   - **Plano de Teste de Software:** O plano de teste estabelece em um nível mais tecnico como deve ser realizado o processo de teste, definindo o escopo, custos, prazos, ferramentas, equipe e papeis, riscos, entre outras coisas.
     
   #### 2. (**0,5 ponto**) Descreva o relacionamento existente entre estes conceitos.
   
   Dentre os tres conceitos, O Processo de Teste é o mais amplo, englobando ambos os outros, que podem ser considerados etapas do mesmo. </br>
   
   Enquanto o Processo de Teste pode ser um tipo de guia de como todo o processo de teste deve ser realizado, o Plano de Teste, um artefato obtido da etapa de Planejamneto do Processo de Teste, define especificações, restrições e estimativas concretas para sua implementação, adaptando o processo conforme necessidade da empresa. </br>
   
   O Projeto de Teste, por sua vez, é uma etapa posterior ao planejamento, e é responsável pela elaboração dos testes, seguindo as especificações e limitações estabelecidas durante o planejamento. 
       
### 2. (**1,0 pontos**) Descreva as vantagens para a equipe de desenvolvimento ao se adotar um processo de teste ágil.
  
  Um processo de teste agil conta com o envolvimento de um tecnico de QA durante toda a etapa de desenvolvimento do software, o que torna mais fácil a prevenção de erros no software, sendo este um dos 5 principios dos testes ageis, 'Prevenir erros ao inves de encontrar erros.' 
  Uma outra grande vantagem de testes ageis é a automatização de testes, que torna a execução de testes de regressão muito mais rápidos.

### 3. (**1,0 ponto**) Cite pelo menos três características do Teste Exploratório.

  - Testes exploratórios não seguem um plano. O testador tenta agir como se fosse um usuário.
  - Testes exploratórios são comumente usados quando não se tem a documentação do software, entretanto não tendo a documentação referente as funcionalidades e/ou restrições do software, não se pode garantir uma boa cobertura de testes.
  - 

### 4. Considere os arquivos .java (Banco.java, Agencia.java, Conta.java e BankValidator.java). Nos próprios arquivos .java estão definidas as regras para cadastramento de cada um deles (Banco, Agencia e Conta). Desta forma, pede-se:
   #### 1. (2.0 Pontos) Definir os cenários de teste suficientes para testar o cadastro e movimentações financeiras envolvendo bancos, agências e contas, conforme especificado. Para cada cenário definir os critérios de teste adequados à definição dos seus casos de teste.

**Banco**
|  ID  |           Descrição                          | V/I |
|--|----|---|
| CE01 | numero > 0                                   | V |
| CE02 | numero <= 0                                  | I |
| CE03 | numero = tres digitos                        | V |
| CE04 | numero != tres digitos                       | I |
| CE05 | nome < 5 caracteres                          | I |
| CE06 | nome de 5 a 100 caracteres                   | V |
| CE07 | nome > 100 caracteres                        | I |

**Agencia**
|  ID  |           Descrição                          | V/I |
|--|----|---|
| CE01 | numero < 3 digitos                           | I |
| CE02 | numero de 3 a 5 digitos                      | V |
| CE03 | numero > 5 digitos                           | I |
| CE04 | nome < 5 caracteres                          | I |
| CE05 | nome de 5 a 100 caracteres                   | V |
| CE06 | nome > 100 caracteres                        | I |
| CE07 | cidade < 5 caracteres                        | I |
| CE08 | cidade de 5 a 100 caracteres                 | V |
| CE09 | cidade > 100 caracteres                      | I |

**Conta**
|  ID  |           Descrição                          | V/I |
|--|----|---|
| CE01 | numero = 6 digitos                           | V |
| CE02 | numero != 6 digitos                          | I |
| CE03 | numero com caractere não númerico            | I |
| CE04 | tipo = Cheque 'ou' tipo = Poupança           | V |
| CE05 | tipo != Cheque && tipo != Poupança           | I |
| CE06 | tipo = Cheque && limite = cheque especial    | V |
| CE07 | tipo = Cheque && limite != cheque especial   | I |
| CE08 | tipo != Poupança && limite = cheque especial | I |
   
   #### 2. (2.0) Definir os casos de teste suficientes para a cobertura do teste de cada um dos cenários definidos. Documentar os casos de teste no seguinte padrão:
   
   **Banco**
   |CT|Valores de Entrada|Resultado esperado|
   |---|---|---|
   | CT01 | numero = 111                            | OK |
   | CT02 | numero = -111                           | Valor Invalido |
   | CT03 | numero = 12                             | Valor Invalido |
   | CT04 | numero = 1234                           | Valor Invalido |
   | CT05 | nome = 'abc'                            | Valor Invalido |
   | CT06 | nome = 'abcdefgh'                       | OK |
   | CT07 | nome = '' string +100 caracteres        | Valor Invalido |
   
   **Agencia**
   |CT|Valores de Entrada|Resultado esperado|
   |---|---|---|
   | CT01 | numero = 12                            | Valor Invalido |
   | CT02 | numero = 1234                          | OK |
   | CT03 | numero = 123456                        | Valor Invalido |
   | CT04 | nome = 'abc'                           | Valor Invalido |
   | CT05 | nome = 'abcdefgh'                      | OK |
   | CT06 | nome = '' string +100 caracteres       | Valor Invalido |
   | CT07 | cidade = 'abc'                         | Valor Invalido |
   | CT08 | cidade = 'abcdefgh'                    | OK |
   | CT09 | cidade = '' string +100 caracteres     | Valor Invalido |
   
   **Conta**
   |CT|Valores de Entrada|Resultado esperado|
   |---|---|---|
   | CT01 | numero = 12345                                  | Valor Invalido |
   | CT02 | numero = 123456                                 | OK |
   | CT03 | numero = 1234567                                | Valor Invalido |
   | CT04 | numero = AAAAAA                                 | Valor Invalido |
   | CT05 | tipo = 'Cheque'                                 | OK |
   | CT06 | tipo = 'Poupança'                               | OK |
   | CT07 | tipo = 'Outros'                                 | Valor Invalido |
   | CT08 | tipo = 'Cheque' && limite = 'cheque especial'   | OK |
   | CT09 | tipo = 'Cheque' && limite = 'Outros'            | Valor Invalido |
   | CT10 | tipo = 'Poupança' && limite = 'cheque especial' | Valor Invalido |
   
   #### 3. (3.0 Pontos) Implementar (na linguagem de programação java) as classes para o teste da criação dos objetos e das movimentações financeiras envolvendo bancos e agências e contas.


INSTRUÇÕES:
1. Tipo: Prova individual;
2. Local de Entrega: Plataforma Turing.
3. Forma de Entrega: arquivo compactado contendo:
   1. Este arquivo md, respondido.
   2. Classes de teste para (BancoTest, AgenciaTest e ContaTest);
   3. O arquivo compactado deverá ter o seguinte nome prova_p2<mat>.zip, onde mat é o número da matrícula do aluno(a).
5. Data da Entrega: 12/04/2022, as 22hs.
6. Critério de Aceitação: arquivo entregue, conforme solicitado.
7. Obs: segue no mesmo pacote o arquivo "org.apache.commons.lang.StringUtils", que é uma dependência do projeto. É deve ser inserida no _classpath_ do projeto de implementação da questão 4, caso não esteja utilizando o _maven_.
