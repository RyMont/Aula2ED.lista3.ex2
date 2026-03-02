# Exercício 2 — Contagem de Dígito em Número (Recursivo)

Criar uma aplicação em Java que tenha uma função recursiva que, recebendo um número inteiro de 10 a 999999 e recebendo um segundo número inteiro de 0 a 9, apresente quantas vezes o segundo número aparece no primeiro.

Exemplos:
- 1º número = 523578; 2º número = 5; retorno: aparece 2 vezes  
- 1º número = 836363; 2º número = 3; retorno: aparece 3 vezes  

A validação da entrada e do dígito deve ser feita na main da aplicação e não na função recursiva.

O código deve apresentar, em formato de comentário:
- Como foi definida a condição de parada;
- Como foi definida a relação de chamada dos passos.

Dica para a resolução do exercício:

Exemplo: Número 1234  
1234 / 10 = 123 com resto 4  
123 / 10 = 12 com resto 3  
12 / 10 = 1 com resto 2  
1 / 10 = 0 com resto 1  

Exemplo: Número 8647  
8647 / 10 = 864 com resto 7  
864 / 10 = 86 com resto 4  
86 / 10 = 8 com resto 6  
8 / 10 = 0 com resto 8
