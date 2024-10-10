//atividade 06/09/24
//aluno: João Pedro Araújo Inácio
//questao6

public class questao6 {

    static class Motor {
        private int cilindradas;

        public Motor(int cilindradas) {
            this.cilindradas = cilindradas;
        }

        public String detalhes() {
            return "Motor de " + this.cilindradas + " cilindradas";
        }
    }

    static class Carro {
        private String marca;
        private String modelo;
        private Motor motor;  

        public Carro(String marca, String modelo, Motor motor) {
            this.marca = marca;
            this.modelo = modelo;
            this.motor = motor;
        }

        public String detalhes() {
            return "Carro " + this.marca + " " + this.modelo + ", " + this.motor.detalhes();
        }
    }

    public static void main(String[] args) {

        Motor motor = new Motor(2000);

        Carro carro = new Carro("volkswagen", "virtus", motor);

        System.out.println(carro.detalhes());
    }
}
