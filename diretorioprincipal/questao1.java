//atividade 06/09/24
//aluno: João Pedro Araújo Inácio
//questao1

public class questao1 {
    
    static class Carro {
        String marca;
        String modelo;
        int ano;

        public Carro(String marca, String modelo, int ano) {
            this.marca = marca;
            this.modelo = modelo;
            this.ano = ano;
        }

        public String detalhes() {
            return "Carro: " + this.marca + " " + this.modelo + " (" + this.ano + ")";
        }
    }

    public static void main(String[] args) {

        Carro carro1 = new Carro("volkswagen", "Clio", 2005);
        Carro carro2 = new Carro("volkswagen", "Polo", 2009);
        Carro carro3 = new Carro("volkswagen", "Virtus", 2021);

        System.out.println(carro1.detalhes());
        System.out.println(carro2.detalhes());
        System.out.println(carro3.detalhes());
    }
}
