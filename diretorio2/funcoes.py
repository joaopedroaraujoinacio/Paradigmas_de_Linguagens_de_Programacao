#atividade do dia 23/08/24
#aluno: João Pedro Araújo Inácio

def novoVetor(tamanho):

    vetor = [0] * tamanho
    for i in range(tamanho):
        vetor[i] = int(input(f"Digite  o valor da posição {i}: "))

    return vetor

def soma(x,y):

    soma = x + y
    return soma

def valores():

    x = int(input("insira valor de x: "))
    y = int(input("insira valor de y: "))
    return x,y

def somaVetor(vetor,x,y):
    
    s = soma(vetor[x],vetor[y])
    return s

def maiorMenorVetor(vetor):
    maior = vetor[0]
    menor = vetor[0]

    for i in range(1, len(vetor)):
        if vetor[i] > maior:
            maior = vetor[i]
        elif vetor[i] < menor:
            menor = vetor[i]

    return maior, menor