
# BancoDigitalDesafioDio 🚀

## Descrição do Projeto 📝

O BancoDigitalDesafioDio é um projeto desenvolvido como parte de um desafio proposto pela Digital Innovation One (DIO). O objetivo principal do desafio é a implementação de um banco digital (versão resumida) utilizando conceitos de Programação Orientada a Objetos (OO). Este projeto visa demonstrar a aplicação de princípios de OO para criar uma aplicação de banco digital com funcionalidades básicas.

## Funcionalidades ✨

O BancoDigitalDesafioDio inclui as seguintes funcionalidades:

    📂 Criação de contas bancárias (corrente e poupança)
    💵 Realização de depósitos
    🏦 Realização de saques
    🔄 Transferências entre contas
    📊 Consulta de saldo


## Interfaces 📋

O projeto utiliza duas interfaces principais para definir as operações de contas e clientes:

### Interface ContaOperacoes

Métodos disponíveis:

    depositar(double valor) 💰
    sacar(double valor) 🏧
    verSaldo() 📈
    transferir(double valor, Conta contaDestino) 🔀
    infoTitular() 🧑‍💼

### Interface ClienteOperacoes

Métodos disponíveis:

    infoCliente() ℹ️
    infoCpfCnpj() 📇

## Estrutura do Projeto 🏗️

O projeto é estruturado em diferentes classes para representar os componentes do banco digital. As principais classes incluem:

    Banco: Implementa um Set<Conta>, gerenciando uma lista de todas as contas do banco.
    Cliente: Superclasse abstrata que implementa a interface ClienteOperacoes.
    ClientePF: Subclasse de Cliente, representando um cliente pessoa física.
    ClientePJ: Subclasse de Cliente, representando um cliente pessoa jurídica.
    Conta: Superclasse abstrata que implementa a interface ContaOperacoes.
    ContaCorrente: Subclasse de Conta, representando uma conta corrente.
    ContaPoupanca: Subclasse de Conta, representando uma conta poupança.
    App: Classe principal (main) que instancia objetos e chama métodos para demonstrar as funcionalidades do banco.

## Detalhes da Classe Banco 🏦

A classe Banco gerencia todas as contas e fornece diversas funcionalidades administrativas:

    Adicionar Cliente: Permite adicionar uma nova conta ao conjunto de contas do banco.
    Remover Cliente: Permite remover uma conta existente, requerendo uma senha de super usuário.
    Ver Lista de Contas: Lista todas as contas cadastradas no banco, exibindo informações dos titulares.
    Pesquisar Cliente pelo Nome: Permite pesquisar uma conta específica pelo nome do titular.
    Limpar Lista de Clientes: Apaga todas as contas cadastradas, requerendo uma senha de super usuário.
    Informações sobre Super Usuário (Sudo): Fornece informações sobre as permissões especiais do super usuário.

## Estrutura de Diretórios 📂


    BancoDigitalDesafioDio/
    ├── .idea/
    ├── out/
    ├── src/
    │   ├── entidades/
    │   │   ├── Banco.java
    │   │   ├── Cliente.java
    │   │   ├── ClientePF.java
    │   │   ├── ClientePJ.java
    │   │   ├── Conta.java
    │   │   ├── ContaCorrente.java
    │   │   └── ContaPoupanca.java
    │   ├── interfaces/
    │   │   ├── ContaOperacoes.java
    │   │   └── ClienteOperacoes.java
    │   └── App.java
    ├── .gitignore
    └── BancoDigitalDesafioDio.iml
