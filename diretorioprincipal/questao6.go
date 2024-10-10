//atividade 06/09/24
//aluno: João Pedro Araújo Inácio
//questao6

package main

import "fmt"

type Motor struct {
    cilindradas int
}

func (m Motor) detalhes() string {
    return fmt.Sprintf("Motor de %d cilindradas", m.cilindradas)
}

type Carro struct {
    marca  string
    modelo string
    motor  Motor  
}

func (c Carro) detalhes() string {
    return fmt.Sprintf("Carro %s %s, %s", c.marca, c.modelo, c.motor.detalhes())
}

func main() {
    motor := Motor{cilindradas: 2000}

    carro := Carro{marca: "Toyota", modelo: "Corolla", motor: motor}

    fmt.Println(carro.detalhes())
}
