#atividade 06/09/24
#aluno: João Pedro Araújo Inácio
#questao7

class Professor:
    def __init__(self, nome):
        self.nome = nome
        self.escolas = []

    def adicionar_escola(self, escola):
        if escola not in self.escolas:
            self.escolas.append(escola)
            escola.adicionar_professor(self)

class Escola:
    def __init__(self, nome):
        self.nome = nome
        self.professores = []

    def adicionar_professor(self, professor):
        if professor not in self.professores:
            self.professores.append(professor)

escola1 = Escola("motiva")
escola2 = Escola("evolucao")

professor1 = Professor("Job")
professor2 = Professor("hailton")

professor1.adicionar_escola(escola1)
professor1.adicionar_escola(escola2)
professor2.adicionar_escola(escola1)

print(f"Professores na {escola1.nome}: {[prof.nome for prof in escola1.professores]}")
print(f"Professores na {escola2.nome}: {[prof.nome for prof in escola2.professores]}")
print(f"Escolas do {professor1.nome}: {[esc.nome for esc in professor1.escolas]}")