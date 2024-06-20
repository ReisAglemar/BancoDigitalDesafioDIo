package entidades;

public class ClientePJ extends Cliente {

    private String cnpj;

    public ClientePJ(String nome, String endereco, String cnpj) {
        super(nome, endereco);
        this.cnpj = cnpj;
    }

    /**
     * Polimorfismo por sobrescrição, imprimi o cpf e
     * chama o método infoCliente da super classe
     */
    @Override
    public void infoCliente() {
        System.out.println("CNPJ: " + cnpj);
        super.infoCliente();
    }

    @Override
    public void infoCpfCnpj() {
        System.out.println("CNPJ: " + cnpj);
        super.infoCpfCnpj();
    }

    public String getCnpj() {
        return cnpj;
    }
}

