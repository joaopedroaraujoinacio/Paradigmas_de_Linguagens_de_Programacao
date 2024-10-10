#atividade 06/09/24
#aluno: João Pedro Araújo Inácio
#questao15

class SaldoInsuficienteException(Exception):
    def __init__(self, saldo, valor_saque):
        super().__init__(f"saque de {valor_saque} não permitido. Saldo disponivel: {saldo}")
        self.saldo = saldo
        self.valor_saque = valor_saque

class ContaBancaria:
    def __init__(self, titular, saldo):
        self.titular = titular
        self.saldo = saldo

    def sacar(self, valor):
        if valor > self.saldo:
            raise SaldoInsuficienteException(self.saldo, valor)
        self.saldo -= valor
        return valor

    def depositar(self, valor):
        self.saldo += valor

conta = ContaBancaria("joao", 3333)

try:
    conta.sacar(1500)
except SaldoInsuficienteException as e:
    print(e)  
