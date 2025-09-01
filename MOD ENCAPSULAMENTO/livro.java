public class App {
    public static void main(String[] args) {
        Biblioteca b = new Biblioteca(5);

        b.adicionarLivro(new Livro("teste", "teste"));
        b.adicionarLivro(new Livro("0000", "teste"));
        b.adicionarLivro(new Livro("teste"));

        b.emprestarLivro("000");
        b.devolverLivro("0000");
    }
}
class Livro {
    private String titulo, autor;
    private boolean disponivel = true;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() { return titulo; }
    public boolean isDisponivel() { return disponivel; }
    public void emprestar() { if (disponivel) disponivel = false; }
    public void devolver() { if (!disponivel) disponivel = true; }
}

class Biblioteca {
    private Livro[] livros;
    private int contador;

    public
}