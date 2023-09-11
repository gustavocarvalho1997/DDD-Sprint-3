# DDD-Sprint-3
Sprint 3 - DDD

1TDSS

Porto Seguro

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

Com base nesses modelos, quando o main é iniciado, ele começa lendo os arquivos txt e monta todos os objetos armazenados nesses arquivos.

![image](https://github.com/gustavocarvalho1997/DDD-Sprint-3/assets/79180740/c18d0842-d4bb-4707-ba86-7c2cfcbf838a)

Com exceção do arquivo MensagemEnviada.txt, que é utilizado para armazenar as mensagens que teoricamente seriam enviadas para o funcionário da porto, os demais contem informações que são necessárias na montagem dos objetos.

## SistemaDao
Para manipular os objetos e armazena-los, foi utilizada a classe SistemaDao.java onde, quando a mesma é instanciada no terminal, o seu construtor inicia a estrutura de dados que será utilizada para armazenar os objetos que serão criados durante a leitura. Para armazenar os objetos e posteriormente busca-los na hora de manipula-los, foi utilizado HashMap.

![image](https://github.com/gustavocarvalho1997/DDD-Sprint-3/assets/79180740/e02fa713-0643-4d32-b9ec-130a95a83d4b)

Essa classe tem diversas funções responsáveis por manipular os objetos conforme a opção selecionada no terminal que simula um menu por meio do JOptionPane.

![image](https://github.com/gustavocarvalho1997/DDD-Sprint-3/assets/79180740/e30554e7-0c1c-4d34-919c-5f83f82ed4d9)

Para ter acesso ao menu acima o usuário deverá efetuar o login, por meio dos arquivos que serão lidos, o projeto ja virá com alguns objetos exemplos para utiliza-lo, e um desses objetos é um usuário para efetuar tal login por meio do id "CL112233" e senha "123456". Se faz necessário pois o menu só será utilizado caso tenha um usuário logado e enquanto logado, as funções chamadas neste menu utilizam o cliente logado para procurar suas informações, chamados e afins.

![image](https://github.com/gustavocarvalho1997/DDD-Sprint-3/assets/79180740/d009beb9-6dc1-4a20-bfdc-5bdd2bcd55da)

Portanto, sem que esteja logado, mesmo se entrasse no menu, não conseguiria encaminhar um objeto do tipo Cliente para as funções funcionarem.

## Salvamento
Quando o usuário não deseja mais utilizar a aplicação, é dada a opção de deslogar salvando as alterações realizadas, onde será acionada a função salvar() no SistemaDao.java e, junto a função que formata os dados pra salvamento em cada objeto, serão escritas nos arquivos para serem lidas em uma próxima utilização.
