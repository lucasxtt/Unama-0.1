import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ContaBancaria> contas = List.of(
            new ContaBancaria("001", "Carlos", 1000.0),
            new ContaBancaria("002", "Mariana", 500.0)
        );

        System.out.println("=== INFORMAÇÕES INICIAIS ===");
        contas.forEach(System.out::println);

        System.out.println("\n=== OPERAÇÕES NA CONTA DE CARLOS ===");
        ContaBancaria contaCarlos = contas.get(0);
        contaCarlos.consultarSaldo();
        contaCarlos.depositar(200.0);
        contaCarlos.sacar(300.0);
        contaCarlos.consultarSaldo();

        System.out.println("\n=== OPERAÇÕES NA CONTA DE MARIANA ===");
        ContaBancaria contaMariana = contas.get(1);
        contaMariana.consultarSaldo();
        contaMariana.depositar(100.0);
        contaMariana.sacar(700.0); // tentativa de saque maior que saldo
        contaMariana.consultarSaldo();
    }
}
