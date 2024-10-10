//atividade 06/09/24
//aluno: João Pedro Araújo Inácio
//questao1

package main

import "fmt"

type Carro struct {
    Marca  string
    Modelo string
    Ano    int
}

func (c Carro) detalhes() string {
    return fmt.Sprintf("Carro: %s %s (%d)", c.Marca, c.Modelo, c.Ano)
}

func main() {

    carro1 := Carro{"Renault", "Clio", 2005}
    carro2 := Carro{"Volkswagen", "Polo", 2009}
    carro3 := Carro{"Volkswagen", "Virtus", 2021}

    fmt.Println(carro1.detalhes())
    fmt.Println(carro2.detalhes())
    fmt.Println(carro3.detalhes())
}
