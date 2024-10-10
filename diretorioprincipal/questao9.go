//atividade 06/09/24
//aluno: João Pedro Araújo Inácio
//questao9

package main

import "fmt"

type Imprimivel interface {
    Imprimir()
}

type Relatorio struct{}

func (r Relatorio) Imprimir() {
    fmt.Println("imprimindo relatorio")
}

type Contrato struct{}

func (c Contrato) Imprimir() {
    fmt.Println("Imprimindo contrato")
}

func main() {
    var imprimivel Imprimivel

    imprimivel = Relatorio{}
    imprimivel.Imprimir()

    imprimivel = Contrato{}
    imprimivel.Imprimir()
}