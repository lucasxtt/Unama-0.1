// Arquivo: Produto.java
public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        setPreco(preco);
    }
    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("Nome invalido.");
        }
    }
    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("Preço nao pode ser negativo");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("teste", 0 );
        System.out.println("Produto: " + produto.getNome() + " | Preço: R$" + produto.getPreco());

        produto.setPreco(0);
        System.out.println("Novo preço: R$" + produto.getPreco());
        produto.setPreco(0);
        System.out.println("Preço atual: R$" + produto.getPreco());
        produto.setNome("");
        System.out.println("Nome atual: " + produto.getNome());
    }
}