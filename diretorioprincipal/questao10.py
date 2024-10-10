#atividade 06/09/24
#aluno: João Pedro Araújo Inácio
#questao10

class Calculadora:
    def somar(self, a, b, c=None):
        if c is None:
            return a + b
        return a + b + c

calc = Calculadora()

print("soma de 2 numeros:", calc.somar(10, 20))
print("Soma de 3 numeros:", calc.somar(10, 20, 30))
