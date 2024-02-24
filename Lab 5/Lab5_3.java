import java.util.Scanner;
class Sentence {
    int counta;
    int counte;
    int counti;
    int counto;
    int countu;
    public Sentence()
    {
        this.counta=0;
        this.counte=0;
        this.counti=0;
        this.counto=0;
        this.countu=0;
    }
    public void processSentences(String s1){
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i) == 'a' || s1.charAt(i) == 'A'){
                counta++;
            }
            if(s1.charAt(i) == 'e' || s1.charAt(i) == 'E'){
                counte++;
            }
            if(s1.charAt(i) == 'i' || s1.charAt(i) == 'I'){
                counti++;
            }
            if(s1.charAt(i) == 'o' || s1.charAt(i) == 'O'){
                counto++;
            }
            if(s1.charAt(i) == 'u' || s1.charAt(i) == 'U'){
                countu++;
            }
        }
    }
}
public class Lab5_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sentence sentence = new Sentence();
        while (true){
            System.out.println("Please enter a sentence:");
            String s1 = sc.nextLine();
            if(s1.equalsIgnoreCase("quit"))
            {
                break;
            }
            else
            {
                sentence.processSentences(s1);
            }
        }
        System.out.println("a = " + sentence.counta);
        System.out.println("e = " + sentence.counte);
        System.out.println("i = " + sentence.counti);
        System.out.println("o = " + sentence.counto);
        System.out.println("u = " + sentence.countu);
    }    
}
