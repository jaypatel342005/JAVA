abstract class vegetable {
    String color;
    String vegetable_name;

    vegetable(String color, String vegetable_name) {
        this.color = color;
        this.vegetable_name = vegetable_name;
    }

    abstract String display();

}

class Potato extends vegetable {
    Potato() {
        super("Brown", "Potato");
    }

    String display() {
        return "I am a " + this.color + " " + this.vegetable_name;
    }
}

class Brinjal extends vegetable {
    Brinjal() {
        super("Red & Green", "Brinjal");
    }

    String display() {
        return "I am a " + this.color + " " + this.vegetable_name;
    }

}

class Tomato extends vegetable {
    Tomato() {
        super("Red", "Tomato");
    }

    String display() {
        return "I am a " + this.color + " " + this.vegetable_name;
    }
}

public class Lab7_1 {
    public static void main(String[] args) {
        vegetable v = new Potato();
        vegetable v1 = new Brinjal();
        vegetable v2 = new Tomato();

        
        System.out.println(v.display());
        System.out.println(v1.display());
        System.out.println(v2.display());

    }

}