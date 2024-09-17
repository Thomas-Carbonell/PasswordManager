import java.util.List;

public class Main {
    public static void main(String [] args) {
        List<Character> charArray = null;
        try {
            readTxt file = new readTxt("C:\\Users\\Thomas\\OneDrive\\Documents\\Documents\\PasswordManager\\AllowedCharacters.txt");
            charArray = file.readFile();
            GeneratePassword pass = new GeneratePassword(10, charArray);
            String Password = pass.ReturnPassword();
            System.out.println(Password);
        } catch (Exception e) {
            System.err.println(e);
        }

    }
}