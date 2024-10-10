//atividade 06/09/24
//aluno: João Pedro Araújo Inácio
//questao10

public class questao10 {

    public int somar(int a, int b) {
        return a + b;
    }

    public int somar(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        questao10 calc = new questao10();
        
        System.out.println("Soma de 2 numeros: " + calc.somar(10, 20));
        System.out.println("soma de 3 numeros: " + calc.somar(10, 20, 30));
    }
}
