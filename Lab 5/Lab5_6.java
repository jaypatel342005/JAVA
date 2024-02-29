class obj {
    static int count = 0;

    obj() {
        count++;
    }
}

public class Lab5_6 {
    public static void main(String[] args) {
        obj o1 = new obj();
        obj o2 = new obj();
        obj o3 = new obj();
        System.out.println(obj.count);

    }
}