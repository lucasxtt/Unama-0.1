public class ContaBancaria {
    private final String numeroConta;
    private final String titular;
    private double saldo;

    public ContaBancaria(String numeroConta, String titular, double saldoInicial) {
        if (numeroConta == null || numeroConta.isBlank()) {
            throw new IllegalArgumentException("Número da conta não pode ser vazio.");
        }
        if (titular == null || titular.isBlank()) {
            throw new IllegalArgumentException("Titular não pode ser vazio.");
        }
        if (saldoInicial < 0) {
            throw new IllegalArgumentException("Saldo inicial não pode ser negativo.");
        }

        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de depósito inválido: R$" + valor);
            return false;
        }
        saldo += valor;
        System.out.printf("Depósito de R$%.2f realizado com sucesso.%n", valor);
        return true;
    }

    public boolean sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de saque inválido: R$" + valor);
            return false;
        }
        if (valor > saldo) {
            System.out.printf("Saldo ins
