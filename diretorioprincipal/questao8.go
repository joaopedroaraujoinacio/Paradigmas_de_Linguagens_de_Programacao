//atividade 06/09/24
//aluno: João Pedro Araújo Inácio
//questao8

package main

import "fmt"

type Empregado struct {
	nome   string
	cargo  string
	salario float64
}

func (e Empregado) ExibirInfo() string {
	return fmt.Sprintf("Nome: %s, Cargo: %s, Salario: %.2f", e.nome, e.cargo, e.salario)
}

type Empresa struct {
	nomeEmpresa string
	empregados  []Empregado
}

func (e *Empresa) AdicionarEmpregado(empregado Empregado) {
	e.empregados = append(e.empregados, empregado)
}

func (e Empresa) ExibirEmpregados() {
	fmt.Println("empregados da", e.nomeEmpresa)
	for _, empregado := range e.empregados {
		fmt.Println(empregado.ExibirInfo())
	}
}

func main() {
	empresa := Empresa{nomeEmpresa: "costamar"}

	emp1 := Empregado{nome: "ricardo", cargo: "Desenvolvedor", salario: 5000}
	emp2 := Empregado{nome: "renan", cargo: "PO", salario: 7000}

	empresa.AdicionarEmpregado(emp1)
	empresa.AdicionarEmpregado(emp2)

	empresa.ExibirEmpregados()
}