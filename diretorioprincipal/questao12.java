//atividade 06/09/24
//aluno: João Pedro Araújo Inácio
//questao12

class Produto {
    private String nome;
    private double preco;


    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public double somar(Produto outroProduto) {
        return this.preco + outroProduto.preco;
    }

    public double getPreco() {
        return this.preco;
    }

    public String getNome() {
        return this.nome;
    }
}

public class questao12 {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Notebook", 2000);
        Produto produto2 = new Produto("celular", 1500);

        double total = produto1.somar(produto2);
        System.out.println("Soma dos preços: R$" + total);
    }
}
