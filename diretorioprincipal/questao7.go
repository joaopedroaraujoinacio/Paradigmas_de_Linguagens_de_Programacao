//atividade 06/09/24
//aluno: João Pedro Araújo Inácio
//questao7

package main

import "fmt"

type Professor struct {
	nome     string
	escolas  []*Escola
}

type Escola struct {
	nome       string
	professores []*Professor
}

func (p *Professor) AdicionarEscola(e *Escola) {

	for _, escola := range p.escolas {
		if escola == e {
			return
		}
	}
	p.escolas = append(p.escolas, e)
	e.AdicionarProfessor(p)
}

func (e *Escola) AdicionarProfessor(p *Professor) {

	for _, professor := range e.professores {
		if professor == p {
			return
		}
	}
	e.professores = append(e.professores, p)
}

func main() {

	escola1 := &Escola{nome: "motiva"}
	escola2 := &Escola{nome: "evolucao"}

	professor1 := &Professor{nome: "hailton"}
	professor2 := &Professor{nome: "job"}

	professor1.AdicionarEscola(escola1)
	professor1.AdicionarEscola(escola2)
	professor2.AdicionarEscola(escola1)

	fmt.Println("professores na", escola1.nome)
	for _, professor := range escola1.professores {
		fmt.Println(professor.nome)
	}

	fmt.Println("escolas do", professor1.nome)
	for _, escola := range professor1.escolas {
		fmt.Println(escola.nome)
	}
}
