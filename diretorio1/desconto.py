#atividade do dia 16/08/24
#aluno: João Pedro Araújo Inácio

def entrada ():
    preço = float(input("digite o preço: "))
    desconto = float(input("digite o desconto: "))

    resultado = preço * desconto / 100
    valor = preço - resultado

    print("desconto em %: ", desconto, "numa mercadoria de: ", preço)
    print("tem valor de: ", resultado)
    print("valor a pagar em reais: ", valor)
