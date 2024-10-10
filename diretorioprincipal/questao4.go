//atividade 06/09/24
//aluno: João Pedro Araújo Inácio
//questao4

package main

import "fmt"


type Animal interface {
    Som() string
}


type Cachorro struct {
    nome string
}

func (c Cachorro) Som() string {
    return c.nome + " late ruf ruf"
}


type Gato struct {
    nome string
}

func (g Gato) Som() string {
    return g.nome + " mia miau"
}


func EmitirSons(animais []Animal) {
    for _, animal := range animais {
        fmt.Println(animal.Som())
    }
}

func main() {
    cachorro := Cachorro{nome: "fred"}
    gato := Gato{nome: "yoyo"}

    animais := []Animal{cachorro, gato}
    EmitirSons(animais)
}