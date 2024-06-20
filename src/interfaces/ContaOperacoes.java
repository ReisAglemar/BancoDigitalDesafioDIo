package interfaces;

import entidades.Cliente;
import entidades.Conta;

public interface ContaOperacoes {

    /**
     * @param valor valor para depositar.
     */
    void depositar(double valor);

    /**
     * @param valor valor para sacar.
     */
    void sacar(double valor);

    /**
     * Imprimi o saldo na tela.
     */
    void verSaldo();

    /**
     * @param valor         valor de transferência;
     * @param constaDestino conta de destino da transferência.
     */
    void transferir(double valor, Conta constaDestino);

    /**
     * Imprimi as informações do titular na tela.
     */
    void infoTitular();
}
