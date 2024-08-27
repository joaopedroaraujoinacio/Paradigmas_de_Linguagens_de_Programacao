#atividade do dia 23/08/24
#aluno: João Pedro Araújo Inácio

from funcoes import novoVetor, maiorMenorVetor

def main():

    vetor = novoVetor(10)
    maior, menor = maiorMenorVetor(vetor)
    print(f"Maior elemento do vetor vale: {maior}")
    print(f"Menor elemento do vetor vale: {menor}")

if __name__ == "__main__":
    main()