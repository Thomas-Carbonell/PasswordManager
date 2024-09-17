import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class readTxt {
    private final String filePath;

    public readTxt(String filepath){
        this.filePath = filepath;
    }

    public List<Character> readFile() throws IOException
    {
        List<Character> charList = new ArrayList<>();     
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))){
            String st;

            while ((st=br.readLine())!=null){
                for(char letter : st.toCharArray()){
                    charList.add(letter);
                }
            }
        }
        return charList;
    }
    
}
