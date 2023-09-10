# DDD-Sprint-3
Sprint 3 - DDD

## Integrantes
Nome: Gustavo Carvalho    RM: 552466

Nome: Ronald de Oliveira  RM: 552364

Nome: Nicoly Oliveira     RM: 552410

Nome: Nicolly de Almeida  RM: 552579

Nome: Vitor Teixeira      RM: 552228

## Objetivo
Esse projeto funciona de forma a dar uma ideia do processo de algumas das funções principais, como salvar informações, adicionar chamado, ler informações, visualizar os detalhes de um chamado, histórico de chamado e afins. Para simular o processo de armazenar as informações em um banco de dados e ler as informações, estão sendo usados arquivos do tipo txt onde, conforme o formato que as informações foram inseridas, o programa lê no inicio de sua execução e monta os objetos. Para interação com o programa é utilizado o JOptionPane que simula a função de menu e também login.

# Explicações sobre o código
## Models
![image](https://github.com/gustavocarvalho1997/DDD-Sprint-3/assets/79180740/f1061afd-3d3f-4569-8bd2-639954e7d55e)

As models foram criadas conforme diagrama UML, onde a sua maioria tem funções que permitem com que retornem suas informações e também o formato que espera com que sejam salvas nos arquivos txt para serem recuperadas em uma futura execução do programa. Para que os objetos sejam montados com seus respectivos atributos, foi inserido um atributo nomeado como "idVinculo" em algumas classes assim, durante a leitura dos arquivos, é identificado se há relação entre algum objeto com outro e feito o devido vínculo.
