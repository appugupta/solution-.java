import java.io.BufferedReader;  
import java.io.FileReader;  
  
public class CountWordFile  
{  
    public static void main(String[] args) throws Exception {  
        String line;  
        int count = 0;  
  
        FileReader file = new FileReader("data.txt ");  
        BufferedReader br = new BufferedReader(file);  
  
        while((line = br.readLine()) != null) {  
            //Splits each line into words  
            String words[] = line.split("");  
            //Counts each word  
            count = count + words.length;  
  
        }  
  
        System.out.println("Number of words present in given file: " + count);  
        br.close();  
    }  
}  
