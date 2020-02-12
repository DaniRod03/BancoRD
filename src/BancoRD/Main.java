package BancoRD;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Daniel", "53147357", "48092591881");
        Contas conta1 = new ContaPoupanca(cliente1, 100, 5);
        ((ContaPoupanca) conta1).depositar(200);
        Contas conta2 = new ContaCorrente(cliente1, 200, 200);



    }
}
