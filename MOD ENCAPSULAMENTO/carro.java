public class Carro {
    private String marca;
    private int ano;

    public Carro(String marca, int ano) {
        this.marca = marca;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public int getAno() {
        return ano;
    }
}

public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Marca", 2023);
        System.out.println("Detalhes do carro");
        System.out.println("Marca: " + meuCarro.getMarca());
        System.out.println("Ano: " + meuCarro.getAno());
    }
}
