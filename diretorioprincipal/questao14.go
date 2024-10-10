//atividade 06/09/24
//aluno: João Pedro Araújo Inácio
//questao14

package main

import (
    "fmt"
    "sync"
)

type Configuracao struct{}

var instancia *Configuracao
var once sync.Once

func GetInstancia() *Configuracao {
    once.Do(func() {
        instancia = &Configuracao{}
        fmt.Println("Configuraçoes carregadas")
    })
    return instancia
}

func (c *Configuracao) ExibirConfiguracao() {
    fmt.Println("mostrando configuraçoes")
}

func main() {
    config1 := GetInstancia()
    config2 := GetInstancia()

    fmt.Println(config1 == config2)  
    config1.ExibirConfiguracao()
}
