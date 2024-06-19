package in.gourab.animal;

interface AnimalWorld {
    void makeSound();
}

interface Pet {
    void play();
}

class Dog implements AnimalWorld, Pet {
    public void makeSound() {
        System.out.println("Woof");
    }

    public void play() {
        System.out.println("Playing fetch");
    }
}
class test{
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
    }
}
