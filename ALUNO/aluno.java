public class Aluno {
    private final String nome;
    private final int matricula;
    private final double notaAv1;
    private final double notaAv2;

    public Aluno(String nome, int matricula, double notaAv1, double notaAv2) {
        validarNota(notaAv1, "AV1");
        validarNota(notaAv2, "AV2");

        this.nome = nome;
        this.matricula = matricula;
        this.notaAv1 = notaAv1;
        this.notaAv2 = notaAv2;
    }

    private void validarNota(double nota, String avaliacao) {
        if (nota < 0 || nota > 10) {
            throw new IllegalArgumentException("Nota da " + avaliacao + " deve estar entre 0 e 10.");
        }
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public double getNotaAv1() {
        return notaAv1;
    }

    public double getNotaAv2() {
        return notaAv2;
    }

    public double calcularMedia() {
        return (notaAv1 + notaAv2) / 2.0;
    }

    public StatusAprovacao getStatusAprovacao() {
        double media = calcularMedia();

        if (media >= 7.0) {
            return StatusAprovacao.APROVADO;
        } else if (media >= 4.0) {
            return StatusAprovacao.PROVA_FINAL;
        } else {
            return StatusAprovacao.REPROVADO;
        }
    }

    public void exibirInformacoes() {
        System.out.printf(
            "Aluno: %s | Matrícula: %d | AV1: %.2f | AV2: %.2f | Média: %.2f | Status: %s%n",
            nome, matricula, notaAv1, notaAv2, calcularMedia(), getStatusAprovacao().getDescricao()
        );
    }

    public enum StatusAprovacao {
        APROVADO("Aprovado"),
        PROVA_FINAL("Prova final"),
        REPROVADO("Reprovado");

        private final String descricao;

        StatusAprovacao(String descricao) {
            this.descricao = descricao;
        }

        public String getDescricao() {
            return descricao;
        }
    }
}
