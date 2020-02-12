package BancoRD;



public class Contas {
    public Cliente cliente;
    private double saldo;

    public Contas(){

    }
    public Contas(Cliente cliente, double saldo){
        this.saldo = saldo;
        this.cliente = cliente;

    }

    public void consultarSaldo(){
        System.out.println("seu saldo é :" +saldo);
    }

    public void depositar(double deposito){
            System.out.println("Seu saldo era: " + this.saldo);
            this.saldo = saldo + deposito;
            System.out.println("Seu saldo atual é: " + saldo);
    }

    public void sacar(double saque){
        if (saldo >= saque){
            System.out.println("Seu saldo atual é: " +saldo);
        } else{
            System.out.println("Saldo insuficiente para saque" +saldo);
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}


