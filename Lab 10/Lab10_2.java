import java.io.*;
import java.util.Scanner;
public class Lab10_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            File f1 = new File("File1.txt");
            File f2 = new File("File2.txt");

        System.out.println("Enter word1 : ");
        String word1 = sc.next();
        System.out.println("Enter word2 : ");
        String word2 = sc.next();
            BufferedReader r1 = new BufferedReader(new FileReader(f1));
            BufferedWriter w2 = new BufferedWriter(new FileWriter(f2));

            String line = r1.readLine();
            int c = 0;

            while (line != null) {
                String changedLine = "";

                String a[]=line.split(" ");
                
                for(int i=0;i<a.length;i++){
                    if(a[i].equals(word1)){
                        c++;
                        changedLine+=word2+" ";
                    }else{
                        changedLine+=a[i]+" ";
                    }
                }
                
                w2.write(changedLine);
                w2.newLine();
                line = r1.readLine();
            }

            r1.close();
            w2.close();

            System.out.println("Replacements Counts: " + c);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}