//atividade 06/09/24
//aluno: João Pedro Araújo Inácio
//questao5

package main

import "fmt"

type Animal interface {
    som() string
}

type Cachorro struct {
    nome string
}

func (c Cachorro) som() string {
    return c.nome + " faz ruf ruf"
}

type Gato struct {
    nome string
}

func (g Gato) som() string {
    return g.nome + " faz Miau"
}

func emitirSons(animais []Animal) {
    for _, animal := range animais {
        fmt.Println(animal.som())
    }
}

func main() {
    animais := []Animal{
        Cachorro{nome: "Rex"},
        Gato{nome: "Mimi"},
    }

    emitirSons(animais)
}
