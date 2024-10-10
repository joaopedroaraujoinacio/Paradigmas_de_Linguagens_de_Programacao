#atividade 06/09/24
#aluno: João Pedro Araújo Inácio
#questao8

class Empregado:
    def __init__(self, nome, cargo, salario):
        self.nome = nome
        self.cargo = cargo
        self.salario = salario

    def exibir_info(self):
        return f"nome: {self.nome}, Cargo: {self.cargo}, salario: {self.salario}"

class Empresa:
    def __init__(self, nome_empresa):
        self.nome_empresa = nome_empresa
        self.empregados = []

    def adicionar_empregado(self, empregado):
        self.empregados.append(empregado)

    def exibir_empregados(self):
        print(f"funcionarios da {self.nome_empresa}:")
        for empregado in self.empregados:
            print(empregado.exibir_info())

empresa = Empresa("costamar")
emp1 = Empregado("fabiano", "PO", 1000)
emp2 = Empregado("josemar", "Gerente de Projetos", 2000)

empresa.adicionar_empregado(emp1)
empresa.adicionar_empregado(emp2)

empresa.exibir_empregados()
