//atividade 06/09/24
//aluno: João Pedro Araújo Inácio
//questao4

import java.util.ArrayList;
import java.util.List;

abstract class Animal {
    protected String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public abstract String som(); 
}

class Cachorro extends Animal {
    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public String som() {
        return nome + " late ruf ruf";
    }
}

class Gato extends Animal {
    public Gato(String nome) {
        super(nome);
    }

    @Override
    public String som() {
        return nome + " mia meow";
    }
}

class questao4 {
    public static void emitirSons(List<Animal> animais) {
        for (Animal animal : animais) {
            System.out.println(animal.som());
        }
    }

    public static void main(String[] args) {
        Animal cachorro = new Cachorro("noah");
        Animal gato = new Gato("yoyo");

        List<Animal> animais = new ArrayList<>();
        animais.add(cachorro);
        animais.add(gato);

        emitirSons(animais);
    }
}