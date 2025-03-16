package generic.ex4;

import generic.animal.Animal;

public class ComplexBox<T extends Animal> {

    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public <T> T printAndReturn(T t) {
        System.out.println("aniaml.className:   " + animal.getClass());
        System.out.println("t.className:   " + t.getClass().getName());
        return t;
    }
}
