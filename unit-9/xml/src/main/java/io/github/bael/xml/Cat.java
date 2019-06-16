package io.github.bael.xml;


public class Cat extends Pet {
    @Override
    public String speak() {
        return "mewow";
    }

    private Toy toy;

    @Override
    public Toy toy() {
        return toy;
    }


    void setToy(Toy toy) {
        this.toy = toy;
    }
}
