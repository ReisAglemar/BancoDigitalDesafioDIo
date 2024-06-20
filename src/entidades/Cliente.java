package entidades;

import interfaces.ClienteOperacoes;

public abstract class Cliente implements ClienteOperacoes {

    private static int ID_CLIENTE = 1;

    private int id;
    private String nome;
    private String endereco;

    /**
     * @param nome     cliente precisa de nome.
     * @param endereco cliente precisa de endereço.
     */
    public Cliente(String nome, String endereco) {
        this.nome = nome;
        this.id = Cliente.ID_CLIENTE++;
        this.endereco = endereco;
    }

    /**
     * Imprimi informações do cliente
     */
    @Override
    public void infoCliente() {
        System.out.println("Nome: " + nome);
        System.out.println("ID: " + id);
        System.out.println("Endereco: " + endereco);

    }

    @Override
    public void infoCpfCnpj() {

    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

}
