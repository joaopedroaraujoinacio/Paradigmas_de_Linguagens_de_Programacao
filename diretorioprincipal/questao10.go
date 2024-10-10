//atividade 06/09/24
//aluno: João Pedro Araújo Inácio
//questao10

package main

import "fmt"

func somadois(a int, b int) int {
    return a + b
}

func somatres(a int, b int, c int) int {
    return a + b + c
}

func main() {
    fmt.Println("soma de 2 numeros:", somadois(10, 20))
    fmt.Println("soma de 3 numeros:", somatres(10, 20, 30))
}
