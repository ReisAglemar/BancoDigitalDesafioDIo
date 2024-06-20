package entidades;

public class ClientePF extends Cliente {


    private String cpf;

    public ClientePF(String nome, String endereco, String cpf) {
        super(nome, endereco);
        this.cpf = cpf;

    }

    /**
     * Polimorfismo por sobrescrição, imprimi o cpf e
     * chama o método infoCliente da super classe
     */
    @Override
    public void infoCliente() {
        System.out.println("CPF: " + cpf);
        super.infoCliente();

    }

    @Override
    public void infoCpfCnpj() {
        System.out.println("CPF: " + cpf);
        super.infoCpfCnpj();
    }

    public String getCpf() {
        return cpf;
    }
}
