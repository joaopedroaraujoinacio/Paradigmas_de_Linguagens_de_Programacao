//atividade 06/09/24
//aluno: João Pedro Araújo Inácio
//questao11

package main

import "fmt"

type Funcionario interface {
    CalcularSalario() float64
}

type FuncionarioHorista struct {
    horasTrabalhadas float64
    valorPorHora     float64
}

func (f FuncionarioHorista) CalcularSalario() float64 {
    return f.horasTrabalhadas * f.valorPorHora
}

type FuncionarioAssalariado struct {
    salarioFixo float64
}

func (f FuncionarioAssalariado) CalcularSalario() float64 {
    return f.salarioFixo
}

func main() {
    horista := FuncionarioHorista{horasTrabalhadas: 110, valorPorHora: 15}
    assalariado := FuncionarioAssalariado{salarioFixo: 2000}

    fmt.Println("Salario func horista:", horista.CalcularSalario())
    fmt.Println("Salario func assalariado:", assalariado.CalcularSalario())
}