public class Livro {
    private final String titulo;
    private final String autor;
    private double preco;
    private int estoque;

    public Livro(String titulo, String autor, double preco, int estoque) {
        if (titulo == null || titulo.isBlank()) throw new IllegalArgumentException("Título inválido.");
        if (autor == null || autor.isBlank()) throw new IllegalArgumentException("Autor inválido.");
        if (preco < 0) throw new IllegalArgumentException("Preço não pode ser negativo.");
        if (estoque < 0) throw new IllegalArgumentException("Estoque não pode ser negativo.");

        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
        this.estoque = estoque;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public double getPreco() {
        return preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void aplicarDesconto(double percentual) {
        if (percentual < 0 || percentual > 100) {
            throw new IllegalArgumentException("Percentual de desconto inválido.");
        }
        preco -= preco * percentual / 100.0;
        System.out.printf("Desconto de %.2f%% aplicado. Novo preço: R$%.2f%n", percentual, preco);
    }

    public boolean vender(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Quantidade inválida.");
            return false;
        }

        if (quantidade > estoque) {
            System.out.printf("Estoque insuficiente para vender %d unidade(s).%n", quantidade);
            return false;
        }

        estoque -= quantidade;
        System.out.printf("%d unidade(s) do livro '%s' vendida(s).%n", quantidade, titulo);
        return true;
    }

    @Override
    public String toString() {
        return String.format("Título: %s | Autor: %s | Preço: R$%.2f | Estoque: %d",
                titulo, autor, preco, estoque);
    }
}
