#atividade 06/09/24
#aluno: João Pedro Araújo Inácio
#questao11

from abc import ABC, abstractmethod

class Funcionario(ABC):

    @abstractmethod
    def calcular_salario(self):
        pass

class FuncionarioHorista(Funcionario):
    
    def __init__(self, horas_trabalhadas, valor_por_hora):
        self.horas_trabalhadas = horas_trabalhadas
        self.valor_por_hora = valor_por_hora

    def calcular_salario(self):
        return self.horas_trabalhadas * self.valor_por_hora

class FuncionarioAssalariado(Funcionario):
    
    def __init__(self, salario_fixo):
        self.salario_fixo = salario_fixo

    def calcular_salario(self):
        return self.salario_fixo

horista = FuncionarioHorista(110, 15)
assalariado = FuncionarioAssalariado(2000)

print("Salario do func horista:", horista.calcular_salario())
print("Salario do funco assalariado:", assalariado.calcular_salario())
