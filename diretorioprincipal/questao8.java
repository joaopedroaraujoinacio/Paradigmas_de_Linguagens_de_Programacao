//atividade 06/09/24
//aluno: João Pedro Araújo Inácio
//questao8

import java.util.ArrayList;
import java.util.List;

class Empregado {
    private String nome;
    private String cargo;
    private double salario;

    public Empregado(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String exibirInfo() {
        return "nome: " + nome + ", cargo: " + cargo + ", salario: " + salario;
    }
}

class Empresa {
    private String nomeEmpresa;
    private List<Empregado> empregados;

    public Empresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
        this.empregados = new ArrayList<>();
    }

    public void adicionarEmpregado(Empregado empregado) {
        empregados.add(empregado);
    }

    public void exibirEmpregados() {
        System.out.println("funcionarios da " + nomeEmpresa + ":");
        for (Empregado empregado : empregados) {
            System.out.println(empregado.exibirInfo());
        }
    }

    public static void main(String[] args) {
        Empresa empresa = new Empresa("COSTAMAR");
        Empregado emp1 = new Empregado("marcos", "PM", 3333);
        Empregado emp2 = new Empregado("luiz", "PO", 4000);

        empresa.adicionarEmpregado(emp1);
        empresa.adicionarEmpregado(emp2);

        empresa.exibirEmpregados();
    }
}
