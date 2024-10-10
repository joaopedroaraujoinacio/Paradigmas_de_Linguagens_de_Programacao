#atividade 06/09/24
#aluno: João Pedro Araújo Inácio
#questao2

class Carro:
    def __init__(self, marca, modelo, ano):
        self.marca = marca
        self.modelo = modelo
        self.ano = ano
        self.velocidade = 0 

    def acelerar(self, incremento):
        self.velocidade += incremento
        print(f"{self.modelo} acelerou para {self.velocidade} km/h")

    def frear(self, decremento):
        self.velocidade -= decremento
        if self.velocidade < 0:
            self.velocidade = 0
        print(f"{self.modelo} desacelerou para {self.velocidade} km/h")

    def exibir_velocidade(self):
        print(f"Velocidade atual do {self.modelo}: {self.velocidade} km/h")


carro1 = Carro("volkswagen", "Polo", 2009)

carro1.acelerar(30)
carro1.frear(10)
carro1.exibir_velocidade()
