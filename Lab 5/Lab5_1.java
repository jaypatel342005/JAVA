class Square {
    double area;
    double area (int r){
        int ans;

        area = r * r;

        return area;
    }    
}
public class Lab5_1{
    public static void main(String[] args) {
        Square s1 = new Square();
        double ans = s1.area(4);
        System.out.println(ans);
    }
}    