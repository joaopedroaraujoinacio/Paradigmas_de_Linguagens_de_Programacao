#atividade 06/09/24
#aluno: João Pedro Araújo Inácio
#questao3

class ContaBancaria:
    def __init__(self, titular, saldo_inicial=0):
        self.__titular = titular
        self.__saldo = saldo_inicial

    def depositar(self, valor):
        if valor > 0:
            self.__saldo += valor
            print(f'valor depositado: {valor}, saldo atualmente: {self.__saldo}')
        else:
            print("valor de deposito invalido.")

    def sacar(self, valor):
        if 0 < valor <= self.__saldo:
            self.__saldo -= valor
            print(f'Sacado: {valor}, Saldo atual: {self.__saldo}')
        else:
            print("Saldo insuficiente ou valor invalido.")

    def get_saldo(self):
        return self.__saldo

    def get_titular(self):
        return self.__titular

conta = ContaBancaria('Joao Pedro', 1000)
conta.depositar(200)
conta.sacar(500)
print("Saldo final:", conta.get_saldo())