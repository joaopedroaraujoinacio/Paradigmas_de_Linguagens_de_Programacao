//atividade 06/09/24
//aluno: João Pedro Araújo Inácio
//questao3

package main

import "fmt"

type ContaBancaria struct {
    titular string
    saldo   float64
}

func NovaContaBancaria(titular string, saldoInicial float64) *ContaBancaria {
    return &ContaBancaria{titular: titular, saldo: saldoInicial}
}

func (c *ContaBancaria) Depositar(valor float64) {
    if valor > 0 {
        c.saldo += valor
        fmt.Printf("valor depositado: %.2f, saldo atual: %.2f\n", valor, c.saldo)
    } else {
        fmt.Println("Valor de deposito invalido.")
    }
}

func (c *ContaBancaria) Sacar(valor float64) {
    if valor > 0 && valor <= c.saldo {
        c.saldo -= valor
        fmt.Printf("Sacado: %.2f, saldo atual: %.2f\n", valor, c.saldo)
    } else {
        fmt.Println("Saldo insuficiente ou valor invalido.")
    }
}

func (c *ContaBancaria) GetSaldo() float64 {
    return c.saldo
}

func (c *ContaBancaria) GetTitular() string {
    return c.titular
}

func main() {
    conta := NovaContaBancaria("João Pedro", 1000)
    conta.Depositar(200)
    conta.Sacar(500)
    fmt.Printf("Saldo final: %.2f\n", conta.GetSaldo())
}
