package list.operacaoBasica.carrinhoCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompra {
    private List<Item> carrinhoCompras;

    public CarrinhoCompra(){
        this.carrinhoCompras = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        carrinhoCompras.add(new Item(nome,preco,quantidade));
    }
    public void removerItem(String nome){
        List<Item> itemParaRemover = new ArrayList<>();
        for(Item i : carrinhoCompras){
            if (i.getNome().equalsIgnoreCase(nome)){
                itemParaRemover.add(i);
            }
        }
        carrinhoCompras.removeAll(itemParaRemover);
    }
    public double calcularValorTotal(){
        double calcularValorTotal = 0;
        for(Item i : carrinhoCompras){
            calcularValorTotal += i.getPreco() * i.getQuantidade();

        }
        return calcularValorTotal;

    }
    public void exibirItens(){
        System.out.println(carrinhoCompras);
    }

    public static void main(String[] args) {
        CarrinhoCompra carrinho1 = new CarrinhoCompra();
        System.out.println("Numero de itens no carrinho é : R$" + carrinho1.calcularValorTotal());
        carrinho1.adicionarItem("Refri",7.30,1);
        carrinho1.adicionarItem("Carne",20.00,1);
        carrinho1.adicionarItem("Carne",20.00,1);
        carrinho1.adicionarItem("bolacha",3.00,3);
        carrinho1.removerItem("Carne");
        System.out.println("Numero de itens no carrinho é : R$" + carrinho1.calcularValorTotal());
        carrinho1.exibirItens();

    }


}
