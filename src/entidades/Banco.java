package entidades;

import java.util.HashSet;
import java.util.Set;

public class Banco {

    private static final String SENHA = "SudoApagaTudo1/137!";
    Set<Conta> contas = new HashSet<>();


    public Banco() {
    }

    /**
     * @param conta conta para adicionar no set de contas.
     */
    public void adicionarCliente(Conta conta) {
        contas.add(conta);
    }

    /**
     * @param conta        conta para remover no set de contas.
     * @param superUsuario senha requerida para remver conta.
     */
    public void removerCliente(Conta conta, String superUsuario) {
        if (superUsuario.equals(SENHA)) {
            System.out.println("Operação realizada com poderes de Super Usuário.");
            contas.remove(conta);
            System.out.println("Cliente removido com sucesso.");
            System.out.println("Tamanho atual da lista: " + contas.size());
        } else {
            System.out.println("Você não tem poderes de Super Usuário para fazer isso!");
            System.out.println("Pesquise pelo método sudo para saber mais!");
        }
    }

    /**
     * Lista todas as contas cadastradas.
     */
    public void verListaContas() {
        for (Conta conta : contas) {
            conta.infoTitular();
            System.out.println("------------------------------------------------------------------------------");

        }
    }

    /**
     * @param nome pesquisa uma conta pelo nome do titular
     *             da conta.
     */
    public void pesquisarClienteNome(String nome) {

        boolean existe = false;

        for (Conta conta : contas) {
            if (conta.getTitular().equalsIgnoreCase(nome)) {
                System.out.println("Cliente: " + conta.getTitular());
                System.out.println("Número Conta: " + conta.getNumeroConta() + " Agência: " + conta.getAgencia());
                System.out.println("------------------------------------------------------------------------------");
                existe = true;
                break;
            }
        }
        if (!existe) {
            System.out.println("Cliente não localizado na base de dados.");
            System.out.println("Nome informado: " + nome);
        }

    }

    /**
     * @param superUsuario senha requerida para apagar o set de contas.
     */
    public void limparListaClientes(String superUsuario) {

        if (superUsuario.equals(SENHA)) {
            System.out.println("Operação realizada com poderes de Super Usuário.");
            contas.clear();
            System.out.println("Lista de contas foi apagada!");
            System.out.println("Tamanho atual da lista: " + contas.size());
        } else {
            System.out.println("Você não tem poderes de Super Usuário para fazer isso!");
            System.out.println("Pesquise pelo método sudo para saber mais!");
        }
    }

    /**
     * Informações sobre o super usuário, sudo.
     */
    public void sudo() {
        System.out.println("\n--------------------- ÁREA SUDO -----------------------");
        System.out.println("Alguém contou à você sobre o sudo!");
        System.out.println("Sudo é um super usuário.\n");
        System.out.println("Ações realizadas com sudo são grandiosas, geralmente é usado para apagar dados!");
        System.out.println("Essas ações não poderão serem desfeitas.\n");
        System.out.println("Para opera como sudo é requerida uma senha");
        System.out.println("Caso você não possua a senha, chame um adulto.\n");
        System.out.println("Lembre-se: Com grandes poderes podemos fazer grandes desastres...");
        System.out.println("Não dúvide de sua capacidade...\n");
        System.out.println("MANTENHA SILÊNCIO SOBRE O SUDO, OS PODERES DE SUPER VACA NÃO É PÚBLICO!!!!!!!\n\n");
    }

}

