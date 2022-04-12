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
   
   Processo de Teste de Software: Define etapas, artefatos a serem entregues, 
   Projeto de Teste de Software: Estabelece metodos de teste/ resultados
   Plano de Teste de Software: Prazo, Custo, Ferramentas, etc.
   
   #### 2. (**0,5 ponto**) Descreva o relacionamento existente entre estes conceitos.
   
   O Processo de Teste envolve tudo relacionado aos testes. O plano de teste é desenvolvido durante uma das etapas do processo de teste, Planejamento de Teste. 
   O Projeto de teste é uma etapa posterior ao planejamento, onde testes são elaborados seguindo especificações e limitações estabelecidas durante o planejamento.
    
### 2. (**1,0 pontos**) Descreva as vantagens para a equipe de desenvolvimento ao se adotar um processo de teste ágil.

  

### 3. (**1,0 ponto**) Cite pelo menos três características do Teste Exploratório.

  No teste exploratório os testadores tentam agir como usuários de forma a descorbir possiveis problemas no sistema.

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
| CE04 | tipo = Cheque || tipo = Poupança             | V |
| CE05 | tipo != Cheque && tipo != Poupança           | I |
| CE06 | tipo = Cheque && limite = cheque especial    | V |
| CE07 | tipo = Cheque && limite != cheque especial   | I |
| CE08 | tipo != Poupança && limite = cheque especial | I |
   
   #### 2. (2.0) Definir os casos de teste suficientes para a cobertura do teste de cada um dos cenários definidos. Documentar os casos de teste no seguinte padrão:
   
   **Banco**
   |CT|Valores de Entrada|Resultado esperado|
   |---|---|---|
   | CT01 | numero = 0                                   |  |
   | CT02 | numero > 0                                   |  |
   | CT03 | numero < tres digitos                        |  |
   | CT04 | numero = tres digitos                        |  |
   | CT05 | numero > tres digitos                        |  |
   | CT06 | nome < 5 caracteres                          |  |
   | CT07 | nome = 5 caracteres                          |  |
   | CT08 | nome = 100 caracteres                        |  |
   | CT09 | nome > 100 caracteres                        |  |
   
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
