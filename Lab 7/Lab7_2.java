
interface A {
    int CONSTANT_A = 1;

    void printA();
}

interface A1 extends A {
    int CONSTANT_A1 = 11;

    void printA1();
}

interface A2 extends A {
    int CONSTANT_A2 = 21;

    void printA2();
}

interface A12 extends A1, A2 {
    int CONSTANT_A12 = 111;

    void printA12();
}

class B implements A12 {

    @Override
    public void printA() {
        System.out.println("Constant A: " + CONSTANT_A);
    }

    @Override
    public void printA1() {
        System.out.println("Constant A1: " + CONSTANT_A1);
    }

    @Override
    public void printA2() {
        System.out.println("Constant A2: " + CONSTANT_A2);
    }

    @Override
    public void printA12() {
        System.out.println("Constant A12: " + CONSTANT_A12);
    }
 
}

public class Lab7_2 {

    public static void main(String[] args) {
        B b = new B();
        b.printA();
        b.printA1();
        b.printA2();
        b.printA12();
    }
}