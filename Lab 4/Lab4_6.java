/**
 * Lab4_6
 */

 public class Lab4_6 {
    public static void main(String[] args) {
        int length = args.length;
        for(int i = 0 ; i < length ; i++) {
            if(args[i].charAt(0) < 65 || args[i].charAt(0) > 90){
                System.out.println("Error : String at index " + i + "("+args[i]+") does not begin with Uppercase Letter" );
                return; // can also use flag method instead
            }
        }
        System.out.println("All Strings in args starts with Uppercase Letter");
    }
    
}