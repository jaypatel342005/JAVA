import java.util.Scanner;
public class Lab4_2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String line = sc.nextLine().toLowerCase();
        int vowels = 0;
        int consonants = 0;
        for(int i=0;i<line.length();i++){
        char ch=line.charAt(i);
        if(ch>='a'||ch<='z')
        {
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                vowels++;
            }
            else
            {
            consonants++;
            }
        }
        }
        System.out.println("No. of vowel: "+vowels);
        System.out.println("No. of consonants: "+consonants);
        }
    }