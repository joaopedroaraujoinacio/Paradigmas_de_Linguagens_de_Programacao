//atividade 06/09/24
//aluno: João Pedro Araújo Inácio
//questao2

public class questao2 {

    static class Carro {
        String marca;
        String modelo;
        int ano;
        int velocidade;

        public Carro(String marca, String modelo, int ano) {
            this.marca = marca;
            this.modelo = modelo;
            this.ano = ano;
            this.velocidade = 0; 
        }

        public void acelerar(int incremento) {
            this.velocidade += incremento;
            System.out.println(this.modelo + " acelerou para " + this.velocidade + " km/h");
        }

        public void frear(int decremento) {
            this.velocidade -= decremento;
            if (this.velocidade < 0) {
                this.velocidade = 0;
            }
            System.out.println(this.modelo + " desacelerou para " + this.velocidade + " km/h");
        }

        public void exibirVelocidade() {
            System.out.println("Velocidade atual do " + this.modelo + ": " + this.velocidade + " km/h");
        }
    }

    public static void main(String[] args) {

        Carro carro1 = new Carro("volkswagen", "polo", 2009);

        carro1.acelerar(30);
        carro1.frear(10);
        carro1.exibirVelocidade();
    }
}