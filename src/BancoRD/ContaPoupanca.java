package BancoRD;

public class ContaPoupanca extends Contas {
   private double juros;

    public ContaPoupanca(Cliente cliente, double saldo, double juros) {
        super(cliente, saldo);
        this.juros = juros;
    }

    public void recolherJuros(){
        this.juros = getSaldo() * (juros/100);
        setSaldo(getSaldo() + juros);
        System.out.println("O saldo de juros para recolher é: " + getSaldo());
    }
}