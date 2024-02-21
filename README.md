# Passos de como executar o projeto

Este guia fornece instruções passo a passo sobre como configurar e executar o projeto. Certifique-se de seguir cada etapa cuidadosamente para garantir uma execução bem-sucedida.

## Configurações Inicias 

1. **Ambiente de Desenvolvimento**
   - Certifique-se de ter um ambiente de desenvolvimento configurado com a versão Java 8 ou superior.
   - Utilize uma IDE como IntelliJ IDEA ou Eclipse para facilitar o desenvolvimento pois ambos fornecem maior compatibiidade com a linguagem e o framework.

2. **Banco de Dados PostgreSQL**
   - O banco estará no container docker, então é necessário ter _Docker version 25.0.3_  para conseguir acessar o banco `cadastro-de-pessoas`.

3. **Clone o Repositório**
   - Clone o repositório do projeto para o seu ambiente local usando o comando:
     ```bash
     git clone https://github.com/tarcizo12/Teste-Pratico-CRUD
     ```

## Como Preparar a incialização da Aplicação

1. **Importe o Projeto na IDE**
   - Abra sua IDE e importe o projeto.
   - Certifique-se de que todas as dependências são baixadas automaticamente.

2. **Configure o servidor Apache quer irá se conectar com a aplicação**
   - Para o Eclipse, siga o caminho: Window > Show View > Servers.
   - Uma vez nesta aba, adicione o servidor, selecione o path que esta localizado o Tomcat em sua maquina
   - Use a versão Apache Tomcat v8.5
   - Importe a aplicação para dentro do servidor.

3. **Execute o Docker**
   - Partindo do diretorio raíz do projeto, caminhe até a pasta _Docker_.
   - Feito isso, abra o terminal neste diretorio e execute o comando: _docker-compose up --build_
   - Dessa forma, o banco ja estará configurado.

## Como Iniciar o Projeto

-Nesta etapa, a aplicação pode ser acessada no endereço:
     ``` 
     http://localhost:8080/app/RegisterPage.html
     ```
    Entretando, não foi possivel concluir a integração das funções de CRUD do sistema backend com a interface visual para o usuario, porém, é possivel executar, verificar a conexão com o banco e garantir a modelagem do banco executando as classes: *_/app/src/main/java/com/app/repository/PersistenceLayer.java_*  e  *_/app/src/main/java/com/app/repository/PersistenceLayer.java executando ambas como uma _Java Application__* . 
