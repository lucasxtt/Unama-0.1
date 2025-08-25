public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private boolean ligado;

    public Carro(String marca, String modelo, int ano) {
        validarMarca(marca);
        validarModelo(modelo);
        validarAno(ano);

        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.ligado = false;
    }

    private void validarMarca(String marca) {
        if (marca == null || marca.isBlank()) {
            throw new IllegalArgumentException("Marca não pode ser vazia.");
        }
    }

    private void validarModelo(String modelo) {
        if (modelo == null || modelo.isBlank()) {
            throw new IllegalArgumentException("Modelo não pode ser vazio.");
        }
    }

    private void validarAno(int ano) {
        int anoAtual = java.time.Year.now().getValue();
        if (ano < 1886 || ano > anoAtual + 1) {
            throw new IllegalArgumentException("Ano inválido: " + ano);
        }
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void atualizarDados(String novaMarca, String novoModelo, int novoAno) {
        validarMarca(novaMarca);
        validarModelo(novoModelo);
        validarAno(novoAno);

        this.marca = novaMarca;
        this.modelo = novoModelo;
        this.ano = novoAno;
    }

    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.printf("O carro %s %s foi ligado.%n", marca, modelo);
        } else {
            System.out.printf("O carro %s %s já está ligado.%n", marca, modelo);
        }
    }

    public void desligar() {
        if (ligado) {
            ligado = false;
            System.out.printf("O carro %s %s foi desligado.%n", marca, modelo);
        } else {
            System.out.printf("O carro %s %s já está desligado.%n", marca, modelo);
        }
    }

    @Override
    public String toString() {
        return String.format("Marca: %s | Modelo: %s | Ano: %d | Ligado: %s",
            marca, modelo, ano, ligado ? "Sim" : "Não");
    }
}
