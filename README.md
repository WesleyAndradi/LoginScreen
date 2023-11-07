# Projeto de Autenticação de Usuário

Este é um projeto Java simples que demonstra a autenticação de usuário e a adição de usuários a um banco de dados. A classe `LoginScreen` é responsável por gerenciar os usuários e suas credenciais.

## Funcionalidades

- Verificação de autenticação de usuário.
- Adição de novos usuários ao banco de dados.

## Pré-requisitos

- JDK (Java Development Kit) instalado.
- Ambiente de desenvolvimento Java (como Eclipse ou IntelliJ IDEA).

## Como Usar

1. Clone ou baixe este repositório.

2. Abra o projeto em seu ambiente de desenvolvimento Java.

3. Execute a classe `LoginScreen` para ver as funcionalidades em ação. O método `main` contido na classe permite testar o código.

4. Modifique o banco de dados de usuários conforme necessário, adicionando ou removendo usuários no construtor da classe `LoginScreen`.

## Exemplo de Uso

Aqui está um exemplo de uso básico do código:

```java
// Criar uma instância da classe LoginScreen
LoginScreen loginScreen = new LoginScreen();

// Verificar a autenticação do usuário
if (loginScreen.login("John", "password123")) {
    System.out.println("Usuário autenticado com sucesso!");
} else {
    System.out.println("Falha na autenticação do usuário.");
}

// Adicionar um novo usuário
loginScreen.addUser("NovoUsuário", "NovaSenha");
