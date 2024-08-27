#atividade do dia 23/08/24
#aluno: João Pedro Araújo Inácio

import random

def cartelabingo():
    numeros = set()
    cartela = []
    for i in range(5):

        numero = random.randint(0,99)
        while numero in numeros:
            numero = random.randint(0,99)
        numeros.add(numero)
        cartela.append(numero)

    return cartela

def main():
    cartela = cartelabingo()
    print("sua cartela do bingo:")
    for linha in cartela:
        print(linha)

if __name__ == "__main__":
    main()