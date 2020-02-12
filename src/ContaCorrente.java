import BancoRD.Cliente;
import BancoRD.Contas;

public class ContaCorrente extends Contas {
    private double limiteCheque;

    public ContaCorrente(Cliente cliente, double saldo, double limiteCheque) {
        super(cliente, saldo);
        this.limiteCheque = limiteCheque;
    }

     public void sacar(double saque){
        if (getSaldo() <= 0){
            if (saque <= limiteCheque){
                double limiteResto = limiteCheque - saque;
                setSaldo(limiteResto - limiteCheque);
                System.out.println("Seu saldo atual: " +getSaldo());
            }else if(getSaldo() < saque){
                if (saque > limiteCheque)
                    System.out.println("Dinheiro insuficiente" +getSaldo());
            }
        }
        else {
            setSaldo(getSaldo() - saque); ;
            System.out.println("Seu saldo atual "+"" +getSaldo() );
            System.out.println("---------------");
            System.out.println("Seu Saldo de cheque especial: " + "" + limiteCheque);
        }
    }
}
