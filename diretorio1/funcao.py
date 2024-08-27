#atividade do dia 16/08/24
#aluno: João Pedro Araújo Inácio


def cigarros():
    cigarros_diaria = int(input("cigarros por dia: "))
    anos_cigarro = int(input("anos de fumo: "))

    reducao_min = anos_cigarro * 365 * cigarros_diaria * 10
    reducao_diaria = reducao_min / (24 * 60)

    print("a reducao de tempo de vida em dias foi de: ", reducao_diaria)


