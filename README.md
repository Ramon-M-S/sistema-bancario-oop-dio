# 🏦 Banco Digital com Java e Orientação a Objetos


## 📄 Descrição

Projeto desenvolvido o objetivo de criar um sistema bancário digital simples em **Java**. A aplicação foi construída do zero, com foco total na utilização dos 4 pilares da **Programação Orientada a Objetos (POO)** para criar um código limpo, coeso, reutilizável e extensível.

---

## ✨ Funcionalidades

-   [x] **Criação de Clientes e Contas:** Permite cadastrar novos correntistas e abrir dois tipos de contas: Corrente e Poupança.
-   [x] **Operações Bancárias Fundamentais:**
    -   Realizar **depósitos**.
    -   Realizar **saques** (com validação de saldo disponível).
    -   Realizar **transferências** entre contas do próprio banco.
-   [x] **Consultas e Relatórios:**
    -   Imprimir **extratos** individuais e detalhados para cada conta.
    -   Listar todos os clientes cadastrados no banco.
-   [x] **Gerenciamento Centralizado:** A classe `Banco` centraliza a gestão de todas as contas.

---

## 👨‍💻 Pilares da Orientação a Objetos Aplicados

O núcleo do projeto foi a aplicação prática dos seguintes conceitos:

1.  ### ☕ Abstração
    A `interface IConta` e a `classe abstrata Conta` foram criadas para representar a ideia de uma conta bancária, definindo um "contrato" com os métodos essenciais (`sacar`, `depositar`, `transferir`) e os atributos comuns a todos os tipos de conta.

2.  ### 📦 Encapsulamento
    Os atributos das classes, como `saldo` e `agencia`, foram protegidos com modificadores de acesso (`private` ou `protected`). A manipulação desses dados é feita de forma segura e controlada através de métodos públicos, que formam a interface de comunicação com o objeto.

3.  ### 🧬 Herança
    As classes `ContaCorrente` e `ContaPoupanca` herdam da classe `Conta`, reutilizando todo o código comum de lógica de negócios e atributos. Isso evita a duplicação de código e facilita a manutenção.

4.  ### 🐾 Polimorfismo
    As contas são tratadas de forma genérica através da referência à interface `IConta` ou à superclasse `Conta`. Isso permite que o sistema interaja com diferentes tipos de conta de maneira uniforme (por exemplo, ao realizar uma transferência, não é preciso saber se a conta de destino é Corrente ou Poupança).

