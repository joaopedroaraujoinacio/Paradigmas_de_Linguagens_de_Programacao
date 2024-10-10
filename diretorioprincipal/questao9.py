#atividade 06/09/24
#aluno: João Pedro Araújo Inácio
#questao9

from typing import Protocol

class Imprimivel(Protocol):
    def imprimir(self) -> None:
        ...

class Relatorio:
    def imprimir(self) -> None:
        print("imprimindo relatorio")

class Contrato:
    def imprimir(self) -> None:
        print("imprimindo Contrato")

def imprimir_documento(doc: Imprimivel) -> None:
    doc.imprimir()

relatorio = Relatorio()
contrato = Contrato()

imprimir_documento(relatorio)
imprimir_documento(contrato)
