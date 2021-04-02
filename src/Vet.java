public class Vet {
    private Animal cat;
    private Animal hamster;
    private Animal dog;
    private Animal horse;


    public Vet() {
        cat = new Cat();
        hamster = new Hamster();
        dog = new Dog();
        horse = new Horse();
    }

    public void examinedCat() {
        cat.examine();
    }

    public void examinedDod() {
        dog.examine();
    }

    public void examinedHamster() {
        hamster.examine();
    }

    public void examinedHorse() {
        horse.examine();
    }

}
