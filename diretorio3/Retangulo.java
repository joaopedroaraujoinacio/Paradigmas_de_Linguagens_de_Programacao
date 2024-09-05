//atividade 30/08/24
//aluno: João Pedro Araújo Inácio

public class Retangulo {
    private double comprimento;
    private double largura;

    public Retangulo(double comprimento, double largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public double calcularArea() {
        return comprimento * largura;
    }

    public double calcularPerimetro() {
        return 2 * (comprimento + largura);
    }

    public static void main(String[] args) {

        Retangulo ret = new Retangulo(200, 300);
        System.out.println("area obtida: " + ret.calcularArea());
        System.out.println("peri­metro obtido: " + ret.calcularPerimetro());
    }
}
