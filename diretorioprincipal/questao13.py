#atividade 06/09/24
#aluno: João Pedro Araújo Inácio
#questao13

class Matematica:

    @staticmethod
    def fatorial(n):
        if n == 0 or n == 1:
            return 1
        else:
            return n * Matematica.fatorial(n - 1)


print(Matematica.fatorial(4))  
