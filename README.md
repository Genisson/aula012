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



 - [Bancos de dados e JDBC](https://www.caelum.com.br/apostila-java-web/bancos-de-dados-e-jdbc/)
 - [Core J2EE Patterns - Data Access Object](http://www.oracle.com/technetwork/java/dataaccessobject-138824.html)
 - [Introdução ao pattern DAO](http://javafree.uol.com.br/artigo/871452/Introducao-ao-pattern-DAO.html)
 
