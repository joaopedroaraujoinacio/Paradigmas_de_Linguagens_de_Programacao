#atividade 06/09/24
#aluno: João Pedro Araújo Inácio
#questao6

class Motor:
    def __init__(self, cilindradas):
        self.cilindradas = cilindradas

    def detalhes(self):
        return f"Motor de {self.cilindradas} cilindradas"

class Carro:
    def __init__(self, marca, modelo, motor):
        self.marca = marca
        self.modelo = modelo
        self.motor = motor 

    def detalhes(self):
        return f"Carro {self.marca} {self.modelo}, {self.motor.detalhes()}"

motor = Motor(2000)

carro = Carro("volkswagen", "Polo", motor)

print(carro.detalhes())
