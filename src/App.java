import entidades.Banco;

import entidades.Cliente;
import entidades.ClientePF;
import entidades.ClientePJ;

import entidades.Conta;
import entidades.ContaCorrente;
import entidades.ContaPoupanca;



/**
 * @author Reis
 */
public class App {

    public static void main(String[] args) {

        /**
         * Novo banco criado
         */
        Banco banco = new Banco();

        /**
         * Novos clientes criados
         */
        Cliente reis = new ClientePF("Reis", "Rua A, casa", "1234");
        Cliente robert = new ClientePF("Robert", "Rua B, apartamento", "4567");
        Cliente davis = new ClientePJ("Davis", "Rua C, casa", "980");
        Cliente stive = new ClientePJ("Stive", "Rua AB, aparatamento", "15");

        /**
         * Novas contas correntes criadas
         */
        Conta correnteReis = new ContaCorrente(reis);
        Conta correnteRobert = new ContaCorrente(robert);
        Conta correnteDavis = new ContaCorrente(davis);
        Conta correnteStive = new ContaCorrente(stive);

        /**
         * Novas constas poupanças criadas
         */
        Conta poupancaReis = new ContaPoupanca(reis);
        Conta poupancaRobert = new ContaPoupanca(robert);
        Conta poupancaDavis = new ContaPoupanca(davis);
        Conta poupancaStive = new ContaPoupanca(stive);


        /**
         * Adicionando contas ao banco
         */
        banco.adicionarCliente(correnteReis);
        banco.adicionarCliente(correnteRobert);
        banco.adicionarCliente(correnteDavis);
        banco.adicionarCliente(correnteStive);
        banco.adicionarCliente(poupancaReis);
        banco.adicionarCliente(poupancaRobert);
        banco.adicionarCliente(poupancaDavis);
        banco.adicionarCliente(poupancaStive);

        /**
         * visualizar a lista de clientes
         */
        System.out.println("\nVisualizando a lista de contas\n");
        banco.verListaContas();

        /**
         * Tentaiva de remoção de cliente
         */
        System.out.println("\nTenativa de remover usuário\n");
        banco.removerCliente(correnteReis, "SENHA");

        /**
         * Seguindo orientações do programa
         */
        banco.sudo();

        /**
         * limpando a lista de clientes
         */
        banco.limparListaClientes("SudoApagaTudo1/137!");

    }
}
