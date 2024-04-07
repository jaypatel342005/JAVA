import java.io.*;
public class Lab10_1 {

    public static void main(String[] args) {
        try {
            File f1 = new File("File.txt");
            
            if (!f1.exists()) {
                throw new FileNotFoundException("File not found.");
            }
            
            int charCount = 0;
            int wordCount = 0;
            int lineCount = 0;
            
            FileReader fileReader = new FileReader(f1);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            String line = bufferedReader.readLine();
            
            while (line != null) {
                lineCount++;
                charCount += line.length();
                String[] words = line.trim().split(" ");
                wordCount += words.length;
                line = bufferedReader.readLine();
            }
            
            bufferedReader.close();
            
            System.out.println("characters: " + charCount);
            System.out.println("words: " + wordCount);
            System.out.println("lines: " + lineCount);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}