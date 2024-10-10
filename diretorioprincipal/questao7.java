//atividade 06/09/24
//aluno: João Pedro Araújo Inácio
//questao7

import java.util.ArrayList;
import java.util.List;

class Professor {
    private String nome;
    private List<Escola> escolas;

    public Professor(String nome) {
        this.nome = nome;
        this.escolas = new ArrayList<>();
    }

    public void adicionarEscola(Escola escola) {
        if (!escolas.contains(escola)) {
            escolas.add(escola);
            escola.adicionarProfessor(this);
        }
    }

    public String getNome() {
        return nome;
    }

    public List<Escola> getEscolas() {
        return escolas;
    }
}

class Escola {
    private String nome;
    private List<Professor> professores;

    public Escola(String nome) {
        this.nome = nome;
        this.professores = new ArrayList<>();
    }

    public void adicionarProfessor(Professor professor) {
        if (!professores.contains(professor)) {
            professores.add(professor);
        }
    }

    public String getNome() {
        return nome;
    }

    public List<Professor> getProfessores() {
        return professores;
    }
}

public class questao7 {
    public static void main(String[] args) {
        Escola escola1 = new Escola("motiva");
        Escola escola2 = new Escola("carl rogers");

        Professor professor1 = new Professor("alex");
        Professor professor2 = new Professor("binho");

        professor1.adicionarEscola(escola1);
        professor1.adicionarEscola(escola2);
        professor2.adicionarEscola(escola1);

        System.out.println("professores na " + escola1.getNome() + ":");
        for (Professor p : escola1.getProfessores()) {
            System.out.println(p.getNome());
        }

        System.out.println("professores na " + escola2.getNome() + ":");
        for (Professor p : escola2.getProfessores()) {
            System.out.println(p.getNome());
        }

        System.out.println("escolas do " + professor1.getNome() + ":");
        for (Escola e : professor1.getEscolas()) {
            System.out.println(e.getNome());
        }

        System.out.println("escolas do " + professor2.getNome() + ":");
        for (Escola e : professor2.getEscolas()) {
            System.out.println(e.getNome());
        }
    }
}

