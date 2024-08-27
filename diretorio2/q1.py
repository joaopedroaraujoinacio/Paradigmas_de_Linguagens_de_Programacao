#atividade do dia 23/08/24
#aluno: João Pedro Araújo Inácio

from funcoes import novoVetor, valores, somaVetor

def main():

    vetor = novoVetor(3)
    x,y = valores()
    soma = somaVetor(vetor,x,y)
    print(f"A soma dos valores nas posições x e y vale: {soma}")

if __name__ == "__main__":
    main()