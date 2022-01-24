## Tarefa 003 - 21/12/2021 - Definição de Classes de Equivalência.

Classes de Equivalência

|  ID  |           Descrição                          | V/I |
| CE01 | nota1 < 0                                    | I   |
| CE02 | 0 <= nota1 <= 10                             | V   |
| CE03 | nota1 > 10                                   | I   |
| CE04 | nota1 com menos de 2 casas decimais          | V   |
| CE05 | nota1 com 2 casas decimais                   | V   |
| CE06 | nota1 com mais de 2 casas decimais           | I   |
| CE07 | nota2 < 0                                    | I   |
| CE08 | 0 <= nota2 <= 10                             | V   |
| CE09 | nota2 > 10                                   | I   |
| CE10 | nota2 com menos de 2 casas decimais          | V   |
| CE11 | nota2 com 2 casas decimais                   | V   |
| CE12 | nota2 com mais de 2 casas decimais           | I   |
| CE13 | faltas < 0                                   | I   |
| CE14 | faltas > cargaHoraria                        | I   |
| CE15 | 0 <= faltas <= cargaHoraria*25/100           | V   |
| CE16 | cargaHoraria*25/100 < faltas <= cargaHoraria | V   |
| CE17 | 0 <= (nota1+nota2)/2 < 3                     | V   |
| CE18 | 3 <= (nota1+nota2)/2 < 6                     | V   |
| CE19 | 6 <= (nota1+nota2)/2 <= 10                   | V   |


Casos de Teste
*Considerando cargaHoraria = 64

|  CT  |          Valor de Entrada        | Resultado Esperado  |       Classe Equivalência          |
| CT01 | nota1 = -2                       | Valor Inválido      | CE01, CE04                         |
| CT02 | nota1 = 5                        | OK                  | CE02, CE04                         |
| CT03 | nota1 = 15                       | Valor Inválido      | CE03, CE04                         |
| CT04 | nota1 = 5.5                      | OK                  | CE02, CE04                         |
| CT05 | nota1 = 5.55                     | OK                  | CE02, CE05                         |
| CT06 | nota1 = 5.555                    | Valor Inválido      | CE02, CE06                         |
| CT07 | nota2 = -7                       | Valor Inválido      | CE07, CE10                         |
| CT08 | nota2 = 8                        | OK                  | CE08, CE10                         |
| CT09 | nota2 = 16                       | Valor Inválido      | CE09, CE10                         |
| CT10 | nota2 = 7.7                      | OK                  | CE08, CE10                         |
| CT11 | nota2 = 7.77                     | OK                  | CE08, CE11                         |
| CT12 | nota2 = 7.777                    | Valor Inválido      | CE08, CE12                         |
| CT13 | faltas = -20                     | Valor Inválido      | CE13                               |
| CT14 | faltas = 65                      | Valor Inválido      | CE14                               |
| CT15 | faltas = 0                       | OK                  | CE15                               |
| CT16 | faltas = 32                      | Reprovado por Falta | CE16                               |
| CT17 | nota1 = 3, nota2 = 2, faltas = 4 | Reprovado por Média | CE02, CE04, CE08, CE10, CE15, CE17 |
| CT18 | nota1 = 3, nota2 = 5, faltas = 4 | Recuperação         | CE02, CE04, CE08, CE10, CE15, CE18 |
| CT19 | nota1 = 6, nota2 = 8, faltas = 4 | Aprovado            | CE02, CE04, CE08, CE10, CE15, CE19 |
