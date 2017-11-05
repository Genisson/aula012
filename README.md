# Aula 012 - Acessando banco de dados

## Criando um projeto de acesso ao BD

### Configurando BD - JavaDB

Caso seu javaDB não esteja funcionando reconfigure-o conforme abaixo:

#### Acessando propriedades
![Acessando propriedades](images/conf-javadb-1.PNG)
#### Retirando o apontamento do diretório JDK
![Retirando o apontamento do diretório JDK](images/conf-javadb-2.PNG)
#### Reapontando para o diretório do glassfish
![Reapontando para o diretório do glassfish](images/conf-javadb-3.PNG)

### Executando o BD - JavaDB

Executando o servidor

#### Iniciando o servidor JavaDB
![Iniciando o servidor JavaDB](images/javadb-iniciar-servidor.PNG)
#### Verificando que o servidor foi executado corretamente
![Executando o servidor](images/javadb-servidor-executando.PNG)

### Testando a conexão com o BD

Testando a conexão com o BD

#### Conectando ao banco de dados
![Testando a conexão](images/javadb-testado-conexao.PNG)
#### Testando a conexão executando uma consulta no banco de dados (TABELA **CITY**)
![Testando a conexão](images/javadb-testado-conexao-2.PNG)


### Conectando ao banco de dados utilizando uma aplicação Java

Para conectarmos ao BD utilizando uma aplicação Java precisamos primeiro saber a ***URL*** de conexão com o banco de dados. Esta ***URL*** será utilizada dentro do programa em Java.

O formato da string de conexão será normalmente ```jdbc:<sgbd>://<ip>/<nome_do_banco>```

#### Onde pegar a URL de conexão com o BD
![Onde pegar a URL de conexão com o BD](images/javadb-url-to-db-1.PNG)
#### Copie a string de conexão para o banco de dados
![Onde pegar a URL de conexão com o BD](images/javadb-url-to-db-2.PNG)

Esta será a url de conexão ```jdbc:derby://localhost:1527/sample```, provavelmente sa sua deverá ser a mesma. Ela deverá ser utilizada dentro da aplicação em Java.

#### Criando a aplicação Java

Crie um projeto do tipo **Aplicação Java** chamado **acessoDb** e detro do método ```main``` da classe principal  digite o código a seguir:

```java
Connection conexao = DriverManager.getConnection(
		"jdbc:derby://localhost:1527/sample");
System.out.println("Conectado!");
conexao.close();
```

Ajustes serão necessários para que este projeto compile. Você deverá adicionar adequadamente os **imports** e incluir o **throws** por causa do tratamento de exceção.

Compile o projeto e executar para testar.

#### 1º Erro ao tentar executar - falta de biblioteca (driver para o Java acessar o BD)
![1º erro execução](images/projeto-executando-1-problema-driver.PNG)

#### Adicionando a biblioteca no projeto Java
##### Clicar sobre as bibilitecas do projeto e selecionar adicionar
![adicionando biblioteca](images/projeto-adicionando-biblioteca-1.PNG)
##### Selecionar na caixa Driver do JavaDB e clicar ok
![Selecionar na caixa Driver do JavaDB e clicar ok](images/projeto-adicionando-biblioteca-2.PNG)

Compile novamente o projeto e execute para testar.

#### 2º Erro ao tentar executar - autenticação - usuário e senha
![2º erro execução](images/projeto-executando-2-problema-usuario.PNG)

#### Ajuste o código da aplicação Java

Crie um projeto do tipo **Aplicação Java** chamado **acessoDb** e detro do método ```main``` da classe principal  digite o código a seguir:

```java
Connection conexao = DriverManager.getConnection(
		"jdbc:derby://localhost:1527/sample", "app", "app");
```

Compile o projeto e executar para testar.

#### 3º tentativa de executar - contectado!
![3º tentativa de executar](images/projeto-executando-3-ok.PNG)


 - [Bancos de dados e JDBC](https://www.caelum.com.br/apostila-java-web/bancos-de-dados-e-jdbc/)
 - [Core J2EE Patterns - Data Access Object](http://www.oracle.com/technetwork/java/dataaccessobject-138824.html)
 - [Introdução ao pattern DAO](http://javafree.uol.com.br/artigo/871452/Introducao-ao-pattern-DAO.html)
 
