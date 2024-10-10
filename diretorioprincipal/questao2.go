//atividade 06/09/24
//aluno: João Pedro Araújo Inácio
//questao2

package main

import "fmt"

type Carro struct {
    Marca      string
    Modelo     string
    Ano        int
    Velocidade int
}

func (c *Carro) Acelerar(incremento int) {
    c.Velocidade += incremento
    fmt.Printf("%s acelerou para %d km/h\n", c.Modelo, c.Velocidade)
}

func (c *Carro) Frear(decremento int) {
    c.Velocidade -= decremento
    if c.Velocidade < 0 {
        c.Velocidade = 0
    }
    fmt.Printf("%s desacelerou para %d km/h\n", c.Modelo, c.Velocidade)
}

func (c Carro) ExibirVelocidade() {
    fmt.Printf("Velocidade atual do %s: %d km/h\n", c.Modelo, c.Velocidade)
}

func main() {

    carro1 := Carro{"volkswagen", "polo", 2009, 0}

    carro1.Acelerar(30)
    carro1.Frear(10)
    carro1.ExibirVelocidade()
}
