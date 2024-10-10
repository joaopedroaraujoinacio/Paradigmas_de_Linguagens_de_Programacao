#atividade 06/09/24
#aluno: João Pedro Araújo Inácio
#questao1

class Carro:
    def __init__(self, marca, modelo, ano):
        self.marca = marca
        self.modelo = modelo
        self.ano = ano

    def detalhes(self):
        return f"Marca do carro: {self.marca}, modelo do carro: {self.modelo} e ano do carro: {self.ano}"


carro1 = Carro("Renault", "Clio", 2004)

carro2 = Carro("volkswagen", "Polo", 2009)

carro3 = Carro("volkswagen", "Virtus", 2018)


print(carro1.detalhes())

print(carro2.detalhes())

print(carro3.detalhes())