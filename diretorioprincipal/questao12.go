//atividade 06/09/24
//aluno: João Pedro Araújo Inácio
//questao12

package main

import "fmt"

type Produto struct {
    nome  string
    preco float64
}

func (p Produto) Somar(outroProduto Produto) Produto {
    return Produto{"Soma de Produtos", p.preco + outroProduto.preco}
}

func main() {
    produto1 := Produto{"Produto 1", 50.0}
    produto2 := Produto{"Produto 2", 75.0}

    somaProdutos := produto1.Somar(produto2)
    fmt.Printf("%s: R$%.2f\n", somaProdutos.nome, somaProdutos.preco)  
}
