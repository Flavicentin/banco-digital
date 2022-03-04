public class Main {
    public static void main(String[] args){
        Cliente cleison = new Cliente();
        cleison.setNome("Cleison");

        Conta cc = new ContaCorrente(cleison);
        cc.depositar(150);

        Conta poupanca = new ContaPoupanca(cleison);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
