#atividade 06/09/24
#aluno: João Pedro Araújo Inácio
#questao4

class Animal:
    def __init__(self, nome):
        self.nome = nome

class Cachorro(Animal):
    def som(self):
        return f"{self.nome} late ruf ruf"

class Gato(Animal):
    def som(self):
        return f"{self.nome} mia miau"


def emitir_sons(animais):
    for animal in animais:
        print(animal.som())

cachorro = Cachorro("noah")
gato = Gato("memel")

animais = [cachorro, gato]
emitir_sons(animais)