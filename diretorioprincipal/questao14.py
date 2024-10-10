#atividade 06/09/24
#aluno: João Pedro Araújo Inácio
#questao14

class Configuracao:
    _instancia = None

    def __new__(cls):
        if cls._instancia is None:
            cls._instancia = super(Configuracao, cls).__new__(cls)
            print("configuraçoes carregadas")
        return cls._instancia

    def exibir_configuracao(self):
        print("exibindo as configuraçoes")

config1 = Configuracao()
config2 = Configuracao()

print(config1 == config2) 
config1.exibir_configuracao()
