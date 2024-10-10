#atividade 06/09/24
#aluno: João Pedro Araújo Inácio
#questao12

class Produto:
    def __init__(self, nome, preco):
        self.nome = nome
        self.preco = preco

    def __add__(self, other):
        if isinstance(other, Produto):
            return Produto("Soma produtos", self.preco + other.preco)
        return NotImplemented

    def __str__(self):
        return f"{self.nome}: R${self.preco:.2f}"

produto1 = Produto("Produto 1", 30.0)
produto2 = Produto("Produto 2", 65.0)

soma_produtos = produto1 + produto2
print(soma_produtos)  
