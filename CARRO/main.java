import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Carro> carros = List.of(
            new Carro("Toyota", "Corolla", 2020),
            new Carro("Honda", "Civic", 2019)
        );

        System.out.println("=== Informações Iniciais ===");
        for (Carro carro : carros) {
            System.out.println(carro);
        }

        // Atualizar dados do segundo carro
        carros.get(1).atualizarDados("Ford", "Focus", 2021);

        System.out.println("\n=== Após Atualização ===");
        for (Carro carro : carros) {
            System.out.println(carro);
        }

        System.out.println("\n=== Ações ===");
        for (Carro carro : carros) {
            carro.ligar();
            carro.desligar();
        }
    }
}
