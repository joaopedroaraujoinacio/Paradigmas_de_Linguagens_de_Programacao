//atividade 06/09/24
//aluno: João Pedro Araújo Inácio
//questao13


public class questao13 {

    public static int fatorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * fatorial(n - 1);
        }
    }

    public static void main(String[] args) {

        System.out.println(questao13.fatorial(4));  
    }
}
