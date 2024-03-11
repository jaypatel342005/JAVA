// Define the EventListener interface with the performEvent() method
interface EventListener {
    void performEvent();
}

// Define the MouseListener interface which inherits EventListener
interface MouseListener extends EventListener {
    void mouseClicked();
    void mousePressed();
    void mouseReleased();
    void mouseMoved();
    void mouseDragged();
}

// Define the KeyListener interface which inherits EventListener
interface KeyListener extends EventListener {
    void keyPressed();
    void keyReleased();
}

// EventDemo class which implements both MouseListener and KeyListener
class EventDemo implements MouseListener, KeyListener {
    // Implementing methods from MouseListener
    public void mouseClicked() {
        System.out.println("Mouse clicked");
    }

    public void mousePressed() {
        System.out.println("Mouse pressed");
    }

    public void mouseReleased() {
        System.out.println("Mouse released");
    }

    public void mouseMoved() {
        System.out.println("Mouse moved");
    }

    public void mouseDragged() {
        System.out.println("Mouse dragged");
    }

    // Implementing methods from KeyListener
    public void keyPressed() {
        System.out.println("Key pressed");
    }

    public void keyReleased() {
        System.out.println("Key released");
    }

    // Implementing method from EventListener (inherited by both interfaces)
    public void performEvent() {
        System.out.println("Event performed");
    }
}

public class Lab7_4 {
    public static void main(String[] args) {
        // Create an instance of EventDemo
        EventDemo eventDemo = new EventDemo();

        // Demonstrate MouseListener methods
        eventDemo.mouseClicked();
        eventDemo.mousePressed();
        eventDemo.mouseReleased();
        eventDemo.mouseMoved();
        eventDemo.mouseDragged();

        // Demonstrate KeyListener methods
        eventDemo.keyPressed();
        eventDemo.keyReleased();

        // Demonstrate performEvent method inherited from EventListener
        eventDemo.performEvent();
    }
}

