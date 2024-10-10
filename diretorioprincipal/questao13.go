//atividade 06/09/24
//aluno: João Pedro Araújo Inácio
//questao13


package main

import "fmt"

func Fatorial(n int) int {
    if n == 0 || n == 1 {
        return 1
    }
    return n * Fatorial(n - 1)
}

func main() {

    fmt.Println(Fatorial(4))  
}
