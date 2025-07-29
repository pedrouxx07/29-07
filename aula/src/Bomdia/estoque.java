package Bomdia;

public class estoque {
    private String tipo;
    private String nome;
    private int quantidade;
    private double valordaunidade;

    public estoque(String tipo, String nome, int quantidade, double valordaunidade) {
        this.tipo = tipo;
        this.nome = nome;
        this.quantidade = quantidade;
        this.valordaunidade = valordaunidade;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getValorUnitario() {
        return valordaunidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorTotal() {
        return quantidade * valordaunidade;
    }

    public String toString() {
        return "Tipo: " + tipo +
               " \n Nome: " + nome +
               " \n Quantidade: " + quantidade +
               "  \nValor Unitario: R$" + String.format("%.2f", valordaunidade);
    }
}
