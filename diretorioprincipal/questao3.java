//atividade 06/09/24
//aluno: João Pedro Araújo Inácio
//questao3

public class questao3 {

    static class ContaBancaria {
        private String titular;
        private double saldo;

        public ContaBancaria(String titular, double saldoInicial) {
            this.titular = titular;
            this.saldo = saldoInicial;
        }

        public void depositar(double valor) {
            if (valor > 0) {
                this.saldo += valor;
                System.out.println(this.titular + " depositou " + valor + ". Saldo atual: " + this.saldo);
            }
        }

        public void sacar(double valor) {
            if (valor > 0 && valor <= this.saldo) {
                this.saldo -= valor;
                System.out.println(this.titular + " sacou " + valor + ". Saldo atual: " + this.saldo);
            } else {
                System.out.println(this.titular + " tentou sacar " + valor + ", mas o saldo é insuficiente.");
            }
        }

        public void exibirSaldo() {
            System.out.println("Saldo de " + this.titular + ": " + this.saldo);
        }
    }

    public static void main(String[] args) {
 
        ContaBancaria conta = new ContaBancaria("João Pedro", 1000);

        conta.depositar(500);
        conta.sacar(200);
        conta.exibirSaldo();
    }
}

