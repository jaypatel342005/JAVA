/**
 * Lab5_7
 */
class Box{
    double length;
    double breadth;
    double height;

    Box(){
        length = 10;
        breadth = 10;
        height = 10;
    }
    Box(double length, double breadth, double height){
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }
    void  volumeOfBox(){
        double volume = length * breadth * height;
        System.out.println("Volume of the Box : "+volume);
    }
}
public class Lab5_7 {
    public static void main(String[] args) {
        Box b1 = new Box(10,20,30);
        b1.volumeOfBox();
    }
    
}