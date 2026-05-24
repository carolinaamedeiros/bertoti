public class Servico {
    private String nome;
    private Double valor;

    public Servico(String nome, Double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return this.valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public void exibirConfirmacao() {
        System.out.println("O serviço " + this.nome + " foi cadastrado com o valor R$ " + this.valor);
    }

    public boolean comparar(Servico servico) {
        return this.nome.equals(servico.nome) && this.valor.equals(servico.valor);
    }
}