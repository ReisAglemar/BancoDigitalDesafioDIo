package entidades;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente titular) {
        super(titular);
    }

    /**
     * Polimorfismo por sobrescrição, chama o método verSaldo da super classe
     * e adiciona o tipo de conta da subclasse.
     */
    @Override
    public void verSaldo() {
        super.verSaldo();
        System.out.println("Tipo de Conta: Conta Poupança");
    }

    /**
     * Polimorfismo por sobrescrição, chama o método infoTitular da super classe
     * e adiciona o tipo de conta da subclasse.
     */
    @Override
    public void infoTitular() {
        super.infoTitular();
        System.out.println("Tipo de conta do titular: Conta Poupança");
    }
}
