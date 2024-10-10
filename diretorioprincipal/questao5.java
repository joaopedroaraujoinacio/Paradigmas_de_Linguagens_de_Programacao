//atividade 06/09/24
//aluno: João Pedro Araújo Inácio
//questao5

import java.util.ArrayList;
import java.util.List;

public class questao5 {

    static abstract class Animal {
        protected String nome;

        public Animal(String nome) {
            this.nome = nome;
        }

        public abstract String som();
    }

    static class Cachorro extends Animal {
        public Cachorro(String nome) {
            super(nome);
        }

        @Override
        public String som() {
            return this.nome + " late ruf ruf";
        }
    }

    static class Gato extends Animal {
        public Gato(String nome) {
            super(nome);
        }

        @Override
        public String som() {
            return this.nome + " mia miau";
        }
    }

    public static void emitirSons(List<Animal> animais) {
        for (Animal animal : animais) {
            System.out.println(animal.som());
        }
    }

    public static void main(String[] args) {

        List<Animal> animais = new ArrayList<>();
        animais.add(new Cachorro("lua"));
        animais.add(new Gato("Mel"));

        emitirSons(animais);
    }
}
