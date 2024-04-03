# Projeto Moda-Ora

## Por que o projeto foi desenvolvido?
O Projeeto foi desenvolvido em um dos cursos da UDEMY de HTML, CSS e Javascript no qual a parte do front-end foi implementada juntamente com o professor. e a parte do Back-end foi feita pelo autor através do Java Spring.


Foi utilizado as tecnlogias: 
- SpringBoot
- Java
- HTML
- CSS
- JavaScript
- TypeScript

## Criar uma database no Postgresql
* Crie uma database no Postgresql com o nome 'modaora' lembrando que deve estar na porta padrão do pgAdmin

Todos os dados e tabelas serão geradas de forma automatica no Banco de dados.

## Inicialização do projeto Front-End:
Para inicializar o projeto, abra a pasta 'agenda-app' e abra o terminal no diretorio, e digite:

```
npm install
```

Lembrando que deve estar instalado em seu computador o NodeJS.

Após instalar as dependencias do projeto, coloque no terminal o comando a baixo para executar o front-end. A ultima opção ela abre o navegador automaticamente no endereço http://localhost:4200/ do navegador
```
ng serve
```
OU
```
ng serve --open
```

Prontinho, o projeto já foi inicializado.

## Inicializando o projeto Back-end
* Para inicializar o projeto, primeiro deve estar instalado o Java.
* Segundo deve estar instalado o Spring Tools que pode ser utilizado tanto no Eclipse quanto no VSCode. Para baixar é pelo link: https://spring.io/tools
* Ao instalar e baixar o projeto no github, pode utilizar o SpringTools Eclipse indo em 'File' > Import > Selecionar a pasta 'Maven' e selecionar a opção 'Existing Maven Projects'. Depois disso selecione a pasta principal, normalmente na pasta principal contem o arquivo pom.xml
* Clicar em 'Finish' e aguarde o projeto baixar as suas dependencias.
* Depois disso só clicar com o botão direito do mouse na classe principal ( src/main/java/io/github/maranommv/cadastro
/CadastroApplication.java
 ) e ir em 'Run as' > 9 - Spring Boot APP ( Eclipse )

## Campo Email do back-end
Você deve colocar o seu username e password do google para poder enviar os emails via SMTP automaticamente pelo codigo. Para isso vá na pasta do back-end e edite src\main\resources\application.properties e coloquei:
* spring.mail.username=SEU_EMAIL
* spring.mail.password=SUA_SENHA_GMAIL


    A Senha do email não é a sua senha que você utiliza no google, normalmente você tem que gerar outra em https://myaccount.google.com/apppasswords?utm_source=google-account&utm_medium=myaccountsecurity&utm_campaign=tsv-settings&rapt=AEjHL4OkFJuCGvgL_4gCytHG17EC4xa6JznP697ChIUNWO87mePzeMugkBD8EmmYn27hGIzfVHBXSunuFhdrKej3wrWvex1WIF1ii4czluHeiF9zej8pCGE

     Depois de gerar a senha coloque a senha que apareceu em sua tela
