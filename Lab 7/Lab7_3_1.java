// Define the Transport interface
interface Transport {
    void deliver();
}

// Define the abstract class Animal
abstract class Animal {
    // This class serves as the superclass for Tiger, Camel, Deer, and Donkey
}

// Define the Tiger class which extends Animal
class Tiger extends Animal {
    // Tiger-specific implementation
}

// Define the Camel class which extends Animal and implements Transport
class Camel extends Animal implements Transport {
    // Implement the deliver method from the Transport interface
    public void deliver() {
        System.out.println("Camel is delivering cargo.");
    }
}

// Define the Deer class which extends Animal
class Deer extends Animal {
    // Deer-specific implementation
}

// Define the Donkey class which extends Animal and implements Transport
class Donkey extends Animal implements Transport {
    // Implement the deliver method from the Transport interface
    public void deliver() {
        System.out.println("Donkey is delivering goods.");
    }
}

public class Lab7_3_1 {
    public static void main(String[] args) {
        // Initialize an array of four Animal objects
        Animal[] animals = new Animal[4];
        animals[0] = new Tiger();
        animals[1] = new Camel();
        animals[2] = new Deer();
        animals[3] = new Donkey();

        // Loop through the array and check if each object implements the Transport interface
        for (Animal animal : animals) {
            // Check if the object implements the Transport interface
            if (animal instanceof Transport) {
                // If it does, invoke the deliver method
                ((Transport) animal).deliver();
            }
        }
    }
}
