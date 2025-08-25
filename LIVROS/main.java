public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Harry Potter", "Gabriel Silva", 59.90, 12);
        Livro livro2 = new Livro("Senhor dos anéis", "Fernanda Ribeiro", 79.90, 7);

        System.out.println("=== CATÁLOGO DE LIVROS ===");
        System.out.println(livro1);
        System.out.println(livro2);

        System.out.println("\n=== APLICANDO DESCONTO NO PRIMEIRO LIVRO ===");
        livro1.aplicarDesconto(15);
        System.out.println(livro1);

        Cliente cliente1 = new Cliente("Juliana Martins", "juliana@exemplo.com", "(11) 98765-4321");

        System.out.println("\n=== DADOS DO CLIENTE ===");
        cliente1.exibirDados();

        System.out.println("\n=== COMPRA DE LIVRO ===");
        cliente1.comprar(livro1, 3); 

        System.out.println("\n=== ESTOQUE ATUALIZADO ===");
        System.out.println(livro1);
    }
}
