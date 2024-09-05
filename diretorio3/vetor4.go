//atividade 30/08/24
//aluno: João Pedro Araújo Inácio

package main

import (
	"fmt"
)

func main() {

	var numbers [5]int
	var sumEven int
	var countOdd int

	fmt.Println("informe 5 numeros inteiros:")

	for i := 0; i < 5; i++ {
		fmt.Scan(&numbers[i])
	}

	fmt.Print("numeros pares digitados: ")

	for _, num := range numbers {
		if num%2 == 0 {
			fmt.Print(num, " ")
			sumEven += num
		}
	}
	fmt.Println()

	fmt.Println("soma numeros pares:", sumEven)

	fmt.Print("numeros impares digitados: ")
	for _, num := range numbers {
		if num%2 != 0 {
			fmt.Print(num, " ")
			countOdd++
		}
	}
	fmt.Println()

	fmt.Println("quantidade numeros impares:", countOdd)
}
