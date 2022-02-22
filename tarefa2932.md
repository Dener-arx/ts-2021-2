## Tarefa 006 - 15/02/2022 - Grafo de Fluxo de Controle

#### 1. Considere o fragmento de código implementado na Linguagem de Programação Java.

~~~java

public class Avaliacao {


1    public String avalia(double nota1, double nota2, int faltas, int cargaHoraria) throws ValoresInvalidosException{
2        String result;
3        double percentualFaltas = (faltas*100/cargaHoraria);
4        double media = (nota1 + nota2)/2;
5        if((nota1 < 0.0 || nota1 > 10) || (nota2 < 0.0 || nota2 > 10) || (faltas < 0 || faltas > cargaHoraria) || cargaHoraria < 0){
6            throw new ValoresInvalidosException();//result = "Valores Inválidos.";
7        }else if(percentualFaltas > 25.0){
8            result = "Reprovado por Falta.";
9        }else if(media < 3.0){
10            result = "Reprovado por Média.";
11        }else if(media >= 3.0 && media < 6.0){
12            result = "Prova Extra.";
13        }else{
14            result = "Aprovado.";
15        }
16        return result;
17    }
18 }
~~~

#### 2. Pede-se:
   #### 1. Desenhar o **Grafo do Fluxo de Controle**. Pode-se anexar a imagem, aqui neste arquivo.
   >![Image](https://github.com/Dener-arx/ts-2021-2/blob/main/images/Grafo%20de%20Fluxo%20de%20Controle.png)
   #### 2. Calcular a complexidade ciclomática do código. Exemplo de coo calcular pode ser obtido no [link](https://www.treinaweb.com.br/blog/complexidade-ciclomatica-analise-estatica-e-refatoracao)

      **V(G) = R** 
      Número de Regiões = 5 
    
      **V(G) = E – N + 2** 
      (Arestas = 19, Nós = 16)
      19-16+2 = 5 
    
      **V(G = P + 1** 
      Nós-Predicados = 5

   #### 3. Definir quantos caminhos de execução existem;

      **Existem 5 Caminhos de Execução.** 
      1 - Valores Inválidos 
      2 - Reprovado por Falta 
      3 - Reprovado por Média 
      4 - Prova Extra 
      5 - Aprovado

   #### 4. Definir os casos de teste necessários para se percorrer todos estes caminhos. Cada caso de teste deve ter o valor correspondente para cada variável de entrada e o valor esperado.

|  CT  |          Valor de Entrada                             |  Resultado Esperado  |
|---|---|---|
| CT01 | nota1 = -7, nota2 = 5, faltas = 4, cargaHoraria = 64  | Valores Inválidos    |
| CT02 | nota1 = 8, nota2 = 8, faltas = 28, cargaHoraria = 64  | Reprovado por Falta  |
| CT03 | nota1 = 2, nota2 = 3, faltas = 4, cargaHoraria = 64   | Reprovado por Média  |
| CT04 | nota1 = 3, nota2 = 6, faltas = 4, cargaHoraria = 64   | Prova Extra          |
| CT05 | nota1 = 8, nota2 = 9, faltas = 0, cargaHoraria = 64   | Aprovado             |

