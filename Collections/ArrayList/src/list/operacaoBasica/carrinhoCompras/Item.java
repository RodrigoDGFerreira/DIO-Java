package list.operacaoBasica.carrinhoCompras;

public class Item {
    String nome;
    double preco;
    int quantidade;



    public Item(String produto, double valor, int quantos) {
        this.nome = produto;
        this.preco = valor;
        this.quantidade = quantos;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String toString() {
        return nome;
    }
}
