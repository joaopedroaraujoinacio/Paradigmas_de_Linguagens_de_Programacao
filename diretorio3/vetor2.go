//atividade 30/08/24
//aluno: João Pedro Araújo Inácio

package main

import (
	"fmt"
)

func main() {

	vetor := []int{1, 13, 8, 24, 35, 81, 31, 14, 3, 2}

	soma := 0
	maiorValor := vetor[0]
	menorValor := vetor[0]

	for _, valor := range vetor {
		soma += valor
		if valor > maiorValor {
			maiorValor = valor
		}

		if valor < menorValor {
			menorValor = valor
		}
	}

	media := float64(soma) / float64(len(vetor))

	fmt.Printf("media: %.2f\n", media)
	fmt.Printf("maior valor: %d\n", maiorValor)
	fmt.Printf("menor valor: %d\n", menorValor)
}
