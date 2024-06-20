package entidades;

import interfaces.ContaOperacoes;

public abstract class Conta implements ContaOperacoes {

    static final int AGENCIA = 2;
    private static int NUMERO_CONTA = 1;
    private final double TAXA_TRANSFERENCIA = 11.37d;


    private Cliente titular;
    private Double saldo;
    private int agencia;
    private int NumeroConta;

    /**
     * @param titular para instânciar uma conta o cliente já deve existir
     *                não é possível criar uma conta sem cliente.
     */
    public Conta(Cliente titular) {
        this.saldo = 0d;
        this.titular = titular;
        this.agencia = Conta.AGENCIA;
        this.NumeroConta = Conta.NUMERO_CONTA++;

    }

    /**
     * @param valor valor para depositar, é regra do negócio:
     *              1- valor maior que zero para depositar.
     */
    @Override
    public void depositar(double valor) {

        if (valor > 0.00d) {
            saldo += valor;
            System.out.println("Deposito realizado com sucesso!");
            System.out.println("Saldo atual: " + saldo);
        } else {
            throw new RuntimeException("Valor do depósito deve ser maior que 0.00!");
        }

    }

    /**
     * @param valor valor para sacar, são regras do negócio:
     *              1- O saldo deve ser maior ou igual ao valor do saque;
     *              2- E o valor do saque deve ser maior que zero.
     */
    @Override
    public void sacar(double valor) {

        if (saldo >= valor && valor > 0.00d) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
            System.out.println("Saldo atual: " + saldo);
        } else {
            throw new RuntimeException("Valor do saque deve ser maior que zero e menor que o saldo atual!");
        }
    }

    /**
     * Operação simples para ver o saldo.
     */
    @Override
    public void verSaldo() {
        System.out.println("Cliente: " + titular.getNome());
        System.out.println("Número Conta: " + this.NumeroConta);
        System.out.println("Saldo Atual: R$ " + String.format("%.2f", saldo));
    }

    /**
     * @param valor         valor para transferir, são regras do negócio:
     *                      1- O valor da transferência deve ser maior que zero;
     *                      2- O valor da transferência deve ser menor ou igual ao saldo.
     * @param constaDestino conta para onde o valor será transferido, são regras do negócio:
     *                      1- Transferência entre contas de mesma titularidade, não há cobrança de taxa de transferência;
     *                      2- Transferência entre contas de titularidades distintas, há cobrança de taxa de transferência.
     */
    @Override
    public void transferir(double valor, Conta constaDestino) {

        if (valor > 0.00d && valor <= saldo) {

            if (constaDestino.titular.getNome().equals(titular.getNome())) {

                saldo -= valor;
                constaDestino.setSaldo(constaDestino.getSaldo() + valor);
                System.out.println("Transferência entre contas do mesmo titular: " + titular.getNome());
                System.out.println("Transferência sem custo efetuada com sucesso!");
                System.out.println("Saldo atual R$: " + String.format("%.2f", saldo));

            } else {
                saldo -= valor;
                constaDestino.setSaldo(constaDestino.getSaldo() + valor);
                saldo -= TAXA_TRANSFERENCIA;
                System.out.println("Transferência entre contas com titulares diferentes : " + titular.getNome() + " -> " + constaDestino.titular.getNome());
                System.out.println("Transferência com custo de R$" + TAXA_TRANSFERENCIA + " efetuada com sucesso!");
                System.out.println("Saldo atual R$: " + String.format("%.2f", saldo));
            }
        } else {
            throw new RuntimeException("Valor da transferência deve ser maior que zero e menor que o saldo atual!");
        }

    }

    /**
     * Exibi informações do titular relacionadas à sua conta.
     */
    @Override
    public void infoTitular() {
        System.out.println("Nome do titular: " + titular.getNome());
        System.out.println("ID do titular: " + titular.getId());
        System.out.println("Agência do titular: " + getAgencia());
        System.out.println("Numero Conta do titular: " + getNumeroConta());
    }

    public Double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumeroConta() {
        return NumeroConta;
    }

    public String getTitular() {
        return titular.getNome();
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

}
