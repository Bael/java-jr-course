package io.github.bael.xml;

public class CatShop implements PetService {
    @Override
    public Pet adorablePet() {
        return new Cat();
    }
}
