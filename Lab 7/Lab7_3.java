interface Transport {
    void deliver();
}

abstract class Animal {
    
}

class Tiger extends Animal {

}

class Camel extends Animal implements Transport {
    @Override
    public void deliver() {
        System.out.println("Camel is delivering goods.");
    }
}

class Deer extends Animal {

}

class Donkey extends Animal implements Transport {
    @Override
    public void deliver() {
        System.out.println("Donkey is delivering goods.");
    }
}

public class Lab7_3 {
    public static void main(String[] args) {
        Animal[] animals = {new Tiger(), new Camel(), new Deer(), new Donkey()};

        for (Animal animal : animals) {
            if (animal instanceof Transport) {
                Transport transportAnimal = (Transport) animal;
                transportAnimal.deliver();
            }
        }
    }
}
