//atividade 06/09/24
//aluno: João Pedro Araújo Inácio
//questao15

class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(double saldo, double valorSaque) {
        super("Saque de " + valorSaque + " não permitido. Saldo disponível: " + saldo);
    }
}

class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor > saldo) {
            throw new SaldoInsuficienteException(saldo, valor);
        }
        saldo -= valor;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public double getSaldo() {
        return saldo;
    }
}

public class questao15 {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("joao", 1111);

        try {
            conta.sacar(1500);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage()); 
        }
    }
}
