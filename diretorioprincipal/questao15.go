//atividade 06/09/24
//aluno: João Pedro Araújo Inácio
//questao15

package main

import (
    "errors"
    "fmt"
)

type ContaBancaria struct {
    saldo float64
}

func (c *ContaBancaria) Sacar(quantia float64) error {
    if quantia > c.saldo {
        return errors.New(fmt.Sprintf("saldo insuficiente para o saque de: R$%.2f", quantia))
    }
    c.saldo -= quantia
    fmt.Printf("saque concluido com sucesso, seu novo saldo: R$%.2f\n", c.saldo)
    return nil
}

func (c *ContaBancaria) GetSaldo() float64 {
    return c.saldo
}

func main() {
    conta := ContaBancaria{saldo: 100.0}
    err := conta.Sacar(200.0)  
    if err != nil {
        fmt.Println(err)
    }
}
