public class Cliente {
    private final String nome;
    private final String email;
    private final String telefone;

    public Cliente(String nome, String email, String telefone) {
        if (nome == null || nome.isBlank()) throw new IllegalArgumentException("Nome inválido.");
        if (email == null || email.isBlank()) throw new IllegalArgumentException("Email inválido.");
        if (telefone == null || telefone.isBlank()) throw new IllegalArgumentException("Telefone inválido.");

        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public void exibirDados() {
        System.out.printf("Cliente: %s | Email: %s | Telefone: %s%n", nome, email, telefone);
    }

    public void comprar(Livro livro, int quantidade) {
        System.out.printf("%s está tentando comprar %d unidade(s) do livro '%s'.%n", nome, quantidade, livro.getTitulo());
        boolean sucesso = livro.vender(quantidade);
        if (sucesso) {
            double total = livro.getPreco() * quantidade;
            System.out.printf("Compra realizada com sucesso! Total: R$%.2f%n", total);
        } else {
            System.out.println("Compra não realizada.");
        }
    }
}
