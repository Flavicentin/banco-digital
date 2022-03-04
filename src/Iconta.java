//interface é uma classe abstrata com todos os metodos abstrados

public interface Iconta {

    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, Conta contaDestino);

    void imprimirExtrato();
}
