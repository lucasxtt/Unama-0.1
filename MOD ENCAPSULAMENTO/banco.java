public class ContaBancaria {
    private int numeroConta;
    private double saldo;

    public ContaBancaria(int numeroConta, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
    }
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }
    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            return true;
        }
        return false;
    }
    public double getSaldo() {
        return saldo;
    }
    public int getNumeroConta() { 
        return numeroConta;
    }
}

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(0, 0.0);
        System.out.println("Conta: " + conta.getNumeroConta() + " | Saldo Inicial: R$" + conta.getSaldo());
        conta.depositar(0);
        System.out.println("Após depósito de R$| Saldo: R$" + conta.getSaldo());

        if (conta.sacar(0)) {
            System.out.println("Após saque de R$ | Saldo: R$" + conta.getSaldo());
        } else {
            System.out.println("Saque de R$ falhou. Saldo: R$" + conta.getSaldo());
        }
        if (conta.sacar(0)) {
            System.out.println("Após saque de R$ | Saldo: R$" + conta.getSaldo());
        } else {
            System.out.println("Saque de R$ falhou. Saldo: R$" + conta.getSaldo());
        }
    }
}