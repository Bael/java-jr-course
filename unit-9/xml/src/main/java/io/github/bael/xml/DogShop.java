package io.github.bael.xml;

public class DogShop implements PetService {
    @Override
    public Pet adorablePet() {
        return new Dog();
    }
}
