//atividade 06/09/24
//aluno: João Pedro Araújo Inácio
//questao9

public class questao9 {

    public interface Imprimivel {
        void imprimir();
    }

    public static class Relatorio implements Imprimivel {
        @Override
        public void imprimir() {
            System.out.println("imprimindo o relatorio");
        }
    }

    public static class Contrato implements Imprimivel {
        @Override
        public void imprimir() {
            System.out.println("Imprimindo o contrato");
        }
    }

    public static void main(String[] args) {
        Imprimivel relatorio = new Relatorio();
        Imprimivel contrato = new Contrato();
        
        relatorio.imprimir();
        contrato.imprimir();
    }
}
